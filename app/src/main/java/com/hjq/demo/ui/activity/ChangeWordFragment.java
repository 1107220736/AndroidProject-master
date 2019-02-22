package com.hjq.demo.ui.activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hjq.demo.R;
import com.hjq.demo.bean.WordCourseBean;
import com.hjq.demo.common.CommonLazyFragment;
import com.hjq.demo.ui.adapter.ChangeWordAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2019\2\22 0022.
 */

public class ChangeWordFragment extends CommonLazyFragment {
    @BindView(R.id.list)
    RecyclerView mRecyclerView;

    private List<WordCourseBean> mCourseBeanList;
    private ChangeWordAdapter changeWordAdapter;
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_change_tab;
    }

    @Override
    protected int getTitleBarId() {
        return 0;
    }

    @Override
    protected void initView() {
        mCourseBeanList = new ArrayList<>();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        for (int i = 0; i < 10; i++) {
            WordCourseBean mCourseBean = new WordCourseBean();
            mCourseBean.setId(i);
            mCourseBean.setTitle("人教版小学一年级");
            mCourseBean.setNumber("单词数 1314");
            mCourseBean.setContent("又到一年考研季，本贝为你献上2018考研大纲英语词汇");
            if (i/2 == 0){
                mCourseBean.setType("0");
            }else {
                mCourseBean.setType("1");
            }
            mCourseBean.setPrice("2011");
            mCourseBeanList.add(mCourseBean);
        }

        changeWordAdapter = new ChangeWordAdapter(getActivity(),mCourseBeanList);
        mRecyclerView.setAdapter(changeWordAdapter);
        changeWordAdapter.setData(mCourseBeanList);
    }

    @Override
    protected void initData() {
    }

}
