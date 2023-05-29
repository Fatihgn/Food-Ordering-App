package com.example.loginpageveyemeksipariiuygulamas;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyrecycAdaptor extends RecyclerView.Adapter<MyrecycAdaptor.Myholder> {
    private ArrayList<Yemekler> yemek;
    sepet_frag a;


    public MyrecycAdaptor(ArrayList<Yemekler> yemek) {
        this.yemek=yemek;
    }

    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.yemekler,parent,false);
        return new Myholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myholder holder, @SuppressLint("RecyclerView") int position) {
        holder.telefon.setText(yemek.get(position).getTelefon());
        holder.yldiz.setText(yemek.get(position).getYildiz());
        String dukkann=yemek.get(position).getDukkan();
        holder.dukkan.setText(dukkann);
        String fiyatt=yemek.get(position).getFiyat();
        holder.fiyat.setText(fiyatt);
        int foto = yemek.get(position).getLogo();
        holder.logo.setImageResource(foto);


        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(holder.itemView.getContext(), "Adet seçiniz", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(holder.itemView.getContext(),Odeme.class);
                i.putExtra("object", yemek.get(position));
                holder.itemView.getContext().startActivity(i);

            }
        });


    }

    @Override
    public int getItemCount() {
        return yemek.size();
    }

    public class Myholder extends RecyclerView.ViewHolder{
        TextView telefon,yldiz,dukkan,fiyat;
        ImageView logo;
        TextView btn;

        public Myholder(@NonNull View itemView) {
            super(itemView);
            logo=itemView.findViewById(R.id.yemekresimi);
            telefon=itemView.findViewById(R.id.telno);
            dukkan=itemView.findViewById(R.id.dukkanismi);
            fiyat=itemView.findViewById(R.id.paratl);
            yldiz=itemView.findViewById(R.id.yildiz);
            btn=itemView.findViewById(R.id.sepeteekle);




        }

    }
}
