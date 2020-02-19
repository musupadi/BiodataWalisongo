package com.destinyapp.biodatawalisongo.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.destinyapp.biodatawalisongo.Model.DataModel;
import com.destinyapp.biodatawalisongo.Model.KuisWalisongo;
import com.destinyapp.biodatawalisongo.Model.KuisWalisongo2;
import com.destinyapp.biodatawalisongo.Model.KuisWalisongo3;
import com.destinyapp.biodatawalisongo.Model.KuisWalisongo4;
import com.destinyapp.biodatawalisongo.Model.TebakGambar;
import com.destinyapp.biodatawalisongo.Model.TebakGambar2;
import com.destinyapp.biodatawalisongo.Model.TebakGambar3;
import com.destinyapp.biodatawalisongo.Model.TebakGambar4;
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
        final String Rand = data.getStringExtra("RAND");

        A = findViewById(R.id.btnA);
        B = findViewById(R.id.btnB);
        C = findViewById(R.id.btnC);
        D = findViewById(R.id.btnD);
        Soal = findViewById(R.id.tvSoal);
        Tittle = findViewById(R.id.tvTittle);
        gambar = findViewById(R.id.ivGambar);
        if (Kuis.equals("0")){
            TebakGambarSoal(Rand);
        }else{
            KuisSoal(Rand);
        }
        A.setText(pList.get(no).getA());
        B.setText(pList.get(no).getB());
        C.setText(pList.get(no).getC());
        D.setText(pList.get(no).getD());
        Soal.setText(pList.get(no).getSoal());

        A.setVisibility(View.INVISIBLE);
        B.setVisibility(View.INVISIBLE);
        C.setVisibility(View.INVISIBLE);
        D.setVisibility(View.INVISIBLE);
        Soal.setVisibility(View.INVISIBLE);
        Tittle.setText("Soal "+pList.get(no).getNo());
        if (!pList.get(no).getGambar().equals("")){
            //Ada Gambar
            gambar.setImageResource(Integer.parseInt(pList.get(no).getGambar()));
            Kontol1(pList.get(no).getSuaraSoal(),pList.get(no).getSuaraSoalA(),pList.get(no).getSuaraSoalB(),pList.get(no).getSuaraSoalC(),pList.get(no).getSuaraSoalD());
        }else{
            //Tidak Ada Gambar
            gambar.setVisibility(View.GONE);
            Tittle.setVisibility(View.GONE);
            Kontol1(pList.get(no).getSuaraSoal(),pList.get(no).getSuaraSoalA(),pList.get(no).getSuaraSoalB(),pList.get(no).getSuaraSoalC(),pList.get(no).getSuaraSoalD());
        }
        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pList.get(no).getJawaban().equals("A")){
                    if (no >= pList.size()-1){
                        MediaPlayer BS = MediaPlayer.create(SoalActivity.this,R.raw.benar);
                        BS.start();
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                Intent goInput = new Intent(SoalActivity.this,ScoreActivity.class);
                                goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+10));
                                startActivity(goInput);
                            }
                        }, 1000); //3000
                    }else{
                        MediaPlayer BS = MediaPlayer.create(SoalActivity.this,R.raw.benar);
                        BS.start();
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                Intent goInput = new Intent(SoalActivity.this, SoalActivity.class);
                                goInput.putExtra("NO",String.valueOf(no+1));
                                goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+10));
                                goInput.putExtra("KUIS",Kuis);
                                goInput.putExtra("RAND",Rand);
                                SoalActivity.this.startActivities(new Intent[]{goInput});
                            }
                        }, 1000); //3000
                    }
                }else{
                    if (no >= pList.size()-1){
                        MediaPlayer BS = MediaPlayer.create(SoalActivity.this,R.raw.salah);
                        BS.start();
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                Intent goInput = new Intent(SoalActivity.this,ScoreActivity.class);
                                goInput.putExtra("SCORE",String.valueOf(Score));
                                startActivity(goInput);
                            }
                        }, 1000); //3000
                    }else{
                        MediaPlayer BS = MediaPlayer.create(SoalActivity.this,R.raw.salah);
                        BS.start();
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                Intent goInput = new Intent(SoalActivity.this, SoalActivity.class);
                                goInput.putExtra("NO",String.valueOf(no+1));
                                goInput.putExtra("SCORE",String.valueOf(Score));
                                goInput.putExtra("KUIS",Kuis);
                                goInput.putExtra("RAND",Rand);
                                SoalActivity.this.startActivities(new Intent[]{goInput});
                            }
                        }, 1000); //3000
                    }
                }
            }
        });
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pList.get(no).getJawaban().equals("B")){
                    if (no >= pList.size()-1){
                        MediaPlayer BS = MediaPlayer.create(SoalActivity.this,R.raw.benar);
                        BS.start();
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                Intent goInput = new Intent(SoalActivity.this,ScoreActivity.class);
                                goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+10));
                                startActivity(goInput);
                            }
                        }, 1000); //3000
                    }else{
                        MediaPlayer BS = MediaPlayer.create(SoalActivity.this,R.raw.benar);
                        BS.start();
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                Intent goInput = new Intent(SoalActivity.this, SoalActivity.class);
                                goInput.putExtra("NO",String.valueOf(no+1));
                                goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+10));
                                goInput.putExtra("KUIS",Kuis);
                                goInput.putExtra("RAND",Rand);
                                SoalActivity.this.startActivities(new Intent[]{goInput});
                            }
                        }, 1000); //3000
                    }
                }else{
                    if (no >= pList.size()-1){
                        MediaPlayer BS = MediaPlayer.create(SoalActivity.this,R.raw.salah);
                        BS.start();
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                Intent goInput = new Intent(SoalActivity.this,ScoreActivity.class);
                                goInput.putExtra("SCORE",String.valueOf(Score));
                                startActivity(goInput);
                            }
                        }, 1000); //3000
                    }else{
                        MediaPlayer BS = MediaPlayer.create(SoalActivity.this,R.raw.salah);
                        BS.start();
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                Intent goInput = new Intent(SoalActivity.this, SoalActivity.class);
                                goInput.putExtra("NO",String.valueOf(no+1));
                                goInput.putExtra("SCORE",String.valueOf(Score));
                                goInput.putExtra("KUIS",Kuis);
                                goInput.putExtra("RAND",Rand);
                                SoalActivity.this.startActivities(new Intent[]{goInput});
                            }
                        }, 1000); //3000
                    }
                }
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pList.get(no).getJawaban().equals("C")){
                    if (no >= pList.size()-1){
                        MediaPlayer BS = MediaPlayer.create(SoalActivity.this,R.raw.benar);
                        BS.start();
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                Intent goInput = new Intent(SoalActivity.this,ScoreActivity.class);
                                goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+10));
                                startActivity(goInput);
                            }
                        }, 1000); //3000
                    }else{
                        MediaPlayer BS = MediaPlayer.create(SoalActivity.this,R.raw.benar);
                        BS.start();
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                Intent goInput = new Intent(SoalActivity.this, SoalActivity.class);
                                goInput.putExtra("NO",String.valueOf(no+1));
                                goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+10));
                                goInput.putExtra("KUIS",Kuis);
                                goInput.putExtra("RAND",Rand);
                                SoalActivity.this.startActivities(new Intent[]{goInput});
                            }
                        }, 1000); //3000
                    }
                }else{
                    if (no >= pList.size()-1){
                        MediaPlayer BS = MediaPlayer.create(SoalActivity.this,R.raw.salah);
                        BS.start();
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                Intent goInput = new Intent(SoalActivity.this,ScoreActivity.class);
                                goInput.putExtra("SCORE",String.valueOf(Score));
                                startActivity(goInput);
                            }
                        }, 1000); //3000
                    }else{
                        MediaPlayer BS = MediaPlayer.create(SoalActivity.this,R.raw.salah);
                        BS.start();
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                Intent goInput = new Intent(SoalActivity.this, SoalActivity.class);
                                goInput.putExtra("NO",String.valueOf(no+1));
                                goInput.putExtra("SCORE",String.valueOf(Score));
                                goInput.putExtra("KUIS",Kuis);
                                goInput.putExtra("RAND",Rand);
                                SoalActivity.this.startActivities(new Intent[]{goInput});
                            }
                        }, 1000); //3000
                    }
                }
            }
        });
        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pList.get(no).getJawaban().equals("D")){
                    if (no >= pList.size()-1){
                        MediaPlayer BS = MediaPlayer.create(SoalActivity.this,R.raw.benar);
                        BS.start();
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                Intent goInput = new Intent(SoalActivity.this,ScoreActivity.class);
                                goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+10));
                                startActivity(goInput);
                            }
                        }, 1000); //3000
                    }else{
                        MediaPlayer BS = MediaPlayer.create(SoalActivity.this,R.raw.benar);
                        BS.start();
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                Intent goInput = new Intent(SoalActivity.this, SoalActivity.class);
                                goInput.putExtra("NO",String.valueOf(no+1));
                                goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+10));
                                goInput.putExtra("KUIS",Kuis);
                                goInput.putExtra("RAND",Rand);
                                SoalActivity.this.startActivities(new Intent[]{goInput});
                            }
                        }, 1000); //3000
                    }
                }else{
                    if (no >= pList.size()-1){
                        MediaPlayer BS = MediaPlayer.create(SoalActivity.this,R.raw.salah);
                        BS.start();
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                Intent goInput = new Intent(SoalActivity.this,ScoreActivity.class);
                                goInput.putExtra("SCORE",String.valueOf(Score));
                                startActivity(goInput);
                            }
                        }, 1000); //3000

                    }else{
                        MediaPlayer BS = MediaPlayer.create(SoalActivity.this,R.raw.salah);
                        BS.start();
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                Intent goInput = new Intent(SoalActivity.this, SoalActivity.class);
                                goInput.putExtra("NO",String.valueOf(no+1));
                                goInput.putExtra("SCORE",String.valueOf(Score));
                                goInput.putExtra("KUIS",Kuis);
                                goInput.putExtra("RAND",Rand);
                                SoalActivity.this.startActivities(new Intent[]{goInput});
                            }
                        }, 1000); //3000

                    }
                }
            }
        });
    }
    private void KuisSoal(String rand){
        if (rand.equals("1")){
            pList.addAll(KuisWalisongo.getListData());
        }else if(rand.equals("2")){
            pList.addAll(KuisWalisongo2.getListData());
        }else if(rand.equals("3")){
            pList.addAll(KuisWalisongo3.getListData());
        }else if(rand.equals("4")){
            pList.addAll(KuisWalisongo4.getListData());
        }
    }
    private void TebakGambarSoal(String rand){
        if (rand.equals("1")){
            pList.addAll(TebakGambar.getListData());
        }else if(rand.equals("2")){
            pList.addAll(TebakGambar2.getListData());
        }else if(rand.equals("3")){
            pList.addAll(TebakGambar3.getListData());
        }else if(rand.equals("4")){
            pList.addAll(TebakGambar4.getListData());
        }
    }
    private void Kontol1(String kontol1, final String kontol2, final String kontol3, final String kontol4, final String kontol5){
        Soal.setVisibility(View.VISIBLE);
        MediaPlayer  mp = MediaPlayer.create(SoalActivity.this,Integer.parseInt(kontol1));
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Kontol2(kontol2,kontol3,kontol4,kontol5);
            }
        });
    }
    private void Kontol2(final String kontol2,final String kontol3,final String kontol4,final String kontol5){
        A.setVisibility(View.VISIBLE);
        MediaPlayer  mp = MediaPlayer.create(SoalActivity.this,Integer.parseInt(kontol2));
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Kontol3(kontol3,kontol4,kontol5);
            }
        });
    }
    private void Kontol3(final String kontol3,final String kontol4,final String kontol5){
        B.setVisibility(View.VISIBLE);
        MediaPlayer  mp = MediaPlayer.create(SoalActivity.this,Integer.parseInt(kontol3));
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Kontol4(kontol4,kontol5);
            }
        });
    }
    private void Kontol4(final String kontol4,final String kontol5){
        C.setVisibility(View.VISIBLE);
        MediaPlayer  mp = MediaPlayer.create(SoalActivity.this,Integer.parseInt(kontol4));
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Kontol5(kontol5);
            }
        });
    }
    private void Kontol5(final String kontol5){
        D.setVisibility(View.VISIBLE);
        MediaPlayer  mp = MediaPlayer.create(SoalActivity.this,Integer.parseInt(kontol5));
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

            }
        });
    }
}
