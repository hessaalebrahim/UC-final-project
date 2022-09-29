package com.example.survice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivityMaid extends AppCompatActivity {
    ArrayList<Maids> maidsList = new ArrayList<Maids>();
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_maid);
        ImageView maidImg;
        TextView maidName, maidBirth, maidNat, maidGen;

        maidImg = findViewById(R.id.imageViewMaid);
        maidName = findViewById(R.id.textViewMaidName);
        maidBirth = findViewById(R.id.textViewMaidBirth);
        maidNat = findViewById(R.id.textViewMaidNat);
        maidGen = findViewById(R.id.textViewMaidGen);


        Maids maid1 = new Maids( R.drawable.maidone, "Karavitage", "20-11-1977" , "Sri Lanka", "+96522069156" );
        Maids maid2 = new Maids( R.drawable.maidtwo, "Swamitra", "21-6-1979" , "Nepal", "+96522069156" );
        Maids maid3 = new Maids( R.drawable.maidthree, "Juhaidah", "8-10-1980" , "Philippines", "+96522069156" );
        Maids maid4 = new Maids( R.drawable.maidfour, "Helen", "4-11-1972" , "Philippines", "+96522069156" );
        Maids maid5 = new Maids( R.drawable.maidfive, "Susana", "21-2-1968" , "Philippines", "+96522069156" );

        maidsList.add(maid1);
        maidsList.add(maid2);
        maidsList.add(maid3);
        maidsList.add(maid4);
        maidsList.add(maid5);


        RecyclerView recycler = findViewById(R.id.rvmaid);
        recycler.setHasFixedSize(true);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recycler.setLayoutManager(manager);

        ItemAdapterMaid adapterMaid = new ItemAdapterMaid(maidsList, this);
        recycler.setAdapter(adapterMaid);

    }
}