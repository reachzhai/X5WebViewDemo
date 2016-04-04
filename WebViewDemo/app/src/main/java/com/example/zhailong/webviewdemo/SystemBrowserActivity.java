package com.example.zhailong.webviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import utils.SystemWebView;

public class SystemBrowserActivity extends AppCompatActivity {
    public static final String HOME_URL= "http://zt.qidian.com/2016/qd/index.html";
    private SystemWebView mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_browser);
        mWebView = (SystemWebView)this.findViewById(R.id.webview);
        assert mWebView != null;
        mWebView.loadUrl(HOME_URL);
    }
}
