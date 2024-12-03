package com.tl.androidnativedemo.navigation91;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.tl.androidnativedemo.R;
import com.tl.androidnativedemo.utils.device.NetWorkState;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by tianlin on 2017/7/20.
 * Tel : 15071485690
 * QQ : 953108373
 * Function :
 */

public class Fragment91 extends Fragment {
    Button btGetPath;
    Button btGetSysTime;
    Button btGetHomeApp;
    Button bt4;
    Button bt5;
    Button bt6;
    Button bt7;
    Button bt9;
    Button bt10;
    Button bt11;
    Button bt12;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment91, container, false);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    public void bt_get_path() {
        getPathData(getActivity());
    }

    /**
     * 目录相关
     */
    private void getPathData(Context context) {

        // /storage/emulated/0
        Log.d("my", "getAbsolutePath = " + Environment.getExternalStorageDirectory().getAbsolutePath());
        // /data apk目录
        Log.d("my", "getDataDirectory = " + Environment.getDataDirectory().getAbsolutePath());
        // /system 系统目录
        Log.d("my", "getRootDirectory = " + Environment.getRootDirectory().getAbsolutePath());
        // /cache
        Log.d("my", "getDownloadCacheDirectory = " + Environment.getDownloadCacheDirectory().getAbsolutePath());
        // mounted
        Log.d("my", "getExternalStorageState = " + Environment.getExternalStorageState());

        // 内置存储卡里的文件路径
        Log.d("my", "getFilesDir = " + context.getFilesDir().getAbsolutePath());
        // 位置存储卡的缓存路径
        Log.d("my", "getCacheDir = " + context.getCacheDir().getAbsolutePath());
        // 会在外置卡的/Android/data里面生成一个cache文件夹
        Log.d("my", "getExternalCacheDir = " + context.getExternalCacheDir().getAbsolutePath());
        // 会在外置内存卡的/Android/data里面生成一个files文件，并在里面生成DCIM文件夹
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Log.d("my", "getExternalFilesDirs = " + context.getExternalFilesDirs(Environment.DIRECTORY_DCIM)[0].getAbsolutePath());
        }
    }

    public void bt_get_sys_time() {
        getSystemTime();
    }

    /**
     * 获取系统时间，若系统的时间被修改，这里获取的值也是被修改的
     */
    public void getSystemTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HHmmss");
        Log.d("my", "time = " + sdf.format(new Date()));
    }

    public void bt_get_home_app() {
        List<String> names = new ArrayList<>();
        PackageManager packageManager = this.getActivity().getPackageManager();
        // 属性
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
//        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        List<ResolveInfo> resolveInfo = packageManager.queryIntentActivities(intent,
                PackageManager.MATCH_DEFAULT_ONLY);
        for (ResolveInfo ri : resolveInfo) {
            Log.d("my", "packageName = " + ri.activityInfo.packageName);
            Log.d("my", "parentActivityName = " + ri.activityInfo.parentActivityName);
            Log.d("my", "targetActivity = " + ri.activityInfo.targetActivity);
            Log.d("my", "name = " + ri.activityInfo.name);
            Log.d("my", "processName = " + ri.activityInfo.processName);
            Log.d("my", "----------------------------------------------------");
            names.add(ri.activityInfo.packageName);
        }
    }

    public void bt_4() {
        NetWorkState.getCurrentNet(getContext());
    }

    public void bt_5() {
        NetWorkState.getCurrentWifi(getContext());
    }

    //    @RequiresApi(api = Build.VERSION_CODES.O)这样定义是没有用的，需要再事件里面进行判断
    public void bt_6() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NetWorkState.getCurrentWifiAware(getContext());
        }
    }

    public void bt_7() {
        NetWorkState.getCurrentWifiP2p(getContext());
    }

    public void onBt9Clicked() {

    }

    public void onBt10Clicked() {
    }

    public void onBt11Clicked() {
    }

    public void onBt12Clicked() {
    }
}
