package com.example.loginpageveyemeksipariiuygulamas;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class anayemekler_frag extends Fragment {

    ListView listem;
    private ArrayAdapter<String> adapter;
    private String [] anayemekliste = {"Döner","Pide","Kumpir","Tantuni","Çiğköfte","Burger","Balık","Pilav","Kahvaltı","Makarna"
    ,"Çorba","Kebap"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_anayemekler_frag, container, false);
        listem=view.findViewById(R.id.listem);
        adapter=new ArrayAdapter<>(view.getContext(), android.R.layout.simple_expandable_list_item_1,anayemekliste);
        listem.setAdapter(adapter);
        Bundle bundle=this.getArguments();
        listem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Bundle bundle = new Bundle();
                String yemekismi = anayemekliste[i];
                bundle.putString("arg1",yemekismi);
                anayemek_frag2 fragment2 = new anayemek_frag2();
                fragment2.setArguments(bundle);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentler,fragment2).commit();

            }
        });
        return view;

    }
}