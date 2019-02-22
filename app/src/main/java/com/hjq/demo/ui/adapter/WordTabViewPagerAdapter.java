package com.hjq.demo.ui.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.hjq.demo.bean.TagBean;

import java.util.List;

/**
 * Created by Administrator on 2019\2\22 0022.
 */

public class WordTabViewPagerAdapter extends FragmentPagerAdapter {
    private List<TagBean> mStrList;
    private List<Fragment> mFragmentList;
    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    public WordTabViewPagerAdapter(FragmentManager fm, Context context, List<TagBean> mStrList, List<Fragment> fragmentList) {
        super(fm);
        this.mStrList = mStrList;
        mFragmentList = fragmentList;
    }

    @Override
    public int getCount() {
        return mFragmentList == null ? 0 : mFragmentList.size();
    }



    @Override
    public CharSequence getPageTitle(int position) {
        // TODO Auto-generated method stub
        return mStrList.get(position).getTagName();
    }

}
