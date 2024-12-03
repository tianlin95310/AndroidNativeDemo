package com.tl.androidnativedemo.navigation61;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.tl.androidnativedemo.BuildConfig;
import com.tl.androidnativedemo.R;
import com.tl.androidnativedemo.navigation61.callfun.CallNotForeFunActivity;
import com.tl.androidnativedemo.navigation61.marktext.MarkTextActivity;
import com.tl.androidnativedemo.navigation61.menulistener.MenuListenerActivity;
import com.tl.androidnativedemo.service.bindservice.BindStartService;

import java.text.SimpleDateFormat;

/**
 * Created by tianlin on 2017/6/26.
 * Tel : 15071485690
 * QQ : 953108373
 * Function :
 */

public class Fragment61 extends Fragment
{

    public SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

    Button btBind;
    Button btSendDataToService;
    Button btGetServiceData;
    Button btFun4;
    Button bt_mark_text;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment61, container, false);

        return view;
    }

    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
    }

    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.bt_bind:
                Intent intent = new Intent(getActivity(), BindStartService.class);
                intent.putExtra("request", "request");
                getActivity().bindService(intent, new MyConnection(), Activity.BIND_AUTO_CREATE);
                break;
            case R.id.bt_send_data_to_service:
                break;
            case R.id.bt_get_service_data:
                break;
        }
    }

    public void bt_mark_text()
    {
        Intent intent = new Intent(getActivity(), MarkTextActivity.class);
        startActivity(intent);
    }

    public void bt_hide_intent()
    {
        Intent intent = new Intent();
        intent.setAction("aaa.bbb.ccc." + BuildConfig.FLAVOR);
        startActivity(intent);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d("my", "requestCode = " + requestCode + ", resultCode = " + resultCode);
        Log.d("my", "data = " + data.toString());
    }

    public void bt_hide_intent2()
    {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        startActivity(intent);
    }

    public void bt_fun4()
    {
        Intent intent = new Intent(getActivity(), CallNotForeFunActivity.class);
        startActivity(intent);
    }
    public void bt_fun5()
    {
        Intent intent = new Intent(getActivity(), MenuListenerActivity.class);
        startActivity(intent);
    }

    class MyConnection implements ServiceConnection
    {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service)
        {
            Log.d("my", "onServiceConnected service class = " + service.getClass());

        }

        @Override
        public void onServiceDisconnected(ComponentName name)
        {
            Log.d("my", "MyConnection onServiceDisconnected");
        }
    }
}
