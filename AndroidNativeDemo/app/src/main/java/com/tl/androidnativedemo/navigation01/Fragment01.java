package com.tl.androidnativedemo.navigation01;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.tl.androidnativedemo.R;
import com.tl.androidnativedemo.navigation01.behavior.BehaviorActivity;
import com.tl.androidnativedemo.navigation01.bsr.BeiSaiErActivity;
import com.tl.androidnativedemo.navigation01.floatintop.FloatInTopActivity;
import com.tl.androidnativedemo.navigation01.gaussblur.GaussianBlurActivity;
import com.tl.androidnativedemo.navigation01.liaotian.LiaotianActivity;
import com.tl.androidnativedemo.navigation01.searchview.SearchViewActivity;
import com.tl.androidnativedemo.navigation01.useapi.UseApiActivity;

/**
 * Created by tianlin on 2017/3/6.
 * Tel : 15071485692
 * QQ : 953108373
 * Function :
 */

public class Fragment01 extends Fragment
{

    Button f01Fab4;
    Button f01Fab1;
    Button f01Fab3;
    Button f01Fab5;
    Button f01Fab7;
    Button f01Fab8;
    Button f01Fab9;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment01, container, false);

        return view;
    }

    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.f01_fab1:
                Intent intent1 = new Intent(getActivity(), LiaotianActivity.class);
                startActivity(intent1);
                break;
            case R.id.f01_fab3:
                Intent intent = new Intent(getActivity(), SearchViewActivity.class);
                startActivity(intent);
                break;
        }
    }


    public void f01_fab4()
    {
        Intent intent = new Intent(getActivity(), FloatInTopActivity.class);
        startActivity(intent);
    }

    public void secondGroup(View view)
    {
        Intent intent = null;
        switch (view.getId())
        {
            case R.id.f01_fab5:
                intent = new Intent(getActivity(), BehaviorActivity.class);
                startActivity(intent);
                break;
            case R.id.f01_fab7:
                intent = new Intent(getActivity(), UseApiActivity.class);
                startActivity(intent);

                break;
        }

    }

    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
    }

    public void f01_fab8()
    {
        Intent intent = new Intent(getContext(), BeiSaiErActivity.class);
        startActivity(intent);
    }

    public void f01_fab9()
    {
        Intent intent = new Intent(getContext(), GaussianBlurActivity.class);
        startActivity(intent);
    }
}
