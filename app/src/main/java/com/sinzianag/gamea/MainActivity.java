package com.sinzianag.gamea;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setTypeface(Typeface.createFromAsset(getAssets(),"Fragmentcore.otf"));
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, Game.class);
        startActivity(intent);
    }

}
