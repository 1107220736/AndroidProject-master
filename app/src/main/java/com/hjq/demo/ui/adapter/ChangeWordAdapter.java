package com.hjq.demo.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hjq.baselibrary.base.BaseRecyclerViewAdapter;
import com.hjq.demo.R;
import com.hjq.demo.bean.WordCourseBean;

import java.util.List;

import butterknife.BindView;

/**
 * Created by Administrator on 2019\2\22 0022.
 */

public class ChangeWordAdapter extends BaseRecyclerViewAdapter<WordCourseBean, ChangeWordAdapter.ViewHolder> {

    private Context context;
    private List<WordCourseBean> mWordCourseBeans;

    public ChangeWordAdapter(Context context,List<WordCourseBean> mWordCourseBeans) {
        this.context = context;
        this.mWordCourseBeans = mWordCourseBeans;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_change_word, viewGroup, false));
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        WordCourseBean wordCourseBean = mWordCourseBeans.get(position);
        viewHolder.tvWordTitle.setText(wordCourseBean.getTitle());
        viewHolder.tvWordNum.setText(wordCourseBean.getNumber());
        viewHolder.tvContent.setText(wordCourseBean.getContent());
        viewHolder.tvPrice.setText(wordCourseBean.getPrice());
        if (wordCourseBean.getType().equals("0")){
            viewHolder.tvFree.setVisibility(View.VISIBLE);
            viewHolder.tvPrice.setVisibility(View.GONE);
        }else {
            viewHolder.tvFree.setVisibility(View.GONE);
            viewHolder.tvPrice.setVisibility(View.VISIBLE);
        }
    }

    class ViewHolder extends BaseRecyclerViewAdapter.ViewHolder {
        ImageView wordPic;
        TextView tvWordTitle;
        TextView tvWordNum;
        TextView tvFree;
        TextView tvPrice;
        TextView tvContent;

        public ViewHolder(View itemView) {
            super(itemView);

            wordPic = itemView.findViewById(R.id.wordPic);
            tvWordTitle = itemView.findViewById(R.id.tv_wordTitle);
            tvWordNum = itemView.findViewById(R.id.tv_wordNum);
            tvFree = itemView.findViewById(R.id.tv_free);
            tvPrice = itemView.findViewById(R.id.tv_price);
            tvContent = itemView.findViewById(R.id.tv_content);
        }

    }
}
