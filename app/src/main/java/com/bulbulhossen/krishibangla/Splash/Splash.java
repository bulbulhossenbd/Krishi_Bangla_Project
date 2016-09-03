package com.bulbulhossen.krishibangla.Splash;

/**
 * Created by bulbulhossen on 8/31/16.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

import com.bulbulhossen.krishibangla.Grid_Adapter_MainActivity.Grid_main_Activity;
import com.bulbulhossen.krishibangla.R;


/**
 * Created by appsd on 06-Apr-16.
 */
public class Splash extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        //title hackathon
        TextView text = (TextView) findViewById(R.id.hackathon);
        Animation animation = new TranslateAnimation(0, 0, 0, 200);
        animation.setDuration(5000);
        animation.setRepeatMode(Animation.RESTART);
        animation.setRepeatCount(Animation.INFINITE);
        text.startAnimation(animation);
// applying animation to textview object..


        //year  2016
        TextView tv = (TextView) findViewById(R.id.year);
        Animation animation2 = new TranslateAnimation(500, 0, 0, 0);
        animation.setDuration(5000);
        animation.setRepeatMode(Animation.RESTART);
        animation.setRepeatCount(Animation.INFINITE);
        tv.startAnimation(animation2);
// applying animation to textview object..



        /*Luncher sereen : Splash*/

        Thread myThread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3500);
                    Intent startMainscreen = new Intent(getApplicationContext(), Grid_main_Activity.class);
                    startActivity(startMainscreen);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        myThread.start();
    }
}

