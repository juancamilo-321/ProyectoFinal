package com.example.probook.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Reservadeequipos extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservadeequipos);
        webView = (WebView)findViewById(R.id.Reservadeequipos);
        webView.loadUrl("http://reservas.uniremingtonmanizales.edu.co/login.php");

    }
}
