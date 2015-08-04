package com.sinzianag.gamea;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class GameActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Resources res = getResources();

        setContentView(R.layout.activity_game2);
        final GameCanvas pie = (GameCanvas) this.findViewById(R.id.pie);
        pie.addItem("Agamemnon", 3, res.getColor(R.color.seafoam));
        pie.addItem("Bocephus", 3, res.getColor(R.color.chartreuse));
        pie.addItem("Calliope", 3, res.getColor(R.color.emerald));
        pie.addItem("Daedalus", 3, res.getColor(R.color.bluegrass));
        pie.addItem("Euripides", 3, res.getColor(R.color.turquoise));
        pie.addItem("Ganymede", 3, res.getColor(R.color.slate));

        pie.startSpin();

        ((Button) findViewById(R.id.button2)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                pie.fire();
            }
        });
    }

}
