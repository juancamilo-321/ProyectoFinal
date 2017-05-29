package com.example.probook.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Dondeestamos extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dondeestamos);
        webView = (WebView)findViewById(R.id.Dondeestamos);
        webView.loadUrl("http://www.uniremington.edu.co/uniremington/donde-estamos.html");
    }
}
