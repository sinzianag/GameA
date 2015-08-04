package com.sinzianag.gamea;

import android.animation.Animator;
import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;


public class Game extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_game);

        ImageView center = (ImageView) findViewById(R.id.center);
        ImageView ball1 = (ImageView) findViewById(R.id.ball1);
        ImageView ball2 = (ImageView) findViewById(R.id.ball2);
        ImageView ball3 = (ImageView) findViewById(R.id.ball3);
        ImageView ball4 = (ImageView) findViewById(R.id.ball4);
        ImageView ball5 = (ImageView) findViewById(R.id.ball5);
        ImageView ball6 = (ImageView) findViewById(R.id.ball6);
        ImageView ball7 = (ImageView) findViewById(R.id.ball7);
        ImageView ball8 = (ImageView) findViewById(R.id.ball8);

        int X = 360;
        int Y = 600;
        int radius = 350;
        int newX = (int)Math.round(0.7071 * radius);
        int newy = (int)Math.round(0.7071 * radius);

        center.setX(X);
        center.setY(Y);

        X += 130;
        Y += 130;

        ball1.setX(X - radius); ball2.setX(X + radius); ball3.setX(X);
        ball1.setY(Y); ball2.setY(Y); ball3.setY(Y - radius);

        ball5.setX(X);
        ball5.setY(Y + radius);


        ball4.setX(X - newX); ball6.setX(X - newX); ball7.setX(X + newX);
        ball4.setY(Y + newy); ball6.setY(Y - newy); ball7.setY(Y - newy);

        ball8.setX(X + newX);
        ball8.setY(Y + newy);

        final Animation animRotate = AnimationUtils.loadAnimation(this,
                R.anim.anim_rotate);

        final Animation rot = new RotateAnimation(0.0f,360.0f,X,Y);
        rot.setDuration(5000);
        rot.setRepeatCount(100);
        rot.setRepeatMode(2);

        ball1.startAnimation(rot);
        ball2.startAnimation(rot);
        ball3.startAnimation(rot);
        ball4.startAnimation(rot);
        ball5.startAnimation(rot);
        ball6.startAnimation(rot);
        ball7.startAnimation(rot);
        ball8.startAnimation(rot);

    }

}
