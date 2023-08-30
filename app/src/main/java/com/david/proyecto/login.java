package com.david.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void abrirCompras(View view){
        Intent intent = new Intent(login.this, compras.class);
        startActivity(intent);
    };

    public void abrirRegistrarse(View view){
        Intent intent = new Intent(login.this, registro.class);
        startActivity(intent);
    };
}