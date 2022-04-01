package com.example.tomaaguaapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class RecuperarC_Usuario extends AppCompatActivity {
    Button btnRU;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_cusuario);
        btnRU= findViewById(R.id.buttonrecuperarus);
        btnRU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RecuperarC();
            }
        });
    }
    private void RecuperarC(){
        AlertDialog.Builder builder = new AlertDialog.Builder(RecuperarC_Usuario.this);
        builder.setTitle("Recuperar Contraseña");
        builder.setMessage("Se enviara un mensaje al area de sistemas para que se cambie su contraseña ¿Desea proseguir?")
                .setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        Toast.makeText(RecuperarC_Usuario.this, "Se ha enviado el mensaje exitosamente", Toast.LENGTH_SHORT).show();
                        dialogInterface.dismiss();
                    }
                })
                .setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(RecuperarC_Usuario.this, "Cancelado", Toast.LENGTH_SHORT).show();
                    }
                })
                .setCancelable(false)
                .show();
    }
}