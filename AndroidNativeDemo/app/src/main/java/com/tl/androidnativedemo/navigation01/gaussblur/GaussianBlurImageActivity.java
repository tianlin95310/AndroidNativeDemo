package com.tl.androidnativedemo.navigation01.gaussblur;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.Log;
import android.widget.ImageView;
import android.widget.SeekBar;

import androidx.annotation.Nullable;

import com.tl.androidnativedemo.R;
import com.tl.androidnativedemo.base.BaseActivity;
import com.tl.androidnativedemo.utils.thread.ThreadManager;

/**
 * Created by tianlin on 2018/5/29.
 * Tel : 15071485690
 * QQ : 953108373
 */

public class GaussianBlurImageActivity extends BaseActivity
{

    ImageView iv;
    SeekBar sb;

    public Bitmap blurBitmap(Bitmap bitmap, float radius)
    {
        //Let's create an empty bitmap with the same size of the bitmap we want to blur
        Bitmap outBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);

        //Instantiate a new Renderscript
        RenderScript rs = RenderScript.create(getApplicationContext());

        //Create an Intrinsic Blur Script using the Renderscript
        ScriptIntrinsicBlur blurScript = ScriptIntrinsicBlur.create(rs, Element.U8_4(rs));

        //Create the Allocations (in/out) with the Renderscript and the in/out bitmaps
        Allocation allIn = Allocation.createFromBitmap(rs, bitmap);
        Allocation allOut = Allocation.createFromBitmap(rs, outBitmap);

        //Set the radius of the blur: 0 < radius <= 25
        blurScript.setRadius(radius);

        //Perform the Renderscript
        blurScript.setInput(allIn);
        blurScript.forEach(allOut);

        //Copy the final bitmap created by the out Allocation to the outBitmap
        allOut.copyTo(outBitmap);

        //recycle the original bitmap
//        bitmap.recycle();

//        After finishing everything, we destroy the Renderscript.
        rs.destroy();

        return outBitmap;

    }

    @Override
    public void initView()
    {
        sb.setMax(20);

        sb.setProgress(10);
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            @Override
            public void onProgressChanged(final SeekBar seekBar, int progress, boolean fromUser)
            {
                ThreadManager.execute(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        Log.d("my", "seekBar.getProgress() = " + seekBar.getProgress());
                        final Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.toolbar_bg);
                        Bitmap blur = blurBitmap(bmp, seekBar.getProgress() + 1);

                        refresh(blur);
                    }
                });
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar)
            {

            }
        });
    }

    private void refresh(final Bitmap blur)
    {
        runOnUiThread(new Runnable()
        {
            @Override
            public void run()
            {
                iv.setImageBitmap(blur);
            }
        });
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gauss_blur_image);

        initView();
    }
}
