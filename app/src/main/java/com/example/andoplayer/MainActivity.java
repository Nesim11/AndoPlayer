package com.example.andoplayer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView videoView;
    private  String MEDIA_PATH = Environment.getExternalStorageDirectory().getPath() + "/Download/Reel2.mp4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE}, PackageManager.PERMISSION_GRANTED);

        videoView = findViewById(R.id.videoView);

        videoView.setVideoPath(MEDIA_PATH);

    }

    public  void  PlayButton(View view) {
        if (videoView.isPlaying())
        {
            videoView.resume();
        }

        else {
            videoView.start();
        }



    }

    public  void  PauseButton(View view) {
        videoView.pause();

    }
}
