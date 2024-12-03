package com.tl.androidnativedemo.navigation31;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.ScrollView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.tl.androidnativedemo.R;
import com.tl.androidnativedemo.navigation31.inputlimit.InputLimitActivity;
import com.tl.androidnativedemo.navigation31.parandchild.ParentAndChildActivity;
import com.tl.androidnativedemo.navigation31.recyclereuse.RecyclerReuseActivity;
import com.tl.androidnativedemo.navigation31.transition.ActivityTransition;
import com.tl.androidnativedemo.navigation31.transition.ActivityViewTransition;
import com.tl.androidnativedemo.navigation31.viewanim.ViewAnimActivity;
import com.tl.androidnativedemo.utils.display.DensityUtils;

/**
 * Created by tianlin on 2017/3/18.
 * Tel : 15071485692
 * QQ : 953108373
 * Function :
 */

public class Fragment31 extends Fragment {

    Button btInputLimit;
    Button btRecyclerReuse;
    Button btParentChild;
    Button btViewAnim;
    FloatingActionButton btViewAnimTrans1;
    Button btViewAnimCreateCircularReveal;
    ScrollView scrollView;
    Button btViewStartAndFinish;
    private boolean show = true;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment31, container, false);
        initView();
        return view;
    }

    private void initView() {
    }

    public void onViewClicked(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.bt_input_limit:
                intent = new Intent(getActivity(), InputLimitActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_recycler_reuse:
                intent = new Intent(getActivity(), RecyclerReuseActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_parent_child:
                intent = new Intent(getActivity(), ParentAndChildActivity.class);
                startActivity(intent);
                break;

            case R.id.bt_view_anim:
                intent = new Intent(getActivity(), ViewAnimActivity.class);
                startActivity(intent);
                break;

        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }


    @Override
    public void onResume() {
        super.onResume();

        if (show) {
            btViewAnimTrans1.setVisibility(View.VISIBLE);

        } else {
            btViewAnimTrans1.setVisibility(View.GONE);
        }
    }

    public void bt_view_anim_trans1() {

        show = false;

        String transitionName = ViewCompat.getTransitionName(btViewAnimTrans1) == null ? "" : ViewCompat.getTransitionName(btViewAnimTrans1);
        Log.d("my", "transitionName = " + transitionName);
        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                getActivity(), btViewAnimTrans1, transitionName);

        Intent intent = new Intent(getActivity(), ActivityViewTransition.class);
        startActivity(intent, options.toBundle());

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void bt_view_anim_createCircularReveal() {

        int cx = (btViewAnimCreateCircularReveal.getLeft() + btViewAnimCreateCircularReveal.getRight()) / 2;
        int cy = (btViewAnimCreateCircularReveal.getTop() + btViewAnimCreateCircularReveal.getBottom()) / 2;

        Animator anim = ViewAnimationUtils.createCircularReveal(scrollView,
                cx,
                cy,
                0,
                DensityUtils.getScreenHeight(getActivity()));
        anim.setDuration(500);
        anim.setInterpolator(new AccelerateDecelerateInterpolator());

        anim.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
            }

            @Override
            public void onAnimationStart(Animator animation) {
                super.onAnimationStart(animation);
            }
        });

        anim.start();
    }

    public void bt_view_start_and_finish() {

        ActivityOptionsCompat compat = ActivityOptionsCompat.makeCustomAnimation(getActivity(),
                R.anim.activity_tran_in,
                R.anim.activity_out);
        Intent intent = new Intent(getActivity(), ActivityTransition.class);
        startActivity(intent, compat.toBundle());

    }



}
