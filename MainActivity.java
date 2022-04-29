package com.example.webviewapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webview = findViewById(R.id.webview);
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        setContentView(webview);
        webview.setWebViewClient(new WebViewClient());
        webview.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        webview.getSettings().setTextZoom(150);
        webview.loadUrl("https://zu-z.github.io/HW/Web.html");
    }
}

//import android.graphics.Color;
//webview.setBackgroundColor(Color.parseColor("#B94FFF")); //啟動換顏色
//setLoadWithOverviewMode() : 參數值可設定true或是false,默認值是false,此參數值設定為true是為了當內容大於viewport時，系統將會自動縮小內容以適屏幕寬度。
//webview.getSettings().setUseWideViewPort(false);//將圖片調整到適合webview的大小
//webview.getSettings().setLoadWithOverviewMode(true);//縮放至屏幕的大小
//webview.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);//支持内容重新布局
//webview.getSettings().setTextZoom(150);//設定字型預設縮放大小
