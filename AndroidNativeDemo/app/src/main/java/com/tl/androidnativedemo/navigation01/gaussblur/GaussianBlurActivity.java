package com.tl.androidnativedemo.navigation01.gaussblur;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.tl.androidnativedemo.R;
import com.tl.androidnativedemo.base.BaseActivity;

/**
 * Created by tianlin on 2018/5/29.
 * Tel : 15071485690
 * QQ : 953108373
 */

public class GaussianBlurActivity extends BaseActivity
{
    Button bt1;
    Button bt2;

    @Override
    public void initView()
    {

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gauss_blur);
    }

    public void onBt1Clicked()
    {
        Intent intent = new Intent(this, GaussianBlurImageActivity.class);
        startActivity(intent);
    }

    public void onBt2Clicked()
    {
        Intent intent = new Intent(this, GaussianBlurNoImageActivity.class);
        startActivity(intent);
    }
}
