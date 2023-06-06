package com.example.marsound;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Buttons to hit

    private Button btnAnotherOne;
    private Button btnBingChilling;
    private Button btnBruh;
    private Button btnFiveGum;
    private Button btnOof;
    private Button btnJohnCena;
    private Button btnLebron;
    private Button btnSeinfeld;
    private Button btnTwoHoursLater;
    private Button btnTakeTheL;
    private Button btnTrey;
    private Button btnWasted;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAnotherOne = findViewById(R.id.btn_anotherone);
        btnBingChilling = findViewById(R.id.btn_bingchilling);
        btnBruh = findViewById(R.id.btn_bruh);
        btnFiveGum = findViewById(R.id.btn_fivegum);
        btnOof = findViewById(R.id.btn_oof);
        btnJohnCena = findViewById(R.id.btn_johncena);
        btnLebron = findViewById(R.id.btn_lebron);
        btnSeinfeld = findViewById(R.id.btn_seinfeld);
        btnTwoHoursLater = findViewById(R.id.btn_twohourslater);
        btnTakeTheL = findViewById(R.id.btn_takethel);
        btnTrey = findViewById(R.id.btn_trey);
        btnWasted = findViewById(R.id.btn_wasted);


        btnAnotherOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAnotherOne();
            }
        });

        btnBingChilling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { playBingChilling();
            }
        });

        btnBruh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { playBruh();
            }
        });

        btnFiveGum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { playFiveGum();
            }
        });

        btnOof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { playOof();
            }
        });

        btnJohnCena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { playJohnCena();
            }
        });

        btnLebron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { playLebron();
            }
        });

        btnSeinfeld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { playSeinfeld();
            }
        });

        btnTwoHoursLater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { playTwoHoursLater();
            }
        });

        btnTakeTheL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { playTakeTheL();
            }
        });

        btnTrey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { playTrey();
            }
        });

        btnWasted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { playWasted();
            }
        });
    }

    private void playWasted() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_marsoundwasted);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playTrey() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_marsoundtrey);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playTakeTheL() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_marsound_takethel);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playTwoHoursLater() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_marsound_twohourslater);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playSeinfeld() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_marsoundseinfeld);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playLebron() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_marsoundlebron);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playJohnCena() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_marsound_johncena);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playOof() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_marsound_oof);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playFiveGum() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_marsound_fivegum);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playBruh() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_marsound_bruh);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
         });
    }

    private void playBingChilling() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_marsound_bingchilling);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }


    private void playAnotherOne(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_marsound_anotherone);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }
}