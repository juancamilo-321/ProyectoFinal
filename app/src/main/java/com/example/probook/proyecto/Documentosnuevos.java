package com.example.probook.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Documentosnuevos extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_documentosnuevos);
        webView = (WebView)findViewById(R.id.Documentosnuevos);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/844-documentos-nuevos.html");
    }
}
