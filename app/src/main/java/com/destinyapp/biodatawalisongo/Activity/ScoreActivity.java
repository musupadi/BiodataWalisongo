package com.destinyapp.biodatawalisongo.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.destinyapp.biodatawalisongo.R;

public class ScoreActivity extends AppCompatActivity {
    TextView nilai;
    Button Kembali,Kuis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        nilai = findViewById(R.id.tvScore);
        Kembali = findViewById(R.id.btnKembali);
        Kuis = findViewById(R.id.btnKuis);
        Intent data = getIntent();
        final String Score = data.getStringExtra("SCORE");
        nilai.setText(Score);
        Kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScoreActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        Kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScoreActivity.this,KuisActivity.class);
                startActivity(intent);
            }
        });
    }
}
