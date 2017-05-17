package com.example.probook.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Menu extends AppCompatActivity {

    //Se declara la variable spinner
    Spinner spinnerpro;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //Se llama la variable spinner  del modo grafico para poder utilizarla en el programa
        spinnerpro = (Spinner) findViewById(R.id.spinnerProgramas);

        //Se crea una lista para mostrarla en pantalla
        List list = new ArrayList();
        list.add("Especializaciones");
        list.add("Profesionales");
        list.add("Tecnologicos");

        //Se crear un Array para mostrar el nombre seleccionado en una nueva pantalla
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerpro.setAdapter(arrayAdapter);
        webView = (WebView)findViewById(R.id.web);
        spinnerpro.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        webView.loadUrl("http://uniremingtonmanizales.edu.co/alta-gerencia/");
                        break;
                    case 1:
                        webView.loadUrl("http://uniremingtonmanizales.edu.co/administracion/");
                        break;
                    case 2:
                        webView.loadUrl("http://uniremingtonmanizales.edu.co/contable/");
                        break;
            }





            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
            });
    }
}
