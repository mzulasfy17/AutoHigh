package com.example.autohigh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Porschee extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_porschee);

        ImageView a918 = findViewById(R.id.a918);
        ImageView a911 = findViewById(R.id.a911);
        ImageView Cayman = findViewById(R.id.cayman);
        ImageView Taycan = findViewById(R.id.taycan);
        ImageView carrera = findViewById(R.id.carrera);

        a918.setOnClickListener(this);
        a911.setOnClickListener(this);
        Cayman.setOnClickListener(this);
        Taycan.setOnClickListener(this);
        carrera.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.a918) {

            Detail Porschee = new Detail();
            Porschee.setName("918 Spyder");
            Porschee.setPrice("Rp. 11.600.000.000");
            Porschee.setEngineType("Engine Type : Hybrid");
            Porschee.setAcceleration("Acceleration : 0-100 = 2,6s");
            Porschee.setTopSpeed("Top Speed : 345 KM/H");
            Porschee.setPower("Power : 608 HP");
            Porschee.setImage("_18");

            Intent intent = new Intent(Porschee.this, MrkDetail.class);
            intent.putExtra(MrkDetail.KEY_DATA, Porschee);
            startActivity(intent);
        }
        if (v.getId() == R.id.a911) {

            Detail Porschee = new Detail();
            Porschee.setName("911 Targa");
            Porschee.setPrice("Rp. 7.140.000.000");
            Porschee.setEngineType("Engine Type : Petrol");
            Porschee.setAcceleration("Acceleration : 0-100 = 3,8 - 4,4s");
            Porschee.setTopSpeed("Top Speed : 289-305 KM/H");
            Porschee.setPower("Power : 385 HP");
            Porschee.setImage("_11_targa");

            Intent intent = new Intent(Porschee.this, MrkDetail.class);
            intent.putExtra(MrkDetail.KEY_DATA, Porschee);
            startActivity(intent);
        }
        if (v.getId() == R.id.cayman) {

            Detail Porschee = new Detail();
            Porschee.setName("Cayman GT");
            Porschee.setPrice("Rp. 5.500.000.000");
            Porschee.setEngineType("Engine Type : Patrol");
            Porschee.setAcceleration("Acceleration : 0-100 = 3,9 - 4,4s");
            Porschee.setTopSpeed("Top Speed : 302-304 KM/H");
            Porschee.setPower("Power : 420 HP");
            Porschee.setImage("cayman_gt");

            Intent intent = new Intent(Porschee.this, MrkDetail.class);
            intent.putExtra(MrkDetail.KEY_DATA, Porschee);
            startActivity(intent);
        }
        if (v.getId() == R.id.taycan) {

            Detail Porschee = new Detail();
            Porschee.setName("Taycan");
            Porschee.setPrice("Rp. 2.500.000.000");
            Porschee.setEngineType("Engine Type : Electric");
            Porschee.setAcceleration("Acceleration : 0-100 = 2,8 - 5,1s");
            Porschee.setTopSpeed("Top Speed : 230-260 KM/H");
            Porschee.setPower("Power : 530 HP");
            Porschee.setImage("taycan");

            Intent intent = new Intent(Porschee.this, MrkDetail.class);
            intent.putExtra(MrkDetail.KEY_DATA, Porschee);
            startActivity(intent);
        }
        if (v.getId() == R.id.carrera) {

            Detail Porschee = new Detail();
            Porschee.setName("Carrera GT");
            Porschee.setPrice("Rp. 18.000.000.000");
            Porschee.setEngineType("Engine Type : Patrol");
            Porschee.setAcceleration("Acceleration : 0-100 = 3,9s");
            Porschee.setTopSpeed("Top Speed : 330 KM/H");
            Porschee.setPower("Power : 612 HP");
            Porschee.setImage("carrera");

            Intent intent = new Intent(Porschee.this, MrkDetail.class);
            intent.putExtra(MrkDetail.KEY_DATA, Porschee);
            startActivity(intent);
        }
    }
}