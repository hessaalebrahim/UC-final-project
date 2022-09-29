package com.example.survice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        final Intent e = new Intent (MainActivity3.this, MainActivityNanny.class);


        Button nanny = findViewById(R.id.buttonnanny);
        nanny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(e);
            }
        });

        final Intent f = new Intent (MainActivity3.this, MainActivityMaid.class);

        Button maid = findViewById(R.id.buttonmaid);
        maid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(f);
            }
        });
    }
}