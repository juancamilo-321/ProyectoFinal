package com.example.probook.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Directorioadministrativo extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directorioadministrativo);
        webView = (WebView)findViewById(R.id.Directorioadministrativo);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/1445-directorio-administrativo.html");

    }
}
