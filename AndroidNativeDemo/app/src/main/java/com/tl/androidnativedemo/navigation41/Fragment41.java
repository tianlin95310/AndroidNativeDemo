package com.tl.androidnativedemo.navigation41;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.tl.androidnativedemo.R;
import com.tl.androidnativedemo.navigation41.imagescale.ImageScaleActivity;
import com.tl.androidnativedemo.navigation41.imgdivide.ImageDivideActivity;
import com.tl.androidnativedemo.navigation41.mntimage.MntImageActivity;
import com.tl.androidnativedemo.navigation41.paintshade.PaintShadeActivity;

/**
 * Created by tianlin on 2017/4/17.
 * Tel : 15071485692
 * QQ : 953108373
 * Function :
 */

public class Fragment41 extends Fragment implements View.OnClickListener
{

    LinearLayout linearLayout;
    Button btPhotoScale;
    Button btPhoto2;
    Button btPhoto3;
    Button btPhoto4;
    Button btPhoto5;
    LinearLayout ll41;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment41, container, false);

        linearLayout = (LinearLayout) view.findViewById(R.id.ll_41);

        for (int i = 0; i < linearLayout.getChildCount(); i++)
        {
            linearLayout.getChildAt(i).setOnClickListener(this);
        }
        return view;
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.bt_photo_scale:
                Intent intent = new Intent(getActivity(), ImageDivideActivity.class);
                startActivity(intent);
                break;

        }
    }

    @Override
    public void onDestroyView()
    {
        super.onDestroyView();

    }

    public void bt_photo2()
    {
        Intent intent = new Intent(getActivity(), ImageScaleActivity.class);
        startActivity(intent);
    }

    public void bt_photo3()
    {
        Intent intent = new Intent(getActivity(), MntImageActivity.class);
        startActivity(intent);
    }

    public void bt_photo4()
    {
        Intent intent = new Intent(getActivity(), PaintShadeActivity.class);
        startActivity(intent);
    }

    public void onViewClicked()
    {
        Rect rect1 = new Rect();
        rect1.left = 0;
        rect1.top = 0;
        rect1.right = 100;
        rect1.bottom = 100;

        Rect rect2 = new Rect();
        rect2.left = 0;
        rect2.top = 100;
        rect2.right = 100;
        rect2.bottom = 200;

        Log.d("my", "intersect = " + rect1.intersect(rect2));
    }
}
