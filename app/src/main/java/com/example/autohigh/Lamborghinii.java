package com.example.autohigh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Lamborghinii extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lamborghinii);

        ImageView Aventador = findViewById(R.id.Aventador);
        ImageView Centenario = findViewById(R.id.Centenario);
        ImageView Huracan = findViewById(R.id.Huracan);
        ImageView Veneno = findViewById(R.id.Veneno);
        ImageView urus = findViewById(R.id.urus);

        Aventador.setOnClickListener(this);
        Centenario.setOnClickListener(this);
        Huracan.setOnClickListener(this);
        Veneno.setOnClickListener(this);
        urus.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.Aventador) {

            Detail Lamborghini = new Detail();
            Lamborghini.setName("Aventador");
            Lamborghini.setPrice("Rp. 8.700.000.000");
            Lamborghini.setEngineType("Engine Type : Patrol");
            Lamborghini.setAcceleration("Acceleration : 0-100 = 2,8s");
            Lamborghini.setTopSpeed("Top Speed : 350 KM/H");
            Lamborghini.setPower("Power : 740 HP");
            Lamborghini.setImage("aventador");

            Intent intent = new Intent(Lamborghinii.this, MrkDetail.class);
            intent.putExtra(MrkDetail.KEY_DATA, Lamborghini);
            startActivity(intent);
        }
        if (v.getId() == R.id.Centenario) {
            Detail Lamborghini = new Detail();
            Lamborghini.setName("Centenario");
            Lamborghini.setPrice("Rp. 27.400.000.000");
            Lamborghini.setEngineType("Engine Type : Patrol");
            Lamborghini.setAcceleration("Acceleration : 0-100 = 2,8s");
            Lamborghini.setTopSpeed("Top Speed : 350 KM/H");
            Lamborghini.setPower("Power : 770 HP");
            Lamborghini.setImage("centenario");

            Intent intent = new Intent(Lamborghinii.this, MrkDetail.class);
            intent.putExtra(MrkDetail.KEY_DATA, Lamborghini);
            startActivity(intent);
        }
        if (v.getId() == R.id.Huracan) {
            Detail Lamborghini = new Detail();
            Lamborghini.setName("Huracan");
            Lamborghini.setPrice("Rp. 8.900.000.000");
            Lamborghini.setEngineType("Engine Type : Patrol");
            Lamborghini.setAcceleration("Acceleration : 0-100 = 2,9s");
            Lamborghini.setTopSpeed("Top Speed : 319-325 KM/H");
            Lamborghini.setPower("Power : 610 HP");
            Lamborghini.setImage("huracan");

            Intent intent = new Intent(Lamborghinii.this, MrkDetail.class);
            intent.putExtra(MrkDetail.KEY_DATA, Lamborghini);
            startActivity(intent);
        }
        if (v.getId() == R.id.Veneno) {
            Detail Lamborghini = new Detail();
            Lamborghini.setName("Veneno Roadster");
            Lamborghini.setPrice("Rp. 130.000.000.000");
            Lamborghini.setEngineType("Engine Type : Patrol");
            Lamborghini.setAcceleration("Acceleration : 0-100 = 2,8s");
            Lamborghini.setTopSpeed("Top Speed : 355 KM/H");
            Lamborghini.setPower("Power : 750 HP");
            Lamborghini.setImage("veneno_roadster");

            Intent intent = new Intent(Lamborghinii.this, MrkDetail.class);
            intent.putExtra(MrkDetail.KEY_DATA, Lamborghini);
            startActivity(intent);
        }
        if (v.getId() == R.id.urus) {
            Detail Lamborghini = new Detail();
            Lamborghini.setName("Urus");
            Lamborghini.setPrice("Rp. 8.400.000.000");
            Lamborghini.setEngineType("Engine Type : Patrol");
            Lamborghini.setAcceleration("Acceleration : 0-100 = 3,6s");
            Lamborghini.setTopSpeed("Top Speed : 305 KM/H");
            Lamborghini.setPower("Power : 650 HP");
            Lamborghini.setImage("urus");

            Intent intent = new Intent(Lamborghinii.this, MrkDetail.class);
            intent.putExtra(MrkDetail.KEY_DATA, Lamborghini);
            startActivity(intent);
        }
    }

}
