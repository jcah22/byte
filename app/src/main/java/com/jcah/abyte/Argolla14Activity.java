package com.jcah.abyte;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Argolla14Activity extends AppCompatActivity {

    CardView card1,card2,card3,card4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_argolla14);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        card1 = findViewById(R.id.idCardClasica);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iclasica = new Intent(Argolla14Activity.this,argollaClasica14Activity.class);
                startActivity(iclasica);
            }
        });



    }
}