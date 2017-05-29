package com.example.probook.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Recibodematricula extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibodematricula);
        webView = (WebView)findViewById(R.id.Recibodematricula);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/843-recibo-de-matricula.html\n");

    }
}
