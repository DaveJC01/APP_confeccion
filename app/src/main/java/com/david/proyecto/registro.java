package com.david.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import java.lang.reflect.Array;

public class registro extends AppCompatActivity {

        private Spinner spinnerText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        spinnerText = findViewById(R.id.spinnerText);

        String[] document = getResources().getStringArray(R.array.document);
        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item, document);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerText.setAdapter(adapter);



    }
public void regresarInicio(View view){
    Intent intent = new Intent(registro.this, login.class);
    startActivity(intent);

}

}