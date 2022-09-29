package com.example.survice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       final Intent a = new Intent(MainActivity2.this,MainActivity3.class);
        final Intent d = new Intent (MainActivity2.this, MainActivity.class);


       Button agree = findViewById(R.id.button2);
      agree.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              startActivity(a);
          }
      });

      Button cancel2 = findViewById(R.id.buttoncancel2);
      cancel2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              startActivity(d);
          }
      });
    }
}

