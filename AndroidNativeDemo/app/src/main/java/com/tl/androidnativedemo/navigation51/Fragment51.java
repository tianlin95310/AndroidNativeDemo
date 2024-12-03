package com.tl.androidnativedemo.navigation51;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.tl.androidnativedemo.R;

/**
 * Created by tianlin on 2017/5/10.
 * Tel : 15071485690
 * QQ : 953108373
 * Function :
 */

public class Fragment51 extends Fragment {
    Button f9Sum;
    Button f9Append;
    Button f9OperateArray;
    Button f9Check;

    MyJniClass jniClass;
    Button f9CCallJavaAdd;
    Button f9CCallJavaM1;
    Button f9CCallJavaM2;
    Button f9CCallJavaStaticM;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment51, container, false);
//        jniClass = new MyJniClass();
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    public void onViewClicked1(View view) {
        switch (view.getId()) {
            case R.id.f9_sum:
                Log.d("my", "add = " + jniClass.sum(10, 20));
                break;
            case R.id.f9_append:
                Log.d("my", "append = " + jniClass.append("Iam from Java "));
                break;
            case R.id.f9_operate_array:

                int array[] = new int[]{1, 2, 3, 4, 5};

                int result[] = jniClass.operateEle(array);

                for (int i = 0; i < result.length; i++) {
                    Log.d("my", "i = " + result[i]);
                }
                break;
            case R.id.f9_check:

                Log.d("my", "result = " + jniClass.checkPwd("123456"));
                break;
        }
    }

    public void onViewClicked2(View view) {
        switch (view.getId()) {
            case R.id.f9_c_call_java_add:
                jniClass.callbackAdd();
                break;
            case R.id.f9_c_call_java_m1:
                jniClass.callbackHelloFromJava();
                break;
            case R.id.f9_c_call_java_m2:
                jniClass.callbackPrintString();
                break;
            case R.id.f9_c_call_java_static_m:
                jniClass.callbackSayHello();
                break;
        }
    }
}
