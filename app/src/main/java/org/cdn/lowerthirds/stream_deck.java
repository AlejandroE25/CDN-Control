package org.cdn.lowerthirds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Objects;

public class stream_deck extends AppCompatActivity {

    WebView webView;
    // http://172.40.20.59:1234/tablet3?cols=4&index=0&layout=cycle&noconfigure=1&nofullscreen=1&rows=4


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stream_deck);

        Objects.requireNonNull(getSupportActionBar()).hide();

        webView = (WebView) findViewById(R.id.stream_deck_view);
        webView.setWebViewClient(new WebViewClient());
        // enable caching
        webView.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl("http://172.40.20.59:1234/tablet3?cols=4&index=0&layout=cycle&noconfigure=1&nofullscreen=1&rows=4");
    }
}