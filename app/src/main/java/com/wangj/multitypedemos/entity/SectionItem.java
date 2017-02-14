package com.wangj.multitypedemos.entity;

import android.support.annotation.NonNull;

/**
 * 当前类注释：
 * Author :LeonWang
 * Created  2017/2/14.13:52
 * Description:
 * E-mail:lijiawangjun@gmail.com
 */

public class SectionItem {

    @NonNull
    private String name;

    public SectionItem(@NonNull String name) {
        this.name = name;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }
}
