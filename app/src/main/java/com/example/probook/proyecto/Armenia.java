package com.example.probook.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

public class Armenia extends AppCompatActivity {
WebView webView;
    ImageView btnatras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_armenia);
        webView = (WebView)findViewById(R.id.Armenia);
        webView.loadUrl("http://www.uniremington.edu.co/armenia/");

        btnatras = (ImageView) findViewById(R.id.btnatras);
        btnatras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
