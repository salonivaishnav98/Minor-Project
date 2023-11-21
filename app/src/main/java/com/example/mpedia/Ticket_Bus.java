package com.example.mpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Ticket_Bus extends AppCompatActivity {

    WebView webview_bus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ticket_bus);
        getSupportActionBar().setTitle("Book Your Ticket");

        webview_bus = (WebView) findViewById(R.id.webview_bus);
        webview_bus.setWebViewClient(new WebViewClient());
        webview_bus.loadUrl("https://www.abhibus.com/mobile/");

        WebSettings webSettings = webview_bus.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed() {
        if(webview_bus.canGoBack()){
            webview_bus.goBack();
        }else {
            super.onBackPressed();
        }
    }
}