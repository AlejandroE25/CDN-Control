package org.cdn.lowerthirds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Objects;

public class ptz_control extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptz_control);

        Objects.requireNonNull(getSupportActionBar()).hide();

        webView = (WebView) findViewById(R.id.ptz_control);
        webView.setWebViewClient(new WebViewClient());

        // enable caching
        webView.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://172.40.20.59:8080");
    }
}