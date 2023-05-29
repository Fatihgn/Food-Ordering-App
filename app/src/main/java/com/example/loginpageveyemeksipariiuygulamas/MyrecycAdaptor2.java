package com.example.loginpageveyemeksipariiuygulamas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyrecycAdaptor2 extends RecyclerView.Adapter<MyrecycAdaptor2.Myholder2> {
    private ArrayList<Kampanyalar> kampanya;
    public MyrecycAdaptor2(ArrayList<Kampanyalar> kampanya) {
        this.kampanya=kampanya;
    }
    @NonNull
    @Override
    public Myholder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.kampanyalar,parent,false);
        return new Myholder2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyrecycAdaptor2.Myholder2 holder, int position) {
        holder.photo.setImageResource(kampanya.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {return kampanya.size();
    }
    public class Myholder2 extends RecyclerView.ViewHolder{

        ImageView photo;

        public Myholder2(@NonNull View itemView) {
            super(itemView);
            photo=itemView.findViewById(R.id.photo);

        }
    }
}
