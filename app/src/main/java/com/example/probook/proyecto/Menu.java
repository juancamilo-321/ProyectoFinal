package com.example.probook.proyecto;

import android.content.Intent;
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
    Spinner spinnerprogramas;
    Spinner spinneruniremington;
    Spinner spinnersedes;
    Spinner spinneradmisiones;
    Spinner spinnerplataformas;
    Spinner spinnerbienesyegre;
    Spinner spinnercomunidad;
    Spinner spinnerubicacion;


    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //Se llama la variable spinner  del modo grafico para poder utilizarla en el programa
        spinnerprogramas = (Spinner) findViewById(R.id.spinnerProgramas);

        spinneruniremington = (Spinner) findViewById(R.id.spinnerUniremington);
        spinnersedes = (Spinner) findViewById(R.id.spinnerSedes);
        spinneradmisiones = (Spinner) findViewById(R.id.spinnerAdmisiones);
        spinnerplataformas = (Spinner) findViewById(R.id.spinnerPlataformas);
        spinnerbienesyegre = (Spinner) findViewById(R.id.spinnerBienesyegre);
        spinnercomunidad = (Spinner) findViewById(R.id.spinnerComunidad);
        spinnerubicacion = (Spinner) findViewById(R.id.spinnerUbicacion);

        //lista para mostrar en pantalla de PROGRAMAS
        List list = new ArrayList();
        list.add("PROGRAMAS");
        list.add("Especializaciones");
        list.add("Profesionales");
        list.add("Tecnologicos");
        list.add("Extensión");
        list.add("Grupos de Estudio");

        //Lista para mostrar en pantalla de Uniremington
        List list1 = new ArrayList();
        list1.add("Misión Visión");
        list1.add("Valores Instituconales");
        list1.add("lineamientos Academicos");
        list1.add("Calendario Academico");
        list1.add("Reglamento Estudiantil");
        list1.add("Directorio Administrativo");
        list1.add("¿Donde Estamos?");

        //Lista para mostrar en pantalla de SEDES
        List list2 = new ArrayList();
        list2.add("Armenia");
        list2.add("Boyacá");
        list2.add("Bucaramanga");
        list2.add("Cucuta");
        list2.add("Medellin");
        list2.add("Monteria");
        list2.add("Pasto");
        list2.add("Pereira");
        list2.add("Sincelejo");
        list2.add("Yopal");

        //Lista para mostrar en pantalla de ADMISIONES
        List list3 = new ArrayList();
        list3.add("Pre-Inscripcion");
        list3.add("Requisitos de Inscripcion");
        list3.add("Homologaciones");
        list3.add("Formas de Pago");
        list3.add("Convenios y Descuentos");

        //Lista para mostrar en pantalla de PLATAFORMAS
        List list4 = new ArrayList();
        list4.add("Moodle");
        list4.add("Q10");
        list4.add("Recibo de Matricula");
        list4.add("Docuemntos Nuevos");
        list4.add("Reserva de Equipos");
        list4.add("Biblioteca Uniremington");
        list4.add("Modulo Atencion PQRS");

        //Lista para mostrar en pantalla de BIENESTAR Y EGRESADOS
        List list5 = new ArrayList();
        list5.add("Internacionalizacion");
        list5.add("Convenios y Descuentos");

        //Lista para mostrar en pantalla de COMUNIDAD
        List list6 = new ArrayList();
        list6.add("Calendario - Eventos");

        //Lista para mostrar en pantalla de COMUNIDAD
        List list7 = new ArrayList();
        list7.add("Sede Cable");
        list7.add("Sede Centro");

        //Se crear un Array para mostrar el nombre seleccionado en una nueva pantalla
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerprogramas.setAdapter(arrayAdapter);

        spinnerprogramas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                       Intent especializaciones = new Intent(Menu.this, Especializaciones.class);
                        startActivity(especializaciones);
                        //webView.loadUrl("http://uniremingtonmanizales.edu.co/alta-gerencia/");
                        //Se puede hacer de dos formas 1. Crear en webView en la nueva pagina para ver la PAGINA y crear los botoner de las otras paginas
                                                    // 2. Crear una nueva pagina y mostrar todas las opciones de las carreras, crear los botoner para cada una
                        break;
                    case 2:
                        webView.loadUrl("http://uniremingtonmanizales.edu.co/administracion/");
                        break;
                    case 3:
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
