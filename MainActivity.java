package com.example.johns.game;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    //declare
    Context context;
    TextView update_text_1;
    TextView update_text_2;
    TextView update_text_3;
    TextView update_text_4;

    //Global variables for song
    Random rand = new Random();
    int numSongs = 9;
    int random1 = (int) (Math.random() * numSongs + 1);   //song choice
    int random2 = (int) (Math.random() * 4 + 1);    //correct box
    int random3 = (int) (Math.random() * numSongs + 1); //wrong1
    int random4 = (int) (Math.random() * numSongs + 1); //wrong2
    int random5 = (int) (Math.random() * numSongs + 1);//wrong3


    //Set up MediaPlayer
MediaPlayer mySound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //set up context
        this.context = this;


        //initialize text update box
        update_text_1 = (TextView) findViewById(R.id.buttontext1);
        update_text_2 = (TextView) findViewById(R.id.buttontext2);
        update_text_3 = (TextView) findViewById(R.id.buttontext3);
        update_text_4 = (TextView) findViewById(R.id.buttontext4);


        ImageButton choice_1 = (ImageButton) findViewById(R.id.imageButton1);
        ImageButton choice_2 = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton choice_3 = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton choice_4 = (ImageButton) findViewById(R.id.imageButton4);


        while (random3 == random1) {
            random3 = (int) (Math.random() * numSongs + 1);
        }
        while (random4 == random3 || random4 == random1) {
            random4 = (int) (Math.random() * numSongs + 1);
        }
        while (random5 == random4 || random5 == random3 || random5 == random1) {
            random5 = (int) (Math.random() * numSongs + 1);
        }

        //song array
        String[] song = new String[numSongs + 1];

        //song titles
        song[0] = "lul";
        song[1] = "Fix You - Coldplay";
        song[2] = "Held Me Down - NAV";
        song[3] = "River - Eminem";
        song[4] = "Redbone - Childish Gambino";
        song[5] = "Slide - Calvin Harris";
        song[6] = "Perfect - Ed Sheeran";
        song[7] = "Bohemian Rhapsody - Queen";
        song[8] = "Reflection - Mulan";
        song[9] = "Exchange - Bryson Tiller";


        // ------ [song choice starts here] -------//

        if (random1 == 1) {

            mySound = MediaPlayer.create(this, R.raw.coldplay);
            mySound.start();
        }

        if (random1 == 2) {

            mySound = MediaPlayer.create(this, R.raw.nav);
            mySound.start();
        }

        if (random1 == 3) {

            mySound = MediaPlayer.create(this, R.raw.eminem);
            mySound.start();
        }

        if (random1 == 4) {

            mySound = MediaPlayer.create(this, R.raw.childish);
            mySound.start();
        }

        if (random1 == 5) {

            mySound = MediaPlayer.create(this, R.raw.calvin);
            mySound.start();
        }

        if (random1 == 6) {

            mySound = MediaPlayer.create(this, R.raw.ed);
            mySound.start();
        }

        if (random1 == 7) {

            mySound = MediaPlayer.create(this, R.raw.queen);
            mySound.start();
        }

        if (random1 == 8) {

            mySound = MediaPlayer.create(this, R.raw.mulan);
            mySound.start();
        }

        if (random1 == 9) {

            mySound = MediaPlayer.create(this, R.raw.bryson);
            mySound.start();
        }


        // ------ [song choice ends here] -------//


        //update button text boxes

        if (random2 == 1) {
            update_text_1.setText(song[random1]);
            update_text_2.setText(song[random3]);
            update_text_3.setText(song[random4]);
            update_text_4.setText(song[random5]);
        }

        if (random2 == 2) {
            update_text_1.setText(song[random3]);
            update_text_2.setText(song[random1]);
            update_text_3.setText(song[random4]);
            update_text_4.setText(song[random5]);
        }

        if (random2 == 3) {
            update_text_1.setText(song[random3]);
            update_text_2.setText(song[random4]);
            update_text_3.setText(song[random1]);
            update_text_4.setText(song[random5]);
        }

        if (random2 == 4) {
            update_text_1.setText(song[random3]);
            update_text_2.setText(song[random4]);
            update_text_3.setText(song[random5]);
            update_text_4.setText(song[random1]);
        }

    }


    //when button is clicked

        public void selectSong1(View view) {

            //if song is correct
            if (random2 == 1) {
                mySound.stop();
                mySound = MediaPlayer.create(this, R.raw.correct);
                mySound.start();
                finish();
                startActivity(getIntent());

            }
            else {
                mySound.stop();
                mySound = MediaPlayer.create(this, R.raw.incorrect);
                mySound.start();
                finish();
                startActivity(getIntent());
            }
        }

        public void selectSong2(View view) {
            //if song is correct
            if (random2 == 2) {
                mySound.stop();
                mySound = MediaPlayer.create(this, R.raw.correct);
                mySound.start();
                finish();
                startActivity(getIntent());

            }
            else {
                mySound.stop();
                mySound = MediaPlayer.create(this, R.raw.incorrect);
                mySound.start();
                finish();
                startActivity(getIntent());
            }
        }
        public void selectSong3(View view) {
            //if song is correct
            if (random2 == 3) {
                mySound.stop();
                mySound = MediaPlayer.create(this, R.raw.correct);
                mySound.start();
                finish();
                startActivity(getIntent());

            }
            else {
                mySound.stop();
                mySound = MediaPlayer.create(this, R.raw.incorrect);
                mySound.start();
                finish();
                startActivity(getIntent());
            }
        }

        public void selectSong4(View view) {
            //if song is correct
            if (random2 == 4) {
                mySound.stop();
                mySound = MediaPlayer.create(this, R.raw.correct);
                mySound.start();
                finish();
                startActivity(getIntent());

            }
            else {
                mySound.stop();
                mySound = MediaPlayer.create(this, R.raw.incorrect);
                mySound.start();
                finish();
                startActivity(getIntent());
            }
        }


}










