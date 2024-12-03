package com.tl.androidnativedemo.navigation81;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.tl.androidnativedemo.R;
import com.tl.androidnativedemo.navigation81.realm.RealmTestActivity;
import com.tl.androidnativedemo.navigation81.simplelabel.SimpleLabelActivity;

/**
 * Created by tianlin on 2017/7/17.
 * Tel : 15071485690
 * QQ : 953108373
 * Function :
 */

public class Fragment81 extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment81, container, false);
        return view;
    }

    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
    }

    public void bt_simple_view()
    {
        Intent intent = new Intent(getActivity(), SimpleLabelActivity.class);

        startActivity(intent);
    }

    public void bt_realm()
    {
        Intent intent = new Intent(getActivity(), RealmTestActivity.class);
        startActivity(intent);
    }
}
