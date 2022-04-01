package com.example.tomaaguaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PrincipalAdminActivity extends AppCompatActivity {

    Button btn_ver_reporte,btn_dar_alta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_admin);

        btn_ver_reporte = findViewById(R.id.button_reportes);
        btn_dar_alta = findViewById(R.id.button_dar_alta);

        btn_dar_alta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PrincipalAdminActivity.this, Activity_Registro.class);
                startActivity(i);
            }
        });

        /*btn_ver_reporte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PrincipalAdminActivity.this, VerrReportes.class);
                startActivity(i);
                /*Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "Toast por defecto", Toast.LENGTH_SHORT);

                toast1.show();
            }
        });*/
    }
}