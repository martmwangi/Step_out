package com.example.hulk.step_out;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;


public class Splash extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 4000;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splash.this, Intro.class);
                startActivity(i);

//                To close activity
                finish();

            }

        }, SPLASH_TIME_OUT);
//For the name animation
        YoYo.with(Techniques.FadeIn)
                .duration(700)
                .playOn(findViewById(R.id.textView2));
    }
    void startAnim(){
        findViewById(R.id.avloadingIndicatorView).setVisibility(View.VISIBLE);
    }
}
