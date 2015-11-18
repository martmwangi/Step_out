package com.example.hulk.step_out;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.yalantis.guillotine.animation.GuillotineAnimation;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class Comingsoon extends AppCompatActivity {
    private static final long RIPPLE_DURATION = 250;


    @InjectView(R.id.toolbar)
    Toolbar toolbar;
    @InjectView(R.id.root)
    FrameLayout root;
    @InjectView(R.id.content_hamburger)
    View contentHamburger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comingsoon);
        ButterKnife.inject(this);


        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle(null);
        }

        View guillotineMenu = LayoutInflater.from(this).inflate(R.layout.guillotine, null);
        root.addView(guillotineMenu);

        new GuillotineAnimation.GuillotineBuilder(guillotineMenu, guillotineMenu.findViewById(R.id.guillotine_hamburger), contentHamburger)
                .setStartDelay(RIPPLE_DURATION)
                .setActionBarViewForAnimation(toolbar)
                .setClosedOnStart(true)
                .build();
        LinearLayout click1 = (LinearLayout) guillotineMenu.findViewById(R.id.now_showing);
        click1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Nowshowing.class);
                startActivity(i);

            }
        });
        LinearLayout click2 = (LinearLayout) guillotineMenu.findViewById(R.id.coming_soon);
        click2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(getApplicationContext(),Comingsoon.class);
                startActivity(j);

            }
        });
        LinearLayout click3 = (LinearLayout) guillotineMenu.findViewById(R.id.offers);
        click3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(),Offers.class);
                startActivity(k);

            }
        });
        LinearLayout click4 = (LinearLayout) guillotineMenu.findViewById(R.id.contact);
        click4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(getApplicationContext(),Contact.class);
                startActivity(l);

            }
        });
        LinearLayout click5 = (LinearLayout) guillotineMenu.findViewById(R.id.feedback);
        click5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(getApplicationContext(),Feedback.class);
                startActivity(m);

            }
        });

    }
}

