package com.destinyapp.biodatawalisongo.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.destinyapp.biodatawalisongo.Model.DataModel;
import com.destinyapp.biodatawalisongo.Model.KuisWalisongo;
import com.destinyapp.biodatawalisongo.Model.TebakGambar;
import com.destinyapp.biodatawalisongo.R;

import java.util.ArrayList;

public class SoalActivity extends AppCompatActivity {
    Button A,B,C,D;
    TextView Soal,Tittle;
    ImageView gambar;
    MediaPlayer SuaraLagu;
    private ArrayList<DataModel> pList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal);

        Intent data = getIntent();
        String No = data.getStringExtra("NO");
        final String Score = data.getStringExtra("SCORE");
        final String Kuis = data.getStringExtra("KUIS");
        final int no = Integer.parseInt(No);

        A = findViewById(R.id.btnA);
        B = findViewById(R.id.btnB);
        C = findViewById(R.id.btnC);
        D = findViewById(R.id.btnD);
        Soal = findViewById(R.id.tvSoal);
        Tittle = findViewById(R.id.tvTittle);
        gambar = findViewById(R.id.ivGambar);
        if (Kuis.equals("0")){
            pList.addAll(TebakGambar.getListData());
            SuaraLagu = MediaPlayer.create(SoalActivity.this,R.raw.siapakahdia);
            SuaraLagu.start();
        }else{
            pList.addAll(KuisWalisongo.getListData());
        }
        A.setText(pList.get(no).getA());
        B.setText(pList.get(no).getB());
        C.setText(pList.get(no).getC());
        D.setText(pList.get(no).getD());
        Soal.setText(pList.get(no).getSoal());
        Tittle.setText("Soal "+pList.get(no).getNo());
        if (!pList.get(no).getGambar().equals("")){
            gambar.setImageResource(Integer.parseInt(pList.get(no).getGambar()));
        }else{
            gambar.setVisibility(View.GONE);
        }
        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pList.get(no).getJawaban().equals("A")){
                    if (no >= pList.size()-1){
                        Intent goInput = new Intent(SoalActivity.this,ScoreActivity.class);
                        goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+10));
                        startActivity(goInput);
                    }else{
                        Intent goInput = new Intent(SoalActivity.this, SoalActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+10));
                        goInput.putExtra("KUIS",Kuis);
                        SoalActivity.this.startActivities(new Intent[]{goInput});
                    }
                }else{
                    if (no >= pList.size()-1){
                        Intent goInput = new Intent(SoalActivity.this,ScoreActivity.class);
                        goInput.putExtra("SCORE",String.valueOf(Score));
                        startActivity(goInput);
                    }else{
                        Intent goInput = new Intent(SoalActivity.this, SoalActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Score));
                        goInput.putExtra("KUIS",Kuis);
                        SoalActivity.this.startActivities(new Intent[]{goInput});
                    }
                }
            }
        });
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pList.get(no).getJawaban().equals("B")){
                    if (no >= pList.size()-1){
                        Intent goInput = new Intent(SoalActivity.this,ScoreActivity.class);
                        goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+10));
                        startActivity(goInput);
                    }else{
                        Intent goInput = new Intent(SoalActivity.this, SoalActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+10));
                        goInput.putExtra("KUIS",Kuis);
                        SoalActivity.this.startActivities(new Intent[]{goInput});
                    }
                }else{
                    if (no >= pList.size()-1){
                        Intent goInput = new Intent(SoalActivity.this,ScoreActivity.class);
                        goInput.putExtra("SCORE",String.valueOf(Score));
                        startActivity(goInput);
                    }else{
                        Intent goInput = new Intent(SoalActivity.this, SoalActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Score));
                        goInput.putExtra("KUIS",Kuis);
                        SoalActivity.this.startActivities(new Intent[]{goInput});
                    }
                }
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pList.get(no).getJawaban().equals("C")){
                    if (no >= pList.size()-1){
                        Intent goInput = new Intent(SoalActivity.this,ScoreActivity.class);
                        goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+10));
                        startActivity(goInput);
                    }else{
                        Intent goInput = new Intent(SoalActivity.this, SoalActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+10));
                        goInput.putExtra("KUIS",Kuis);
                        SoalActivity.this.startActivities(new Intent[]{goInput});
                    }
                }else{
                    if (no >= pList.size()-1){
                        Intent goInput = new Intent(SoalActivity.this,ScoreActivity.class);
                        goInput.putExtra("SCORE",String.valueOf(Score));
                        startActivity(goInput);
                    }else{
                        Intent goInput = new Intent(SoalActivity.this, SoalActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Score));
                        goInput.putExtra("KUIS",Kuis);
                        SoalActivity.this.startActivities(new Intent[]{goInput});
                    }
                }
            }
        });
        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pList.get(no).getJawaban().equals("D")){
                    if (no >= pList.size()-1){
                        Intent goInput = new Intent(SoalActivity.this,ScoreActivity.class);
                        goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+10));
                        startActivity(goInput);
                    }else{
                        Intent goInput = new Intent(SoalActivity.this, SoalActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+10));
                        goInput.putExtra("KUIS",Kuis);
                        SoalActivity.this.startActivities(new Intent[]{goInput});
                    }
                }else{
                    if (no >= pList.size()-1){
                        Intent goInput = new Intent(SoalActivity.this,ScoreActivity.class);
                        goInput.putExtra("SCORE",String.valueOf(Score));
                        startActivity(goInput);
                    }else{
                        Intent goInput = new Intent(SoalActivity.this, SoalActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Score));
                        goInput.putExtra("KUIS",Kuis);
                        SoalActivity.this.startActivities(new Intent[]{goInput});
                    }
                }
            }
        });
    }
}
