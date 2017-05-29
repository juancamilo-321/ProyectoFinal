package com.example.probook.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Requisitosdeinscripcion extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requisitosdeinscripcion);
        webView = (WebView)findViewById(R.id.Requisitosdeinscripcion);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/778-requisitos-de-inscripcion.html");

    }
}
