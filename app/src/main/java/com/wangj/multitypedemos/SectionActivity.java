package com.wangj.multitypedemos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.RelativeLayout;

import com.wangj.multitypedemos.entity.SectionEntity;
import com.wangj.multitypedemos.entity.SectionItem;
import com.wangj.multitypedemos.provider.SectionItemProvider;
import com.wangj.multitypedemos.provider.SectionViewProvider;

import me.drakeet.multitype.Items;
import me.drakeet.multitype.MultiTypeAdapter;

public class SectionActivity extends AppCompatActivity {

    private android.support.v7.widget.RecyclerView recyclerview;
    private android.widget.RelativeLayout activitysection;
    private Items mItems;
    private MultiTypeAdapter mAdapter;
    private static final int SPAN_COUNT = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section);
        this.activitysection = (RelativeLayout) findViewById(R.id.activity_section);
        this.recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
       /* LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerview.setLayoutManager(layoutManager);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);*/

        GridLayoutManager layoutManager = new GridLayoutManager(this, SPAN_COUNT);
        layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return (mItems.get(position) instanceof SectionItem) ? SPAN_COUNT : 1;
            }
        });
        recyclerview.setLayoutManager(layoutManager);

        initData();
    }

    private void initData() {
        mItems = new Items();
        mAdapter = new MultiTypeAdapter(mItems);
        mAdapter.applyGlobalMultiTypePool();
        /**
         * 注册类型和View的对应关系
         */
        mAdapter.register(SectionEntity.class, new SectionViewProvider());
        mAdapter.register(SectionItem.class, new SectionItemProvider());
        loadData();
        recyclerview.setAdapter(mAdapter);
    }

    private void loadData() {
        SectionItem sectionItem = new SectionItem("大王叫我来巡山");
        mItems.add(sectionItem);
        for (int i = 0; i < 5; i++) {
            mItems.add(new SectionEntity("猴子派来的逗比" + i));
        }

        SectionItem sectionItem1 = new SectionItem("单身狗的情人节耶");
        mItems.add(sectionItem1);
        for (int i = 0; i < 20; i++) {
            mItems.add(new SectionEntity("今晚怎么过啊" + i));
        }
        mAdapter.setItems(mItems);
        mAdapter.notifyDataSetChanged();
    }
}
