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

        //Se crear un Array para mostrar el nombre seleccionado en una nueva pantalla de PROGRAMAS
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
                        Intent pregrados = new Intent (Menu.this, Pregrado.class);
                        startActivity(pregrados);
                        //webView.loadUrl("http://uniremingtonmanizales.edu.co/administracion/");
                        break;
                    case 3:
                        Intent tecnologias = new Intent (Menu.this, Tecnologias.class);
                        startActivity(tecnologias);
                        //webView.loadUrl("http://uniremingtonmanizales.edu.co/contable/");
                        break;
                    case 4:
                        Intent extencion = new Intent (Menu.this, Extencion.class);
                        startActivity(extencion);
                        //webView.loadUrl("http://uniremingtonmanizales.edu.co/contable/");
                        break;
                    case 5:
                        Intent gruposdeestudio = new Intent (Menu.this, Gruposdeestudio.class);
                        startActivity(gruposdeestudio);
                        //webView.loadUrl("http://uniremingtonmanizales.edu.co/contable/");
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
            //revisar si esta opcion va en este punto
            });

        //Se crear un Array para mostrar el nombre seleccionado en una nueva pantalla de UNIREMINGTON
        ArrayAdapter arrayAdapter1 = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinneruniremington.setAdapter(arrayAdapter1);

        spinneruniremington.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        Intent misionvision = new Intent(Menu.this, Misionvision.class);
                        startActivity(misionvision);
                        break;
                    case 2:
                        Intent valoresinstitucionales = new Intent (Menu.this, Valoresinstitucionales.class);
                        startActivity(valoresinstitucionales);
                        //webView.loadUrl("http://uniremingtonmanizales.edu.co/administracion/");
                        break;
                    case 3:
                        Intent lineamientosacademicos = new Intent (Menu.this, Lineamientosacademicos.class);
                        startActivity(lineamientosacademicos);
                        //webView.loadUrl("http://uniremingtonmanizales.edu.co/contable/");
                        break;
                    case 4:
                        Intent calendarioacademico = new Intent (Menu.this, Calendarioacademico.class);
                        startActivity(calendarioacademico);
                        //webView.loadUrl("http://uniremingtonmanizales.edu.co/contable/");
                        break;
                    case 5:
                        Intent reglamentoestudiantil = new Intent (Menu.this, Reglamentoestudiantil.class);
                        startActivity(reglamentoestudiantil);
                        //webView.loadUrl("http://uniremingtonmanizales.edu.co/contable/");
                        break;
                    case 6:
                        Intent directorioadministrativo = new Intent (Menu.this, Directorioadministrativo.class);
                        startActivity(directorioadministrativo);
                        //webView.loadUrl("http://uniremingtonmanizales.edu.co/contable/");
                        break;
                    case 7:
                        Intent dondeestamos = new Intent (Menu.this, Dondeestamos.class);
                        startActivity(dondeestamos);
                        //webView.loadUrl("http://uniremingtonmanizales.edu.co/contable/");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //Se crear un Array para mostrar el nombre seleccionado en una nueva pantalla de SEDES
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnersedes.setAdapter(arrayAdapter2);

        spinnersedes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        Intent armenia = new Intent(Menu.this, Armenia.class);
                        startActivity(armenia);
                        break;
                    case 2:
                        Intent boyaca = new Intent(Menu.this, Boyaca.class);
                        startActivity(boyaca);
                        break;
                    case 3:
                    Intent bucaramanga = new Intent(Menu.this, Bucaramanga.class);
                    startActivity(bucaramanga);
                    break;
                    case 4:
                        Intent cucuta = new Intent(Menu.this, Cucuta.class);
                        startActivity(cucuta);
                        break;
                    case 5:
                        Intent medellin = new Intent(Menu.this, Medellin.class);
                        startActivity(medellin);
                        break;
                    case 6:
                        Intent monteria = new Intent(Menu.this, Monteria.class);
                        startActivity(monteria);
                        break;
                    case 7:
                        Intent pasto = new Intent(Menu.this, Pasto.class);
                        startActivity(pasto);
                        break;
                    case 8:
                        Intent pereira = new Intent(Menu.this, Pereira.class);
                        startActivity(pereira);
                        break;
                    case 9:
                        Intent sincelejo = new Intent(Menu.this, Sincelejo.class);
                        startActivity(sincelejo);
                        break;
                    case 10:
                        Intent yopal = new Intent(Menu.this, Yopal.class);
                        startActivity(yopal);
                        break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

    });
        //Se crear un Array para mostrar el nombre seleccionado en una nueva pantalla de ADMISIONES
        ArrayAdapter arrayAdapter3 = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinneradmisiones.setAdapter(arrayAdapter3);

        spinneradmisiones.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        Intent preinscriocion = new Intent(Menu.this, Preinscripcion.class);
                        startActivity(preinscriocion);
                        break;
                    case 2:
                        Intent requisitosdeinscripcion = new Intent(Menu.this, Requisitosdeinscripcion.class);
                        startActivity(requisitosdeinscripcion);
                        break;
                    case 3:
                        Intent homologaciones = new Intent(Menu.this, Homologaciones.class);
                        startActivity(homologaciones);
                        break;
                    case 4:
                        Intent formasdepago = new Intent(Menu.this, Formasdepago.class);
                        startActivity(formasdepago);
                        break;
                    case 5:
                        Intent conveniosydescuentos = new Intent(Menu.this, Conveniosydescuentos.class);
                        startActivity(conveniosydescuentos);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //Se crear un Array para mostrar el nombre seleccionado en una nueva pantalla de PLATAFORMAS
        ArrayAdapter arrayAdapter4 = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerplataformas.setAdapter(arrayAdapter4);

        spinnerplataformas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        Intent moodle = new Intent(Menu.this, Moodle.class);
                        startActivity(moodle);
                        break;
                    case 2:
                        Intent q10 = new Intent(Menu.this, Q10.class);
                        startActivity(q10);
                        break;
                    case 3:
                        Intent recibodematricula = new Intent(Menu.this, Recibodematricula.class);
                        startActivity(recibodematricula);
                        break;
                    case 4:
                        Intent documentosnuevos = new Intent(Menu.this, Documentosnuevos.class);
                        startActivity(documentosnuevos);
                        break;
                    case 5:
                        Intent reservadeequipos = new Intent(Menu.this, Reservadeequipos.class);
                        startActivity(reservadeequipos);
                        break;
                    case 7:
                        Intent bibliotecauniremington = new Intent(Menu.this, Bibliotecauniremington.class);
                        startActivity(bibliotecauniremington);
                        break;
                    case 8:
                        Intent moduloatencionpqrs = new Intent(Menu.this, Moduloatencionpqrs.class);
                        startActivity(moduloatencionpqrs);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        }


    }

