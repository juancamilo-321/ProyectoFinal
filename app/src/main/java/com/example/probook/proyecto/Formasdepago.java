package com.example.probook.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Formasdepago extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formasdepago);
        webView = (WebView)findViewById(R.id.Formasdepago);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/779-formas-de-pago.html");

    }
}