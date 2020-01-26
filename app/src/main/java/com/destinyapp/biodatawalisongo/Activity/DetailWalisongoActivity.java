package com.destinyapp.biodatawalisongo.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.destinyapp.biodatawalisongo.R;

public class DetailWalisongoActivity extends AppCompatActivity {
    ImageView makam,foto;
    TextView nama,detail,alamat;
    MediaPlayer SuaraLagu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_walisongo);


        makam = findViewById(R.id.ivMakam);
        foto = findViewById(R.id.ivPhoto);
        nama = findViewById(R.id.tvNama);
        detail = findViewById(R.id.tvDetail);
        alamat = findViewById(R.id.tvAlamat);

        Intent data = getIntent();
        String GAMBAR = data.getStringExtra("GAMBAR");
        String NAMA = data.getStringExtra("NAMA");
        String DESKRIPSI = data.getStringExtra("DESKRIPSI");
        String MAKAM = data.getStringExtra("MAKAM");
        String ALAMAT = data.getStringExtra("ALAMAT");
        String SUARA = data.getStringExtra("SUARA");
        SuaraLagu = MediaPlayer.create(DetailWalisongoActivity.this,Integer.parseInt(SUARA));
        SuaraLagu.start();
        makam.setImageResource(Integer.parseInt(MAKAM));
        foto.setImageResource(Integer.parseInt(GAMBAR));
        nama.setText(NAMA);
        detail.setText(DESKRIPSI);
        alamat.setText(ALAMAT);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        SuaraLagu.stop();
    }
}
