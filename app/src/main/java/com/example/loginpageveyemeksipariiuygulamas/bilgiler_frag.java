package com.example.loginpageveyemeksipariiuygulamas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class bilgiler_frag extends Fragment {
    TextView kullanad,sifre,eposta,telno;
    DatabaseHelper db;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_bilgiler_frag, container, false);

        kullanad=view.findViewById(R.id.kullan_ad);
        sifre=view.findViewById(R.id.kullan_sifre);
        eposta=view.findViewById(R.id.kullan_email);
        telno=view.findViewById(R.id.kullan_telno);

        db=new DatabaseHelper(getContext());

        Bundle bundle=this.getArguments();
        kullanad.setText(bundle.getString("adkeey"));
        sifre.setText(bundle.getString("sifrekeey"));
        eposta.setText(bundle.getString("epostakeey"));
        telno.setText(bundle.getString("telnokeey"));
        return view;
    }
}