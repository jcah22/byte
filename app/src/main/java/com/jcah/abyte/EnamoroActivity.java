package com.jcah.abyte;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class EnamoroActivity extends AppCompatActivity {

    ImageView diezk,catorcek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enamoro);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        diezk = findViewById(R.id.img10k);
        catorcek = findViewById(R.id.img14k);


        diezk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentDiez = new Intent(EnamoroActivity.this,ArgollasDiezActivity.class);
                startActivity(intentDiez);
            }
        });

        catorcek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCatorce = new Intent(EnamoroActivity.this,ArgollasCatorceActivity.class);
                startActivity(intentCatorce);
            }
        });
    }
}