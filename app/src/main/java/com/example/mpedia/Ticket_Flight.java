package com.example.mpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Ticket_Flight extends AppCompatActivity {

    WebView webview_flight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ticket_flight);
        getSupportActionBar().setTitle("Book Your Ticket");

        webview_flight = (WebView) findViewById(R.id.webview_flight);
        webview_flight.setWebViewClient(new WebViewClient());
        webview_flight.loadUrl("https://tickets.paytm.com/flights/");

        WebSettings webSettings = webview_flight.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed() {
        if(webview_flight.canGoBack()){
            webview_flight.goBack();
        }else {
            super.onBackPressed();
        }
    }
}