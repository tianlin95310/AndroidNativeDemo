package com.tl.androidnativedemo.navigation61.callfun;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.tl.androidnativedemo.MainActivity;
import com.tl.androidnativedemo.R;
import com.tl.androidnativedemo.base.ActivityList;
import com.tl.androidnativedemo.base.BaseActivity;

/**
 * Created by tianlin on 2018/2/12.
 * Tel : 15071485690
 * QQ : 953108373
 */

public class CallNotForeFunActivity extends BaseActivity
{
    Button btCall;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_call_not_fore_fun);
        initView();
    }

    @Override
    public void initView()
    {

    }

    public void onViewClicked()
    {
        for (Activity activity : ActivityList.getActivities())
        {
            if (activity instanceof MainActivity)
            {
                MainActivity mainActivity = (MainActivity) activity;

                // 不在前台的应用是会调用的，包括更新UI
                mainActivity.doSomething();
            }
        }
    }
}
