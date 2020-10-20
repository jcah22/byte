package com.jcah.abyte;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.skydoves.elasticviews.ElasticCardView;

public class MoshaActivity extends AppCompatActivity {

    ElasticCardView cardPlataCollares;
    ElasticCardView cardPlataCadenas;
    ElasticCardView cardPlataArracadasAretes;
    ElasticCardView cardPlataDijes;
    ElasticCardView cardPlataEsclavas;
    ElasticCardView cardPlataAnillos;
    ElasticCardView cardPlataPulseras;
    ElasticCardView cardPlataReligiosos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mosha);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        cardPlataCollares = findViewById(R.id.idCardPlataCollares);
        cardPlataCadenas = findViewById(R.id.idCardPlataCadenas);
        cardPlataArracadasAretes = findViewById(R.id.idCardPlataArracadasAretes);
        cardPlataDijes = findViewById(R.id.idCardPlataDijes);
        cardPlataEsclavas = findViewById(R.id.idCardPlataEsclavas);
        cardPlataAnillos = findViewById(R.id.idCardPlataAnillos);
        cardPlataPulseras = findViewById(R.id.idCardPlataPulseras);
        cardPlataReligiosos = findViewById(R.id.idCardPlataReligioso);


        cardPlataCollares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        cardPlataCadenas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        cardPlataArracadasAretes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        cardPlataDijes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        cardPlataEsclavas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        cardPlataAnillos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        cardPlataPulseras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        cardPlataReligiosos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}