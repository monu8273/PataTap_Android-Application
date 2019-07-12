package com.example.mypatatap;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void playMusic(View view){
        int id = view.getId();
        Log.i("id","id value is " + id);

        String nameId = view.getResources().getResourceEntryName(id);
        Log.i("nameId", "The nameId is " + nameId);

        int myMusic = getResources().getIdentifier(nameId, "raw", "com.example.mypatatap");
        MediaPlayer mediaPlayer = MediaPlayer.create(this, myMusic);

        mediaPlayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
