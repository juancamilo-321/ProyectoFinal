package com.example.probook.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Gruposdeestudio extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gruposdeestudio);
        webView = (WebView)findViewById(R.id.Gruposdeestudio);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/general/programas/semilleros.html");
    }
}
