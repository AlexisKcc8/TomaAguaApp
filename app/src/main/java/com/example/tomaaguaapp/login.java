package com.example.tomaaguaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login extends AppCompatActivity {

    Button btn_login, btn_admin;
    TextView forgotPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn_login = findViewById(R.id.button);
        btn_admin = findViewById(R.id.button_login_admin);
        forgotPass = findViewById(R.id.forgot_pass);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(login.this, Activity_home.class);
                startActivity(i);
                finish();
            }
        });

        btn_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(login.this, RegistroGarrafones.class);
                startActivity(i);
                finish();
            }
        });

        forgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(login.this, RecuperarC_Usuario.class);
                startActivity(i);
            }
        });
    }
}