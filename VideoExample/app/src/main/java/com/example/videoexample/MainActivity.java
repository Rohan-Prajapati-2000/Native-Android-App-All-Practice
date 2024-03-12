package com.example.videoexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set screen orientation to landscape
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


        setContentView(R.layout.activity_main);

        videoView=findViewById(R.id.videoView);

        String vPath = "android.resource://" + getPackageName() + "/raw/taqdeer";

        Uri videoUri = Uri.parse(vPath);
        videoView.setVideoURI(videoUri);
        // Add media controller for play, pause, seekbar, etc.
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);

        // Ensure the videoView takes up the entire screen
        videoView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(
                android.view.ViewGroup.LayoutParams.MATCH_PARENT,
                android.view.ViewGroup.LayoutParams.MATCH_PARENT));

        videoView.start();

    }
}