package com.example.loginpageveyemeksipariiuygulamas;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class anayemek_frag2 extends Fragment {

    TextView tv;
    private RecyclerView benimrecyc;
    private ArrayList<Yemekler> yemek;
    private MyrecycAdaptor myadaptor;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_anayemek_frag2, container, false);
        tv=view.findViewById(R.id.yemekler);
        benimrecyc=view.findViewById(R.id.myrecyc);
        Bundle bundle = this.getArguments();

        String name = getArguments().getString("arg1");
        tv.setText(name);

        yemek=new ArrayList<>();
        myadaptor=new MyrecycAdaptor(yemek);
        benimrecyc.setAdapter(myadaptor);
        benimrecyc.setLayoutManager(new LinearLayoutManager(getContext()));//bundan emin değiliz
        if(tv.getText().equals("Döner"))
        {
            yemek.add(new Yemekler(R.drawable.doner,"Atom Döner","05327664185","50","★4.2"));
            yemek.add(new Yemekler(R.drawable.doner2,"Devran Döner","05237364245","55 TL","★3.3"));
            yemek.add(new Yemekler(R.drawable.doner3,"Severse Döner","05437664132","40 TL","★4.9"));
        }
        else if(tv.getText().equals("Pide"))
        {
            yemek.add(new Yemekler(R.drawable.pide,"Canlar Pide","05332214321","100","★4.4"));
            yemek.add(new Yemekler(R.drawable.pide2,"Ada Pide","05447664723","120","★2.2"));
            yemek.add(new Yemekler(R.drawable.pide3,"Bolu Mangal Evi","05556664182","90","★3.2"));
        }
        else if(tv.getText().equals("Kumpir"))
        {
            yemek.add(new Yemekler(R.drawable.kumpir,"Otantik Kumpir","05132890321","70","★4.1"));
            yemek.add(new Yemekler(R.drawable.kumpir2,"Burger Kumpir","05122667723","80","★4.2"));
            yemek.add(new Yemekler(R.drawable.kumpir3,"Fatih Kumpir","05223232182","60","★2.2"));
        }
        else if(tv.getText().equals("Tantuni"))
        {
            yemek.add(new Yemekler(R.drawable.tantuni,"Keremzade","05432120321","60","★3.7"));
            yemek.add(new Yemekler(R.drawable.tantuni2,"Mersin Tantuni","05286662323","70","★1.2"));
            yemek.add(new Yemekler(R.drawable.tantuni3,"Öz Tantuni","05865421482","80","★4.8"));
        }
        else if(tv.getText().equals("Çiğköfte"))
        {
            yemek.add(new Yemekler(R.drawable.cigkofte,"Komagene","05247646113","40","★4.9"));
            yemek.add(new Yemekler(R.drawable.cigkofte2,"Meşhur Dükkan","05040803605","35","★2.8"));
            yemek.add(new Yemekler(R.drawable.cigkofte3,"Oses","05060634613","45","★4.8"));
        }
        else if(tv.getText().equals("Burger"))
        {
            yemek.add(new Yemekler(R.drawable.burger,"Burger King","05147346113","150","★4.1"));
            yemek.add(new Yemekler(R.drawable.burger2,"Burger Make","05440803605","100","★1.2"));
            yemek.add(new Yemekler(R.drawable.burger3,"Chicken Garage","05660634613","125","★3.4"));
        }
        else if(tv.getText().equals("Balık"))
        {
            yemek.add(new Yemekler(R.drawable.balik,"Balık Ekmek","05274146113","100","★4.8"));
            yemek.add(new Yemekler(R.drawable.balik2,"Balıkçı Mehmet","05330803605","120","★2.2"));
            yemek.add(new Yemekler(R.drawable.balik3,"İstanbul Balık","05220634613","205","★2.4"));
        }
        else if(tv.getText().equals("Pilav"))
        {
            yemek.add(new Yemekler(R.drawable.pilav,"Tolga Abi","05274234113","40","★4.3"));
        }
        else if(tv.getText().equals("Kahvaltı"))
        {
            yemek.add(new Yemekler(R.drawable.kahvalti,"Kahvaltici","05123234113","220","★4.7"));
        }
        else if(tv.getText().equals("Makarna"))
        {
            yemek.add(new Yemekler(R.drawable.makarna,"Lezzet Durağı","05123244113","60","★2.7"));
        }
        else if(tv.getText().equals("Çorba"))
        {
            yemek.add(new Yemekler(R.drawable.corba,"Çorbacı Ahmet","05343224113","60","★2.7"));
        }
        else if(tv.getText().equals("Kebap"))
        {
            yemek.add(new Yemekler(R.drawable.kebap,"Adana Kebapçısı","05893979113","150","★4.3"));
            yemek.add(new Yemekler(R.drawable.kebap2,"Bolu Kebapçısı","05427834113","200","★4.9"));
            yemek.add(new Yemekler(R.drawable.kebap3,"Hatay Kebapçısı","05193564113","175","★2.4"));

        }
        else if(tv.getText().equals("Kurabiye"))
        {
            yemek.add(new Yemekler(R.drawable.kurabiye,"Tatlıcı Fatih","05893979113","40","★3.3"));
            yemek.add(new Yemekler(R.drawable.kurabiye2,"Tatlı Evi","05625834553","30","★2.9"));
            yemek.add(new Yemekler(R.drawable.kurabiye3,"Antepli Tatlıcı","05234643113","55","★4.5"));
        }
        else if(tv.getText().equals("Künefe"))
        {
            yemek.add(new Yemekler(R.drawable.kunefe,"Künefeci Dede","05233939113","75","★3.7"));
        }
        else if(tv.getText().equals("Sütlaç"))
        {
            yemek.add(new Yemekler(R.drawable.sutlac,"Tatlı Dükkanı","05376543113","50","★4.7"));
        }
        else if(tv.getText().equals("Profiterol"))
        {
            yemek.add(new Yemekler(R.drawable.profiterol,"Yıldız Pastane","05287639113","45","★2.7"));
        }
        else if(tv.getText().equals("Waffle"))
        {
            yemek.add(new Yemekler(R.drawable.waffle,"Ay Pastane","05727991713","75","★2.7"));
            yemek.add(new Yemekler(R.drawable.waffle2,"Tatlıcı Teyze","05575834553","70","★4.9"));
            yemek.add(new Yemekler(R.drawable.waffle3,"Kurubng","05264623113","65","★4.2"));
        }
        myadaptor.notifyDataSetChanged();


        return view;
    }


}