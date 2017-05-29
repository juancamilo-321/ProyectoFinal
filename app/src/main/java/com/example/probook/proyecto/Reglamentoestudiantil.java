package com.example.probook.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Reglamentoestudiantil extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reglamentoestudiantil);
        webView = (WebView)findViewById(R.id.Reglamentoestudiantil);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/general/uniremington/reglamento-estudiantil.html");
    }

}
