package com.wangj.multitypedemos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private android.widget.Button btsection;
    private android.widget.LinearLayout activitymain;
    private Button retrofit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.retrofit1 = (Button) findViewById(R.id.retrofit1);
        this.activitymain = (LinearLayout) findViewById(R.id.activity_main);
        this.btsection = (Button) findViewById(R.id.bt_section);
        btsection.setOnClickListener(this);
        retrofit1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_section:
                startActivity(new Intent(MainActivity.this,SectionActivity.class));
                break;
            case R.id.retrofit1:
                break;
        }
    }
}
