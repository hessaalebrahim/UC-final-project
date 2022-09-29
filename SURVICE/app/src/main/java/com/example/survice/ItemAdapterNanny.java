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

public class ItemAdapterNanny extends RecyclerView.Adapter {

    ArrayList<Nannies> nanniesList = new ArrayList<>();
    Context context;


    public ItemAdapterNanny(ArrayList<Nannies> nanniesList, Context context) {
        this.nanniesList = nanniesList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rawitemnanny, parent, false);
        ViewHolder vh = new ViewHolder(view);



        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).img.setImageResource(nanniesList.get(position).getNannyImg());
        ((ViewHolder)holder).name.setText("Name: " + nanniesList.get(position).getNannyName());
        ((ViewHolder)holder).birth.setText("Date of birth: " + nanniesList.get(position).getNannyBirth() + "");
        ((ViewHolder)holder).nat.setText("Nationality: " +nanniesList.get(position).getNannyNat());
        ((ViewHolder)holder).gen.setText("For Contact: "+nanniesList.get(position).getNannyGen());

    }

    @Override
    public int getItemCount() {
        return nanniesList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView name, birth, nat, gen;
        View v;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            v = itemView;
            img = v.findViewById(R.id.imageViewNanny);
            name = v.findViewById(R.id.textViewNannyName);
            birth = v.findViewById(R.id.textViewNannyBirth);
            nat = v.findViewById(R.id.textViewNannyNat);
            gen = v.findViewById(R.id.textViewNannyGen);

        }
    }
}
