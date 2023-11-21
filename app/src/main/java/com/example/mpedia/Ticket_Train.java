package com.example.mpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Ticket_Train extends AppCompatActivity {
    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ticket_train);
        getSupportActionBar().setTitle("Book Your Ticket");

        webview = (WebView) findViewById(R.id.webview_train);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://www.googleadservices.com/pagead/aclk?sa=L&ai=Cejoi7FdWZedZqt6MzA__tp7gBPSzrLNwtbzznf8Oy5XzDwgAEAEguVQoAmDlqueDxA6gAavVk_cDyAEBqQIRo0uqw8xJPsgD2CCqBFtP0LU40yaYMWQ7ybuib5U0ARFCzH4NryKqxtq2dKplvtyADGBVZXDl_qFal0hv6De2mIAoYHz7fJwf_a-nHsDpiI0zhMxpLzZ8x0VD8aHgsAJ3YRCZESdNvsOPwATtsIa14gOABZBOiAWe0p6BOqAGZoAHvarsCIgHAZAHAagH67ixAqgHpr4bqAe8rbECqAe5q7ECqAe5mrECqAfz0RuoB-7SG6gH_5yxAqgHytwbqAeSr7ECqAe7pLECqAeSprECqAfYprECqAfetbECqAfbqrECqAfQqrECqAfcsLECqAfqsbECqAequLECqAeUuLECqAfsuLECqAe-t7ECoAi0wT2wCAHSCCYQAjIEg-CADjoJwuGAgICABIJAQgEESNHs8ypQCVjn_9P4i8mCA5oJHGh0dHBzOi8vd3d3Lml4aWdvLmNvbS90cmFpbnOxCbrd5Qp8HUxNuQnHjTi7vL1NHPgJAZgLAaoMAggB2gwICgMg8QESAQLoDAaqDQJJTsgNAYIUEQgBEg10cmFpbiBib29raW5niBQDyBTAu7rzzYePhQPQFQGYFgH4FgGAFwGSFwgSBggBEAMYUboXBCABOAHgFwI&ae=2&gclid=Cj0KCQiAmNeqBhD4ARIsADsYfTeanDR-KDC-q545LpjSsEkaB0R7mVNxDsRR-AmvkJSQ6XlTsD_DR44aAoyVEALw_wcB&ved=2ahUKEwj8rcz4i8mCAxWdwjgGHXsICTQQ0Qx6BAgOEAE&nis=2&dct=1&cid=CAASE-RoMJ2UpMb1oHmtgME0UxK_PyA&dblrd=1&sival=AF15MEAY9foKo3lK8xVmZ7To19EaNPE8gwYv-g9G3IlXk3UWYiuF4hEaZTWW-If_WHOPyrBQhX_oh-Jwd50wroDx59s_DfwYFZXo-m9fCC2u7ReHeD4eCuuSEsMuf07i3xM7c88DH8XPrx4gfpPrIRJMlsFuD91zygkcfZAQgU271XH-jKKheNw&sig=AOD64_37R61_rx3LarDDBWLYt2sAGMLBUw&adurl=https://www.ixigo.com/trains%3Futm_source%3DGoogle%26utm_medium%3Dpaid_search_google_trains%26utm_campaign%3Dtrain_search_desktop%26gad_source%3D1");

        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed() {
        if(webview.canGoBack()){
            webview.goBack();
        }else {
            super.onBackPressed();
        }
    }
}