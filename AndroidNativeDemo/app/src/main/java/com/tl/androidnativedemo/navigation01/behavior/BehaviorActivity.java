package com.tl.androidnativedemo.navigation01.behavior;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.tl.androidnativedemo.R;
import com.tl.androidnativedemo.base.BaseActivity;
import com.tl.androidnativedemo.navigation01.behavior.bottomsheet.BottomSheetActivity;
import com.tl.androidnativedemo.navigation01.behavior.dialog.DialogActivity;
import com.tl.androidnativedemo.navigation01.behavior.doublemove.BehaviorMoveActivity;
import com.tl.androidnativedemo.navigation01.behavior.floataction.FloatActionActivity;
import com.tl.androidnativedemo.navigation01.behavior.likeuc.LikeUCHomeActivity;
import com.tl.androidnativedemo.navigation01.behavior.pullrefresh.PullRefreshActivity;
import com.tl.androidnativedemo.navigation01.behavior.titlebar.TitleBarActivity;

/**
 * Created by tianlin on 2017/10/13.
 * Tel : 15071485690
 * QQ : 953108373
 */

public class BehaviorActivity extends BaseActivity {
    Button f01Fab2;
    Button bt3;
    Button bt1;
    Button bt4;
    Button bt5;
    Button bt7;
    Button bt8;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_behavior);

        initView();
    }

    @Override
    public void initView() {

    }

    public void onViewClicked(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.f01_fab2:
                intent = new Intent(this, FloatActionActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_3:
                break;
        }
    }

    public void bt_1() {
        Intent intent = new Intent(this, BottomSheetActivity.class);
        startActivity(intent);
    }

    public void bt_3() {
        Intent intent = new Intent(this, BehaviorMoveActivity.class);
        startActivity(intent);
    }

    public void bt_group_3(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.bt_4:
                intent = new Intent(this, LikeUCHomeActivity.class);

                startActivity(intent);
                break;
            case R.id.bt_5:

                intent = new Intent(this, PullRefreshActivity.class);

                startActivity(intent);
                break;
        }
    }

    public void bt_7() {
        Intent intent = new Intent(this, DialogActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
    }

    public void bt_8(View view) {
        Intent intent = new Intent(this, TitleBarActivity.class);
        startActivity(intent);
    }
}
