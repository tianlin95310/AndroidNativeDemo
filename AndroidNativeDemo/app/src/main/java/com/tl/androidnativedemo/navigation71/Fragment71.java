package com.tl.androidnativedemo.navigation71;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.tl.androidnativedemo.R;
import com.tl.androidnativedemo.navigation71.autoR.AutoRefreshActivity;
import com.tl.androidnativedemo.navigation71.check.OnKeyCheckActivity;
import com.tl.androidnativedemo.navigation71.index.IndexViewActivity;
import com.tl.androidnativedemo.navigation71.menu.ShanXingMenuActivity;
import com.tl.androidnativedemo.navigation71.pullrefresh.TLPullRefActivity;
import com.tl.androidnativedemo.navigation71.shanxing.ShanXingRatioActivity;
import com.tl.androidnativedemo.navigation71.shanxingpro.ShanXingProgressActivity;
import com.tl.androidnativedemo.navigation71.tiaoxingtu.TiaoXingTuActivity;

/**
 * Created by tianlin on 2017/7/7.
 * Tel : 15071485690
 * QQ : 953108373
 * Function :
 */

public class Fragment71 extends Fragment {
    Button bt1F702;
    Button bt1F71;
    Button bt1F72;
    Button bt1F73;
    Button bt1F74;
    Button bt1F75;
    Button bt1F76;
    Button bt1F8;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment71, container, false);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    public void bt1_f702() {
        Intent intent = new Intent(getActivity(), OnKeyCheckActivity.class);
        startActivity(intent);
    }

    public void bt1_f71() {
        Intent intent = new Intent(getActivity(), TLPullRefActivity.class);
        startActivity(intent);
    }

    public void bt1_f72() {
        Intent intent = new Intent(getActivity(), TiaoXingTuActivity.class);
        startActivity(intent);
    }

    public void bt1_f73() {
        Intent intent = new Intent(getActivity(), ShanXingRatioActivity.class);
        startActivity(intent);
    }

    public void bt1_f74() {
        Intent intent = new Intent(getActivity(), ShanXingMenuActivity.class);
        startActivity(intent);
    }

    public void bt1_f75() {
        Intent intent = new Intent(getActivity(), ShanXingProgressActivity.class);
        startActivity(intent);
    }

    public void bt1_f76() {
        Intent intent = new Intent(getActivity(), AutoRefreshActivity.class);
        startActivity(intent);
    }

    public void bt1_f8() {
        Intent intent = new Intent(getActivity(), IndexViewActivity.class);
        startActivity(intent);
    }
}
