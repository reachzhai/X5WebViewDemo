package com.example.zhailong.webviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import utils.X5WebView;

public class X5BrowserActivity extends AppCompatActivity {
    public static final String HOME_URL= "http://zt.qidian.com/2016/qd/index.html";
    private X5WebView mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_x5_browser);
        mWebView = (X5WebView)this.findViewById(R.id.webview);
        assert mWebView != null;
        mWebView.loadUrl(HOME_URL);
    }
}
