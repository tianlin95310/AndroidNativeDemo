package com.tl.androidnativedemo.navigation42;

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
import com.tl.androidnativedemo.navigation42.draw.OpenGLDrawActivity;

/**
 * Created by tianlin on 2018/12/18.
 * Tel : 15071485690
 * QQ : 953108373
 */
public class Fragment42 extends Fragment {
    Button btF421;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_42, container, false);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    public void onViewClicked() {
        Intent intent = new Intent(getActivity(), OpenGLDrawActivity.class);
        startActivity(intent);
    }
}
