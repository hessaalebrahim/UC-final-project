package com.example.survice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class ItemAdapterMaid extends RecyclerView.Adapter {

    ArrayList<Maids> maidsList = new ArrayList<>();
    Context context;


    public ItemAdapterMaid(ArrayList<Maids> maidsList, Context context) {
        this.maidsList = maidsList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rawitemmaid, parent, false);
        ViewHolder vh = new ViewHolder(view);



        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).img.setImageResource(maidsList.get(position).getMaidImg());
        ((ViewHolder)holder).name.setText("Name: " + maidsList.get(position).getMaidName());
        ((ViewHolder)holder).birth.setText("Date of birth: " + maidsList.get(position).getMaidBirth() + "");
        ((ViewHolder)holder).nat.setText("Nationality: " +maidsList.get(position).getMaidGen());
        ((ViewHolder)holder).gen.setText("Gender: "+maidsList.get(position).getMaidGen());

    }

    @Override
    public int getItemCount() {
        return maidsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView name, birth, nat, gen;
        View v;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            v = itemView;
            img = v.findViewById(R.id.imageViewMaid);
            name = v.findViewById(R.id.textViewMaidName);
            birth = v.findViewById(R.id.textViewMaidBirth);
            nat = v.findViewById(R.id.textViewMaidNat);
            gen = v.findViewById(R.id.textViewMaidGen);

        }
    }
}
