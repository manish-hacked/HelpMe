package com.example.rakesh.hackfest;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Selectcity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectcity1);
        Button b1,b2,b3,b4,b5;
        b1= (Button) findViewById(R.id.dhanbad);
        b2= (Button) findViewById(R.id.ranchi);
        b3= (Button) findViewById(R.id.ramgarh);
        b4= (Button) findViewById(R.id.bokaro);
        b5= (Button) findViewById(R.id.kolkatta);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dhanbad = new Intent(Selectcity1.this,Map1.class);
                startActivity(dhanbad);
            }
        });
    }

}
