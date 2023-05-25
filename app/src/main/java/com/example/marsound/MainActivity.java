package com.example.marsound;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Buttons to hit

    private Button btnQuandale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnQuandale = findViewById(R.id.btn_quandale);

        btnQuandale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playQuandale();
            }
        });
    }


    private void playQuandale(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sound_quandale);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp = null;
            }
        });
    }
}