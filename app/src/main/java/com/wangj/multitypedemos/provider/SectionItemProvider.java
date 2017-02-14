package com.wangj.multitypedemos.provider;

import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wangj.multitypedemos.R;
import com.wangj.multitypedemos.entity.SectionItem;

import me.drakeet.multitype.ItemViewProvider;

/**
 * 当前类注释：
 * Author :LeonWang
 * Created  2017/2/14.13:53
 * Description:
 * E-mail:lijiawangjun@gmail.com
 */

public class SectionItemProvider extends ItemViewProvider<SectionItem,SectionItemProvider.ViewHolder>{


    @NonNull
    @Override
    protected ViewHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        View root = inflater.inflate(R.layout.section_title_item,parent,false);
        return new ViewHolder(root);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, @NonNull SectionItem sectionItem) {
        holder.mTvTitle.setText(sectionItem.getName());
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        @NonNull
        private AppCompatTextView mTvTitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.mTvTitle = (AppCompatTextView) itemView.findViewById(R.id.tv_title);
        }
    }

}
