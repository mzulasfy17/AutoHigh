package com.example.autohigh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MrkDetail extends AppCompatActivity {

    public static final String KEY_DATA ="key_object";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mrk_detail);

        ImageView Image = findViewById(R.id.detailA);
        TextView Name = findViewById(R.id.detailB);
        TextView Price = findViewById(R.id.detailC);
        TextView TypeEngine = findViewById(R.id.detailD);
        TextView Acceleration = findViewById(R.id.detailE);
        TextView TopSpeed = findViewById(R.id.detailF);
        TextView Power = findViewById(R.id.detailG);
        Button btnShare = findViewById(R.id.btnShare);

        // Menambahkan OnClickListener ke tombol Share
        btnShare.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // Membuat intent untuk membagikan konten
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                String shareBody = "Isi pesan yang ingin Anda bagikan di sini";
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareBody);

                // Memulai aktivitas untuk memilih aplikasi yang akan digunakan untuk berbagi
                startActivity(Intent.createChooser(shareIntent, "Bagikan melalui"));
            }
        });

    Detail detail;
        if (Build.VERSION.SDK_INT >= 33) {
            detail = getIntent().getParcelableExtra(KEY_DATA, Detail.class);
        }else {
            detail = getIntent().getParcelableExtra(KEY_DATA);
        }

        String sourceGambar = detail.getImage();
        int sourceGambarID = getResources().getIdentifier(sourceGambar, "drawable", getPackageName());
        Image.setImageResource(sourceGambarID);


        Name.setText(detail.getName());
        Price.setText(detail.getPrice());
        TypeEngine.setText(detail.getEngineType());
        Acceleration.setText(detail.getAcceleration());
        TopSpeed.setText(detail.getTopSpeed());
        Power.setText(detail.getPower());


    }
}