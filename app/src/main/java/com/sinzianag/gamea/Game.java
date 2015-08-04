package com.sinzianag.gamea;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.widget.ImageView;


public class Game extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_game);

        ImageView center = (ImageView) findViewById(R.id.center);
        ImageView ball1 = (ImageView) findViewById(R.id.ball1);

            center.setX(360);
            center.setY(600);

    }

}
