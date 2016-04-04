package com.example.zhailong.webviewdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private LinearLayout mSystemWebView;
    private LinearLayout mTencentX5WebView;
    private LinearLayout mCustomWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSystemWebView = (LinearLayout)this.findViewById(R.id.system_linear);
        mTencentX5WebView = (LinearLayout)this.findViewById(R.id.tencent_x5_linear);
        mCustomWebView = (LinearLayout)this.findViewById(R.id.custom_linear);
        mSystemWebView.setOnClickListener(this);
        mTencentX5WebView.setOnClickListener(this);
        mCustomWebView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int view = v.getId();
        Intent i = null;
        switch (view){
            case R.id.system_linear:
                i = new Intent(this,SystemBrowserActivity.class);
                i.putExtra("type",0);
                break;
            case R.id.tencent_x5_linear:
                i = new Intent(this,X5BrowserActivity.class);
                i.putExtra("type",1);
                break;
            case R.id.custom_linear:
                i = new Intent(this,CustomBrowserActivity.class);
                i.putExtra("type",2);
                break;
        }
        if(i!=null) {
            this.startActivity(i);
        }
    }
}
