package org.cdn.lowerthirds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Objects;

public class lower_thirds extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lowerthirds);

        Objects.requireNonNull(getSupportActionBar()).hide();

        webView = (WebView) findViewById(R.id.singular_view);
        webView.setWebViewClient(new WebViewClient());

        // enable caching
        webView.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://app.singular.live/appinstances/2629756/control");
    }
}