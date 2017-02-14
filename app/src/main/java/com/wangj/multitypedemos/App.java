package com.wangj.multitypedemos;

import android.app.Application;

/**
 * 当前类注释：
 * Author :LeonWang
 * Created  2017/2/14.14:11
 * Description:
 * E-mail:lijiawangjun@gmail.com
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        MultiTypeInstaller.start();
    }
}
