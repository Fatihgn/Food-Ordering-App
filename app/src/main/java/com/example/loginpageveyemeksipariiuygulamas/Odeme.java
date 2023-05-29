package com.example.loginpageveyemeksipariiuygulamas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Odeme extends AppCompatActivity {
    TextView dukkan,fiyat;
    TextView adetsayisi;
    ImageView foto;
    int fotoid;
    private Yemekler object;
    int adet_sayac;
    int degisenfiyat;
    int sonfiyat;

    Button arti,eksi,sepeteekle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odeme);

        object = (Yemekler) getIntent().getSerializableExtra("object");
        dukkan=findViewById(R.id.dukkann);
        fiyat=findViewById(R.id.fiyatt);
        adetsayisi=findViewById(R.id.adet);
        foto=findViewById(R.id.foto);
        arti=findViewById(R.id.arttir);
        eksi=findViewById(R.id.azalt);
        sepeteekle=findViewById(R.id.sepeteekle);

        fiyat.setText(object.getFiyat());
        degisenfiyat=Integer.parseInt(object.getFiyat());
        dukkan.setText(object.getDukkan());
        foto.setImageResource(object.getLogo());
        fotoid=object.getLogo();
        sonfiyat=degisenfiyat;
        adet_sayac=1;

        arti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adet_sayac++;
                sonfiyat=degisenfiyat*adet_sayac;
                fiyat.setText(String.valueOf(sonfiyat));
                adetsayisi.setText(String.valueOf(adet_sayac));
            }
        });
        eksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(adet_sayac>1){
                    adet_sayac--;
                    sonfiyat=degisenfiyat*adet_sayac;
                    fiyat.setText(String.valueOf(sonfiyat));
                    adetsayisi.setText(String.valueOf(adet_sayac));
                }

            }
        });
        sepeteekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Odeme.this,AnaEkran.class);
                intent.putExtra("fiyatkey",String.valueOf(sonfiyat));
                intent.putExtra("dukkankey",dukkan.getText().toString());
                intent.putExtra("foto",fotoid);
                startActivity(intent);

            }
        });



    }
}