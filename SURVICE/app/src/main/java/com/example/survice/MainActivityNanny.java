package com.example.survice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivityNanny extends AppCompatActivity {
    ArrayList<Nannies> nanniesList = new ArrayList<>();
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_nanny);

        ImageView nannyImg;
        TextView nannyName, nannyBirth, nannyNat, nannyGen;

        nannyImg = findViewById(R.id.imageViewNanny);
        nannyName = findViewById(R.id.textViewNannyName);
        nannyBirth = findViewById(R.id.textViewNannyBirth);
        nannyNat = findViewById(R.id.textViewNannyNat);
        nannyGen = findViewById(R.id.textViewNannyGen);


    Nannies nanny1 = new Nannies( R.drawable.nannyone, "Ngozi", "10-12-1987" , "Nigeria", "+96522069156" );
    Nannies nanny2 = new Nannies( R.drawable.nannytwo, "Manju", "8-3-1983" , "India", "+96522069156" );
    Nannies nanny3 = new Nannies( R.drawable.nannythree, "Lovelyn", "28-5-1989" , "Philippines", "+96522069156" );
    Nannies nanny4 = new Nannies( R.drawable.nannyfour, "Tarikua", "27-9-1990" , "Ethiopia", "+96522069156" );
    Nannies nanny5 = new Nannies( R.drawable.nannyfive, "Lilia", "1-5-1968" , "Philippines", "+96522069156" );

    nanniesList.add(nanny1);
    nanniesList.add(nanny2);
    nanniesList.add(nanny3);
    nanniesList.add(nanny4);
    nanniesList.add(nanny5);

        RecyclerView recycler = findViewById(R.id.rv);
        recycler.setHasFixedSize(true);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recycler.setLayoutManager(manager);

        ItemAdapterNanny adapterNanny = new ItemAdapterNanny(nanniesList, this);
        recycler.setAdapter(adapterNanny);

    }
}