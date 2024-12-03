package com.tl.androidnativedemo.navigation11.slidedelete;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tl.androidnativedemo.R;
import com.tl.androidnativedemo.base.BaseActivity;
import com.tl.androidnativedemo.base.OnlyTextAdapter;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by tianlin on 2017/7/14.
 * Tel : 15071485690
 * QQ : 953108373
 * Function :
 */

public class SlideDeleteActivity extends BaseActivity
{
    RecyclerView rvSlideDelete;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_delete);

        initView();
    }

    @Override
    public void initView()
    {
        rvSlideDelete.setLayoutManager(new LinearLayoutManager(this));

        List<String> strs = new ArrayList<>();
        for (int i = 0; i < 20; ++i)
        {
            strs.add("我是第" + (i + 1) + "个");
        }

        OnlyTextAdapter adapter = new OnlyTextAdapter(this, strs);
        rvSlideDelete.setAdapter(adapter);

        ItemTouchHelper touchHelper = new ItemTouchHelper(callBack);
        touchHelper.attachToRecyclerView(rvSlideDelete);
    }
    ItemTouchHelper.Callback callBack = new ItemTouchHelper.SimpleCallback(ItemTouchHelper.UP | ItemTouchHelper.DOWN, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT){
        @Override
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target)
        {
            return false;
        }

        @Override
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction)
        {
            Log.d("my", "onSwiped, direction = " + direction + " position = " + viewHolder.getLayoutPosition());
        }
    };


}
