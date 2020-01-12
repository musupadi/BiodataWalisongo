package com.destinyapp.biodatawalisongo.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.destinyapp.biodatawalisongo.R;

public class DetailPeninggalanActivity extends AppCompatActivity {
    ImageView foto;
    TextView nama,detail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_peninggalan);
        foto = findViewById(R.id.ivPhoto);
        nama = findViewById(R.id.tvNama);
        detail = findViewById(R.id.tvDetail);

        Intent data = getIntent();
        String GAMBAR = data.getStringExtra("GAMBAR");
        String NAMA = data.getStringExtra("NAMA");
        String DESKRIPSI = data.getStringExtra("DESKRIPSI");
        foto.setImageResource(Integer.parseInt(GAMBAR));
        nama.setText(NAMA);
        detail.setText(DESKRIPSI);
    }
}
