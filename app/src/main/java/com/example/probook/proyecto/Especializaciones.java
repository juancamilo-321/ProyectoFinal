package com.example.probook.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Especializaciones extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_especializaciones);
        webView = (WebView) findViewById(R.id.Especializaciones);
        webView.loadUrl("http://uniremingtonmanizales.edu.co/alta-gerencia/");
    }
}
