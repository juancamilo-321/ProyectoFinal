package com.example.probook.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Pereira extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pereira);
        webView = (WebView)findViewById(R.id.Pereira);
        webView.loadUrl("http://www.uniremington.edu.co/pereira/");
    }
}
