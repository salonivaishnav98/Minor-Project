package com.example.mpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Website extends AppCompatActivity {

    WebView webview_website;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.website_view);
        getSupportActionBar().setTitle("Tour MPedia");

        webview_website = (WebView) findViewById(R.id.webview_website);
        webview_website.setWebViewClient(new WebViewClient());
        webview_website.loadUrl("https://www.google.com");

        WebSettings webSettings = webview_website.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    @Override
    public void onBackPressed() {
        if(webview_website.canGoBack()){
            webview_website.goBack();
        }else {
            super.onBackPressed();
        }
    }
}