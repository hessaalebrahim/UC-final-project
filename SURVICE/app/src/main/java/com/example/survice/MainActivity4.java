package com.example.survice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        final Intent c = new Intent (MainActivity4.this, MainActivity.class);

      Button cancel1 = findViewById(R.id.buttoncancel1);
      cancel1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              startActivity(c);
          }
      });

    }
}