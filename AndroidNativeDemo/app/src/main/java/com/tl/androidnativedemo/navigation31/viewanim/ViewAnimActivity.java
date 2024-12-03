package com.tl.androidnativedemo.navigation31.viewanim;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.core.view.ViewPropertyAnimatorListener;

import com.tl.androidnativedemo.R;
import com.tl.androidnativedemo.base.BaseActivity;
import com.tl.androidnativedemo.utils.anim.AnimUtils;
import com.tl.androidnativedemo.utils.toast.ToastUtils;

/**
 * Created by tianlin on 2017/10/12.
 * Tel : 15071485690
 * QQ : 953108373
 */

public class ViewAnimActivity extends BaseActivity
{

    Button btBig1;
    Button btSmall1;
    TextView tvText1;
    Button btBig2;
    Button btSmall2;
    TextView tvText2;
    TextView tvText3;
    TextView tvText4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_view_anim);
    }

    @Override
    public void initView()
    {

    }

    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.bt_big1:
            {
                Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_scale_in);
                animation.setAnimationListener(new Animation.AnimationListener()
                {
                    @Override
                    public void onAnimationStart(Animation animation)
                    {
                        tvText1.setVisibility(View.VISIBLE);
                    }
                    @Override
                    public void onAnimationEnd(Animation animation)
                    {
                    }
                    @Override
                    public void onAnimationRepeat(Animation animation)
                    {
                    }
                });

                tvText1.startAnimation(animation);
            }
                break;
            case R.id.bt_small1:
            {
                Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_scale_out);

                // 为补间动画设置监听器
                animation.setAnimationListener(new Animation.AnimationListener()
                {
                    @Override
                    public void onAnimationStart(Animation animation)
                    {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation)
                    {
                        tvText1.setVisibility(View.GONE);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation)
                    {

                    }
                });
                tvText1.startAnimation(animation);
                break;
            }
            case R.id.bt_big2:
            {
                Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_scale_in);
                animation.setFillAfter(true);
                tvText2.startAnimation(animation);
            }
                break;
            case R.id.bt_small2:
            {
                Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_scale_out);
                animation.setFillAfter(true);
                tvText2.startAnimation(animation);
                break;
            }
            case R.id.bt_big3:
            {
                AnimUtils.translateX(tvText3, 200, null, 800);
            }
            break;
            case R.id.bt_small3:
            {
                AnimUtils.translateX(tvText3, 0, null, 800);

                break;
            }
            case R.id.bt_big4:
                AnimUtils.scaleShow(tvText4, new ViewPropertyAnimatorListener()
                {
                    @Override
                    public void onAnimationStart(View view)
                    {

                    }

                    @Override
                    public void onAnimationEnd(View view)
                    {

                    }

                    @Override
                    public void onAnimationCancel(View view)
                    {

                    }
                });
                break;
            case R.id.bt_small4:
                AnimUtils.scaleHide(tvText4, new ViewPropertyAnimatorListener()
                {
                    @Override
                    public void onAnimationStart(View view)
                    {

                    }

                    @Override
                    public void onAnimationEnd(View view)
                    {

                    }

                    @Override
                    public void onAnimationCancel(View view)
                    {

                    }
                });
                break;
        }
    }

    public void onTextClick(View view)
    {
        switch (view.getId())
        {
            case R.id.tv_text1:
                ToastUtils.show(this, "tv_text1");
                break;
            case R.id.tv_text2:
                ToastUtils.show(this, "tv_text2");
                break;
            case R.id.tv_text3:
                ToastUtils.show(this, "tv_text3");
                break;
            case R.id.tv_text4:
                ToastUtils.show(this, "tv_text4");
                break;
        }
    }
}
