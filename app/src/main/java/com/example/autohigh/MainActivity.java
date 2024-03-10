package com.example.autohigh;

import static com.example.autohigh.R.id.koenigsegg3;
import static com.example.autohigh.R.id.lamborgini;
import static com.example.autohigh.R.id.lamborgini3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView Lamborghini = findViewById(R.id.lamborgini3);
        ImageView Koenigsegg = findViewById(koenigsegg3);
        ImageView Porsche = findViewById(R.id.porsche3);

        Lamborghini.setOnClickListener(this);
        Koenigsegg.setOnClickListener(this);
        Porsche.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.lamborgini3) {
            Intent Lamborghini = new Intent(MainActivity.this, Lamborghinii.class);
            startActivity(Lamborghini);
        } else if (v.getId() == R.id.koenigsegg3){
            Intent Koenigsegg = new Intent(MainActivity.this, Koenigsegg.class);
            startActivity(Koenigsegg);
        } else if (v.getId() == R.id.porsche3) {
            Intent Porsche = new Intent(MainActivity.this, Porschee.class);
            startActivity(Porsche);
        }
    }
}
