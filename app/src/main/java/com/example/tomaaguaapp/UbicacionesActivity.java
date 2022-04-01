package com.example.tomaaguaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class UbicacionesActivity extends AppCompatActivity {

    Spinner spListaUbicaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubicaciones);

        spListaUbicaciones = findViewById(R.id.spinnerEdificios);

    }
}