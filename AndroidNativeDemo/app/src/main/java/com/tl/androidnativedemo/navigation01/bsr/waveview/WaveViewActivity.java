package com.tl.androidnativedemo.navigation01.bsr.waveview;

import android.os.Bundle;
import android.widget.SeekBar;

import androidx.annotation.Nullable;

import com.tl.androidnativedemo.R;
import com.tl.androidnativedemo.base.BaseActivity;

/**
 * Created by tianlin on 2018/7/23.
 * Tel : 15071485690
 * QQ : 953108373
 */
public class WaveViewActivity extends BaseActivity {

    WaveView wv;
    SeekBar sbProgress;
    SeekBar sbAmplitude;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wave_view);

        initView();
    }

    @Override
    public void initView() {

        wv.startAnim();

        sbProgress.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                // 0 - 0
                // 100 - hight * 0.9
                // pro - x
                wv.setmWaveHeight(seekBar.getProgress());

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbAmplitude.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                wv.setmWaveAmplitude(seekBar.getProgress());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
