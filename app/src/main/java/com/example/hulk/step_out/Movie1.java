package com.example.hulk.step_out;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;



//importing youtube classes


public class Movie1 extends YouTubeBaseActivity {
    public static final String API_KEY = "AIzaSyDIl6QdgO9Bb2ATa_xkznJcn02yRKFFJEg";
    public static final String VIDEO_ID = "Zd7Oxg6pm9M";
    private YouTubePlayer player;
    Button b;
    private YouTubePlayer.OnInitializedListener onInitializedListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        /** Initializing YouTube player view **/
        final YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_player);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("VIDEO_ID");

            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                youTubePlayerView.initialize("AIzaSyDIl6QdgO9Bb2ATa_xkznJcn02yRKFFJEg",onInitializedListener);
            }
        });

    }



}
