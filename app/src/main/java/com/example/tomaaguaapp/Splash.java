package com.example.tomaaguaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class Splash extends AppCompatActivity {
    TextView txt_title, txt_slogan;
    LottieAnimationView img_animation;
    ProgressBar pbar;
    Handler handler = new Handler();
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        pbar = findViewById(R.id.pb_splash);

        img_animation = findViewById(R.id.img_animation);
        img_animation.animate().translationX(-2000).setDuration(1000).setStartDelay(9000);

        txt_title = findViewById(R.id.txt_title);
        txt_title.animate().translationX(2000).setDuration(1000).setStartDelay(9000);

        txt_slogan = findViewById(R.id.txt_slogan);
        txt_slogan.animate().translationX(2000).setDuration(1000).setStartDelay(9000);

        progressMethod();
    }


    public void progressMethod(){
        Thread hilo = new Thread(new Runnable() {
            @Override
            public void run() {
                while(i<=100){
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            pbar.setProgress(i);
                        }
                    });
                    i++;
                    try {
                        Thread.sleep(100);
                    }catch (Exception ex){

                    }
                    if(i==100){
                        //Toast.makeText(MainActivity.this, "Se lleno", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Splash.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        });
        hilo.start();
    }
}