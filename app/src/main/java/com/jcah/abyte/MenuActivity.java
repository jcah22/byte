package com.jcah.abyte;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.skydoves.elasticviews.ElasticCardView;

public class MenuActivity extends AppCompatActivity {

    CardView enamoro,villa,mosha,ofertas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        enamoro = findViewById(R.id.idCard1);
        villa = findViewById(R.id.idCard2);
        mosha = findViewById(R.id.idCard3);
        ofertas = findViewById(R.id.idCard4);

        getEnamoro();
        getVilla();
        getMosha();
        getOfertas();
    }

    private void getEnamoro() {

        enamoro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(MenuActivity.this,EnamoroActivity.class);
                startActivity(intent1);


            }
        });
    }

    private void getVilla() {

        villa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MenuActivity.this,VillaActivity.class);
                startActivity(intent2);
            }
        });

    }

    private void getMosha(){

        mosha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MenuActivity.this,MoshaActivity.class);
                startActivity(intent3);
            }
        });


    }

    private void getOfertas(){

        ofertas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MenuActivity.this,OfertasActivity.class);
                startActivity(intent4);
            }
        });



    }


}