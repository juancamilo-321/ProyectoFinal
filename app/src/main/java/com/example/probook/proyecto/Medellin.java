package com.example.probook.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Medellin extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medellin);
        webView = (WebView)findViewById(R.id.Medellin);
        webView.loadUrl("http://www.uniremington.edu.co/");
    }
}
