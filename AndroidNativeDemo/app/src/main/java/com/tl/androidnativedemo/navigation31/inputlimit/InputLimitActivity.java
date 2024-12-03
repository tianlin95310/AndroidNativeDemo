package com.tl.androidnativedemo.navigation31.inputlimit;

import android.os.Bundle;
import android.text.InputFilter;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

import com.tl.androidnativedemo.R;
import com.tl.androidnativedemo.base.BaseActivity;
import com.tl.androidnativedemo.utils.edittext.AutoDelZero4ET;
import com.tl.androidnativedemo.utils.edittext.AutoDelZero4ET4Double;
import com.tl.androidnativedemo.utils.edittext.InputFilterUtils;

/**
 * Created by tianlin on 2017/7/20.
 * Tel : 15071485690
 * QQ : 953108373
 * Function :
 */

public class InputLimitActivity extends BaseActivity
{
    EditText f301Et1;
    EditText f301Et3;
    EditText f301Et;
    Button f301Bt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_limit);
        initView();
    }

    @Override
    public void initView()
    {
        // 总结
        // 1，Filter的调用顺序是一个接着一个的，如果第一个Filter返回了空，那么空将会是第二个filter的source输入
        //     最好是将同种类型的InputFilter写在同一个函数中
        // 2，在一次输入中，或者setText中，所有的Filter中的dstart都是一样的

        // editText1 自动去掉0，默认为空
        f301Et1.setFilters(new InputFilter[]{InputFilterUtils.banZeroBegin()});
        f301Et1.addTextChangedListener(new AutoDelZero4ET(f301Et1)
        {
        });

        // editText3
        f301Et3.addTextChangedListener(new AutoDelZero4ET4Double(f301Et3));
    }

    public void onViewClicked()
    {
        // setText对TextView的影响是让dest变成""的，而source就是设置的内容
        f301Et.setText("test");
    }
}
