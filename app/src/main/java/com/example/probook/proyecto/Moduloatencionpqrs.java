package com.example.probook.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Moduloatencionpqrs extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moduloatencionpqrs);
        webView = (WebView)findViewById(R.id.Moduloatencionpqrs);
        webView.loadUrl("http://sim.uniremington.edu.co/formrem/pqrs/");
    }
}
