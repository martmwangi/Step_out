package com.example.hulk.step_out;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class Intro extends AppIntro {



    @Override
    public void init(Bundle savedInstanceState) {

             addSlide(AppIntroFragment.newInstance("Step Out", "Buy movie Tickets",R.drawable.spec, Color.parseColor("#3E2723")));
             addSlide(AppIntroFragment.newInstance("Don`t Be shy", "check us out",R.drawable.tick, Color.parseColor("#ff070606")));
             addSlide(AppIntroFragment.newInstance("You coolio", "No outside snacks allowed!!",R.drawable.movietime, Color.parseColor("#C5E1A5")));

        setBarColor(Color.parseColor("#37474F"));
        setSeparatorColor(Color.parseColor("#3E2723"));

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
