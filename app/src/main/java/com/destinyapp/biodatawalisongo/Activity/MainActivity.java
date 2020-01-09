package com.destinyapp.biodatawalisongo.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.destinyapp.biodatawalisongo.R;

public class MainActivity extends AppCompatActivity {
    LinearLayout biodata,peninggalan,makam,tentang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        biodata = findViewById(R.id.linearBiodataWalisongo);
        peninggalan = findViewById(R.id.linearPeninggalan);
        makam = findViewById(R.id.linearMakam);
        tentang = findViewById(R.id.linearTentang);

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
                Intent intent = new Intent(MainActivity.this,BiodataActivity.class);
                startActivity(intent);
            }
        });
        makam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
