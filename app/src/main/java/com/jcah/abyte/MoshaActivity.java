package com.jcah.abyte;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
                Intent iCollares = new Intent(MoshaActivity.this,CollaresPlataActivity.class);
                startActivity(iCollares);


            }
        });

        cardPlataCadenas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent iCadenas =  new Intent(MoshaActivity.this,CadenasPlataActivity.class);
                startActivity(iCadenas);

            }
        });

        cardPlataArracadasAretes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iArracadas  =new Intent(MoshaActivity.this,ArracadasPlataActivity.class);
                startActivity(iArracadas);

            }
        });

        cardPlataDijes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iDijes = new Intent(MoshaActivity.this,DijesPlataActivity.class);
                startActivity(iDijes);

            }
        });

        cardPlataEsclavas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iEsclavas = new Intent(MoshaActivity.this , EsclavasPlataActivity.class);
                startActivity(iEsclavas);

            }
        });

        cardPlataAnillos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iAnillos = new Intent(MoshaActivity.this , AnillosPlataActivity.class);
                startActivity(iAnillos);

            }
        });

        cardPlataPulseras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iPulseras = new Intent(MoshaActivity.this, PulserasPlataActivity.class);
                startActivity(iPulseras);

            }
        });

        cardPlataReligiosos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iReligioso = new Intent(MoshaActivity.this,ReligiosoPlataActivity.class);
                startActivity(iReligioso);

            }
        });


    }
}