package com.example.probook.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Bibliotecauniremington extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bibliotecauniremington);
        webView = (WebView)findViewById(R.id.Bibliotecauniremington);
        webView.loadUrl("http://biblioteca.uniremington.edu.co/index.php/login\n");
    }
}
