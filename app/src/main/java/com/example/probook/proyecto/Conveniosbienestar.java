package com.example.probook.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Conveniosbienestar extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conveniosbienestar);
        webView = (WebView)findViewById(R.id.Conveniosbienestar);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/1459-convenios-bienestar.html");
    }
}
