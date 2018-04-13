package com.example.xp.isonidos_android2018;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    SoundPool sonidos;
    int sonido1;
    int sonido2;
    int sonido3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sonidos = new SoundPool(4, AudioManager.STREAM_MUSIC,0);
        sonido1 = sonidos.load(this, R.raw.ramonpitis_orejudo,1);
        sonido2 = sonidos.load(this,R.raw.simpsons_correplatano,1);
        sonido3 = sonidos.load(this,R.raw.me_da_igual,1);
    }
    public void sonido(View vista)
    {
        Button b= (Button) findViewById(vista.getId());
        Integer.valueOf(b.getTag().toString());
        // MediaPlayer mp = MediaPlayer.create(this, R.raw.simpsons_correplatano);
        // mp.start();
        sonidos.play(sonido1,1,1,1,0,1f);
        sonidos.play(sonido2,1,1,1,0,1f);
        sonidos.play(sonido3,1,1,1,0,1f);
    }
}
