package com.kanexpro.blogspot.kanhaiyalutipur.webviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView web;
    String url = "https://www.google.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        web = findViewById(R.id.web);

        web.loadUrl(url);

        web.setWebViewClient(new WebViewClient());
       // web.getSettings().setJavaScriptEnabled(true);
       // web.getSettings().setBuiltInZoomControls(true);

    }

    @Override
    public void onBackPressed() {
        if (web.canGoBack())
            web.goBack();
        else

         super.onBackPressed();
    }
}