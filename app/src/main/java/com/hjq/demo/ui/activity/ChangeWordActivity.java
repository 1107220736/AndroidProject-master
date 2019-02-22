package com.hjq.demo.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.TableLayout;

import com.hjq.bar.TitleBar;
import com.hjq.demo.R;
import com.hjq.demo.bean.TagBean;
import com.hjq.demo.bean.WordCourseBean;
import com.hjq.demo.common.CommonActivity;
import com.hjq.demo.ui.adapter.WordTabViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2019\2\22 0022.
 */

public class ChangeWordActivity extends CommonActivity {

    @BindView(R.id.tb_register_title)
    TitleBar tbRegisterTitle;
    @BindView(R.id.tb_ch_word)
    TabLayout mTbChWordLayout;
    @BindView(R.id.vp_list)
    ViewPager mViewPager;
    private List<TagBean> titleList;//标题列表数组
    private WordTabViewPagerAdapter mWordTabViewPagerAdapter;
    private List<Fragment> mFragmentList;
    private List<WordCourseBean> mCourseBeanList;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_change_word;
    }

    @Override
    protected int getTitleBarId() {
        return R.id.tb_register_title;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        titleList = new ArrayList<>();
        mFragmentList = new ArrayList<>();
        mCourseBeanList = new ArrayList<>();
        titleList.add(new TagBean(0, "小学"));
        titleList.add(new TagBean(1, "中学"));
        titleList.add(new TagBean(2, "高中"));
        titleList.add(new TagBean(3, "四级"));
        titleList.add(new TagBean(4, "六级"));
        titleList.add(new TagBean(5, "考研"));
        titleList.add(new TagBean(6, "托福"));

        for (int i = 0; i < 7; i++) {
            mFragmentList.add(new ChangeWordFragment());
        }

        mWordTabViewPagerAdapter = new WordTabViewPagerAdapter(getSupportFragmentManager(), ChangeWordActivity.this, titleList, mFragmentList);
        mViewPager.setAdapter(mWordTabViewPagerAdapter);
        mTbChWordLayout.setupWithViewPager(mViewPager);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
