package com.destinyapp.biodatawalisongo.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.destinyapp.biodatawalisongo.R;

public class MainActivity extends AppCompatActivity {
    LinearLayout biodata,peninggalan,kuis,tentang;
    ImageView exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        biodata = findViewById(R.id.linearBiodataWalisongo);
        kuis = findViewById(R.id.linearKuis);
        tentang = findViewById(R.id.linearTentang);
        peninggalan = findViewById(R.id.linearPeninggalan);
        exit = findViewById(R.id.ivExit);
        biodata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,BiodataActivity.class);
                startActivity(intent);
            }
        });
        peninggalan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,PeninggalanActivity.class);
                startActivity(intent);
            }
        });
        kuis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,KuisActivity.class);
                startActivity(intent);
            }
        });
        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,TentangActivity.class);
                startActivity(intent);
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer SuaraLagu = MediaPlayer.create(MainActivity.this,R.raw.exit);
                SuaraLagu.start();
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Anda Yakin ingin Keluar Aplikasi ?")
                        .setCancelable(false)
                        .setPositiveButton("Iya", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                MainActivity.super.onBackPressed();
                            }
                        })
                        .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();

                            }
                        })
                        //Set your icon here
                        .setTitle("Perhatian !!!")
                        .setIcon(R.drawable.ic_exit_to_app_black_24dp);
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }
}
