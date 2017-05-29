package com.example.probook.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Lineamientosacademicos extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lineamientosacademicos);
        webView = (WebView) findViewById(R.id.Lineamientosacademicos);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/general/uniremington/2016-02-10-22-02-36.html");
    }
}
