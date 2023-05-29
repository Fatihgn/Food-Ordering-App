package com.example.loginpageveyemeksipariiuygulamas;

import android.database.Cursor;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class sepet_frag extends Fragment {
    TextView fiyat, dukkan;

    ImageView foto;
    Button btn1, btn2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sepet_frag, container, false);
        btn1 = view.findViewById(R.id.button);
        btn2 = view.findViewById(R.id.button2);
        fiyat = view.findViewById(R.id.fiyat);
        dukkan = view.findViewById(R.id.dukkan);
        foto = view.findViewById(R.id.resim);
        Bundle bundle = this.getArguments();


        if (bundle.getString("dukkan") != null) {
            String fiyatlar = bundle.getString("fiyat");
            fiyat.setText(fiyatlar);
            String dukkanlar = bundle.getString("dukkan");
            dukkan.setText(dukkanlar);
            int fotolar = bundle.getInt("fotos");
            foto.setImageResource(fotolar);
        } else {
            foto.setImageResource(R.drawable.shop);
            fiyat.setText("0");
            dukkan.setText("");
        }


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                foto.setImageResource(R.drawable.shop);
                fiyat.setText("0");
                dukkan.setText(" ");


            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fiyat.getText()!="0")
                {
                    Toast.makeText(getContext(), "Siparişiniz Hazırlanıyor", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getContext(), "Devam Etmek İçin Ürün Seçin", Toast.LENGTH_SHORT).show();
                }

            }
        });


        return view;
    }
}
