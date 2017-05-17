package com.example.probook.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText email;
    EditText password;
    Button ingres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = (EditText) findViewById(R.id.correo);
        password = (EditText) findViewById(R.id.contraseña);
        ingres = (Button) findViewById(R.id.Botoningresar);
        ingres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = email.getText().toString();
                String pass = password.getText().toString();

                switch (v.getId()) {
                    case R.id.Botoningresar:
                        if (user.equals("camilo") && pass.equals("1234")) {
                            Toast.makeText(getApplicationContext(), "Bienvenido", Toast.LENGTH_SHORT).show();
                            Intent nuevomenu = new Intent(MainActivity.this, Menu.class);
                            startActivity(nuevomenu);

                        } else {
                            Toast.makeText(getApplicationContext(), "Usuario o Contraseña incorrectos", Toast.LENGTH_SHORT).show();
                        }
                }
            }
        });


    }

    @Override
    public void onClick(View v) {

    }
}
