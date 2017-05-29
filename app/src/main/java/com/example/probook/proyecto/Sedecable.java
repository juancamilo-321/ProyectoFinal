package com.example.probook.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Sedecable extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sedecable);
        webView = (WebView)findViewById(R.id.Sedecable);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/792-sede-cable.html");
    }
}
