package com.tl.androidnativedemo.navigation72.procicle;

import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.tl.androidnativedemo.R;
import com.tl.androidnativedemo.base.BaseActivity;

/**
 * Created by tianlin on 2018/9/7.
 * Tel : 15071485690
 * QQ : 953108373
 */
public class FindProCicleActivity extends BaseActivity {
    CycleView cycle;
    SeekBar seekbar;
    Button btReCacu;
    TextView tvTimes;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro_cicle);
        initView();
    }

    @Override
    public void initView() {

        seekbar.setProgress(2);
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                cycle.setDELETE_POINT_TIMES(progress + 2);
                cycle.refresh();
                tvTimes.setText(String.valueOf(progress + 2));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void onViewClicked() {
        cycle.refresh();
    }
}
