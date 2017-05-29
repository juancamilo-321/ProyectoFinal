package com.example.probook.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Sedecentro extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sedecentro);
        webView = (WebView)findViewById(R.id.Sedecentro);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/776-sedes-centro.html");
    }
}
