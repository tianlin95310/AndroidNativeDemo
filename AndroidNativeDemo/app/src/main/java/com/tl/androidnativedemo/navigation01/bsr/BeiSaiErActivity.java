package com.tl.androidnativedemo.navigation01.bsr;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.tl.androidnativedemo.R;
import com.tl.androidnativedemo.base.BaseActivity;
import com.tl.androidnativedemo.navigation01.bsr.bubble.BubbleActivity;
import com.tl.androidnativedemo.navigation01.bsr.cyclebubblewave.CycleBubbleWaveActivity;
import com.tl.androidnativedemo.navigation01.bsr.element.ElementAddShopActivity;
import com.tl.androidnativedemo.navigation01.bsr.flowwater.PathFlowWaterActivity;
import com.tl.androidnativedemo.navigation01.bsr.waveview.WaveViewActivity;

/**
 * Created by tianlin on 2017/12/22.
 * Tel : 15071485690
 * QQ : 953108373
 */

public class BeiSaiErActivity extends BaseActivity {
    Button btElementAddShop;
    Button btFloatWater;
    Button btBubble;
    Button btZhanBubble;
    Button btCycleBubble;

    @Override
    public void initView() {

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bei_sai_er);
    }

    public void bt_element_add_shop() {
        Intent intent = new Intent(this, ElementAddShopActivity.class);
        startActivity(intent);
    }

    public void bt_float_water() {
        Intent intent = new Intent(this, PathFlowWaterActivity.class);
        startActivity(intent);
    }

    public void bt_bubble() {
        Intent intent = new Intent(this, BubbleActivity.class);
        startActivity(intent);
    }

    public void bt_zhan_bubble() {
        Intent intent = new Intent(this, WaveViewActivity.class);
        startActivity(intent);
    }

    public void bt_cycle_bubble() {
        Intent intent = new Intent(this, CycleBubbleWaveActivity.class);
        startActivity(intent);
    }
}

