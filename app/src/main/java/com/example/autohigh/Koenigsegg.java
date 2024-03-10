package com.example.autohigh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Koenigsegg extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koenigsegg);

        ImageView Regera = findViewById(R.id.regera);
        ImageView Agera = findViewById(R.id.agera);
        ImageView One = findViewById(R.id.one_1);
        ImageView ccr = findViewById(R.id.ccr4);
        ImageView ccx = findViewById(R.id.ccx4);

        Regera.setOnClickListener(this);
        Agera.setOnClickListener(this);
        One.setOnClickListener(this);
        ccr.setOnClickListener(this);
        ccx.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.regera) {

            Detail Koenigsegg = new Detail();
            Koenigsegg.setName("Regera");
            Koenigsegg.setPrice("Rp. 27.000.000.000");
            Koenigsegg.setEngineType("Engine Type : Hybrid");
            Koenigsegg.setAcceleration("Acceleration : 0-100 = 2,8s");
            Koenigsegg.setTopSpeed("Top Speed : 400 KM/H");
            Koenigsegg.setPower("Power : 1100 HP");
            Koenigsegg.setImage("regera");

            Intent intent = new Intent(Koenigsegg.this, MrkDetail.class);
            intent.putExtra(MrkDetail.KEY_DATA, Koenigsegg);
            startActivity(intent);
        }
        if (v.getId() == R.id.agera) {

            Detail Koenigsegg = new Detail();
            Koenigsegg.setName("Agera");
            Koenigsegg.setPrice("Rp. 58.000.000.000");
            Koenigsegg.setEngineType("Engine Type : Patrol");
            Koenigsegg.setAcceleration("Acceleration : 0-100 = 2,9s");
            Koenigsegg.setTopSpeed("Top Speed : 402-443 KM/H");
            Koenigsegg.setPower("Power : 1115 HP");
            Koenigsegg.setImage("agera");

            Intent intent = new Intent(Koenigsegg.this, MrkDetail.class);
            intent.putExtra(MrkDetail.KEY_DATA, Koenigsegg);
            startActivity(intent);
        }
        if (v.getId() == R.id.one_1) {

            Detail Koenigsegg = new Detail();
            Koenigsegg.setName("One:1");
            Koenigsegg.setPrice("Rp. 84.000.000.000");
            Koenigsegg.setEngineType("Engine Type : Patrol");
            Koenigsegg.setAcceleration("Acceleration : 0-100 = 2,5s");
            Koenigsegg.setTopSpeed("Top Speed : 405 KM/H");
            Koenigsegg.setPower("Power : 1360 HP");
            Koenigsegg.setImage("one");

            Intent intent = new Intent(Koenigsegg.this, MrkDetail.class);
            intent.putExtra(MrkDetail.KEY_DATA, Koenigsegg);
            startActivity(intent);
        }
        if (v.getId() == R.id.ccr4) {

            Detail Koenigsegg = new Detail();
            Koenigsegg.setName("CCR");
            Koenigsegg.setPrice("Rp. 40.000.000.000");
            Koenigsegg.setEngineType("Engine Type : Patrol");
            Koenigsegg.setAcceleration("Acceleration : 0-100 = 3,2s");
            Koenigsegg.setTopSpeed("Top Speed : 395 KM/H");
            Koenigsegg.setPower("Power : 806 HP");
            Koenigsegg.setImage("ccr");

            Intent intent = new Intent(Koenigsegg.this, MrkDetail.class);
            intent.putExtra(MrkDetail.KEY_DATA, Koenigsegg);
            startActivity(intent);
        }
        if (v.getId() == R.id.ccx4) {

            Detail Koenigsegg = new Detail();
            Koenigsegg.setName("CCX");
            Koenigsegg.setPrice("Rp. 64.000.000.000");
            Koenigsegg.setEngineType("Engine Type : Patrol");
            Koenigsegg.setAcceleration("Acceleration : 0-100 = 2,9-3,2s");
            Koenigsegg.setTopSpeed("Top Speed : 395-400 KM/H");
            Koenigsegg.setPower("Power : 806 HP");
            Koenigsegg.setImage("ccx");

            Intent intent = new Intent(Koenigsegg.this, MrkDetail.class);
            intent.putExtra(MrkDetail.KEY_DATA, Koenigsegg);
            startActivity(intent);
        }
    }
}