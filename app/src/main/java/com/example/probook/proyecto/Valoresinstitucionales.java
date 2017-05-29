package com.example.probook.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Valoresinstitucionales extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valoresinstitucionales);
        webView = (WebView)findViewById(R.id.Valoresinstitucionales);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/general/uniremington/valores-institucionales.html");
    }
}
