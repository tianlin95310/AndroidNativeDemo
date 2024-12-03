package com.tl.androidnativedemo.navigation72;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.tl.androidnativedemo.R;
import com.tl.androidnativedemo.navigation72.procicle.FindProCicleActivity;

/**
 * Created by tianlin on 2018/9/6.
 * Tel : 15071485690
 * QQ : 953108373
 */
public class Fragment72 extends Fragment {
    Button button1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_72, container, false);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    public void onButton1Clicked() {
        Intent intent = new Intent(getActivity(), FindProCicleActivity.class);
        startActivity(intent);
    }

}
