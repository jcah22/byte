package com.jcah.abyte;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.skydoves.elasticviews.ElasticCardView;

public class ArracadasPlataActivity extends AppCompatActivity {

    ElasticCardView cardArracadaLisa;
    ElasticCardView cardArracadaDiamantada;
    ElasticCardView cardAretes;
    ElasticCardView cardBroqueles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arracadas_plata);


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        cardArracadaLisa = findViewById(R.id.idArracadaLisa);
        cardArracadaDiamantada = findViewById(R.id.idArracadaDiamantada);
        cardAretes = findViewById(R.id.idAretes);
        cardBroqueles = findViewById(R.id.idBroqueles);


        cardArracadaLisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iArracadaLisa = new Intent(ArracadasPlataActivity.this,ArracadaLisaActivity.class);
                startActivity(iArracadaLisa);

            }
        });

        cardArracadaDiamantada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iArracadaDiamantada = new Intent(ArracadasPlataActivity.this,ArracadaDiamantadaActivity.class);
                startActivity(iArracadaDiamantada);

            }
        });

        cardAretes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iAretes = new Intent(ArracadasPlataActivity.this,AretesActivity.class);
                startActivity(iAretes);

            }
        });

        cardBroqueles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iBroqueles = new Intent(ArracadasPlataActivity.this,BroquelesActivity.class);
                startActivity(iBroqueles);

            }
        });
    }
}