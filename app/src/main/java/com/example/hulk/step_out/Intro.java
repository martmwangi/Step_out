package com.example.hulk.step_out;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class Intro extends AppIntro {



    @Override
    public void init(Bundle savedInstanceState) {

             addSlide(AppIntroFragment.newInstance("Step Out", "Buy movie Tickets",R.drawable.happ, Color.parseColor("#26A69A")));
             addSlide(AppIntroFragment.newInstance("Don`t Be shy", "Don`t settle for this",R.drawable.tv, Color.parseColor("#4DB6AC")));
             addSlide(AppIntroFragment.newInstance("Book your seat", "And pay for it here",R.drawable.phone, Color.parseColor("#00897B")));

        setBarColor(Color.parseColor("#004D40"));
        setSeparatorColor(Color.parseColor("#004D40"));

        showSkipButton(true);
        showDoneButton(true);

        setFadeAnimation();

    }

    @Override
    public void onSkipPressed() {
        Intent skip = new Intent(this,Nowshowing.class);
        startActivity(skip);

    }

    @Override
    public void onDonePressed() {
        Intent done = new Intent(this,Nowshowing.class);
        startActivity(done);

    }
}
