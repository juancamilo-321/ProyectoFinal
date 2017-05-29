package com.example.probook.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Extencion extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extencion);
        webView = (WebView)findViewById(R.id.Extencion);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/753-extension.html");
    }
}
