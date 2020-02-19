package com.destinyapp.biodatawalisongo.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.destinyapp.biodatawalisongo.Model.DataModel;
import com.destinyapp.biodatawalisongo.Model.KuisWalisongo;
import com.destinyapp.biodatawalisongo.Model.Method;
import com.destinyapp.biodatawalisongo.R;

import java.util.ArrayList;

public class KuisActivity extends AppCompatActivity {
    LinearLayout walisongo,kuis;
    Method method = new Method();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);

        walisongo = findViewById(R.id.linearWalisongo);
        kuis = findViewById(R.id.linearKuis);

        walisongo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goInput = new Intent(KuisActivity.this, SoalActivity.class);
                goInput.putExtra("NO","0");
                goInput.putExtra("SCORE","0");
                goInput.putExtra("KUIS","0");
                goInput.putExtra("RAND",String.valueOf(method.BabiGuling(1,4)));
                KuisActivity.this.startActivities(new Intent[]{goInput});
            }
        });
        kuis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goInput = new Intent(KuisActivity.this, SoalActivity.class);
                goInput.putExtra("NO","0");
                goInput.putExtra("SCORE","0");
                goInput.putExtra("KUIS","1");
                goInput.putExtra("RAND",String.valueOf(method.BabiGuling(1,4)));
                KuisActivity.this.startActivities(new Intent[]{goInput});
            }
        });

    }
}
