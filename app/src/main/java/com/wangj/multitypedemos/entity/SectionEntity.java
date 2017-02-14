package com.wangj.multitypedemos.entity;

import android.support.annotation.NonNull;

/**
 * 当前类注释：
 * Author :LeonWang
 * Created  2017/2/14.13:32
 * Description:
 * E-mail:lijiawangjun@gmail.com
 */

public class SectionEntity {

    @NonNull
    private String name;

    public SectionEntity(@NonNull String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
