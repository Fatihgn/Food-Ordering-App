package com.example.loginpageveyemeksipariiuygulamas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class anamenu_frag extends Fragment {
    TextView kullaniciadi;
    private RecyclerView benimrecyc;
    private ArrayList<Kampanyalar> kampanya;
    private MyrecycAdaptor2 myadaptor;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_anamenu_frag, container, false);
        kullaniciadi=view.findViewById(R.id.degistir);
        benimrecyc=view.findViewById(R.id.myrecyc2);
        kampanya=new ArrayList<>();
        myadaptor=new MyrecycAdaptor2(kampanya);
        benimrecyc.setAdapter(myadaptor);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        benimrecyc.setLayoutManager(linearLayoutManager);
        kampanya.add(new Kampanyalar(R.drawable.kampanya1));
        kampanya.add(new Kampanyalar(R.drawable.kampanya2));
        kampanya.add(new Kampanyalar(R.drawable.kampanya5));
        kampanya.add(new Kampanyalar(R.drawable.kampanya3));
        kampanya.add(new Kampanyalar(R.drawable.kampanya4));


        Bundle bundle2=this.getArguments();
        kullaniciadi.setText(bundle2.getString("adkeey"));

        return view;
    }
}