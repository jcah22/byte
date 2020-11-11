package com.jcah.abyte;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.jcah.abyte.models.Aretes;

public class AreteDetalleActivity extends AppCompatActivity {

    ImageView imagenDetalle;
    TextView codigoDetalle;
    private Aretes itemDetalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arete_detalle);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        initViews();
        initValues();


    }
    private void initViews(){

        imagenDetalle = findViewById(R.id.imgDetalleArete);
        codigoDetalle = findViewById(R.id.txtCodigoDetalleArete);


    }

    private void initValues() {
        itemDetalle = (Aretes) getIntent().getExtras().getSerializable("itemDetalle");
        codigoDetalle.setText(itemDetalle.getCodigo());
        imagenDetalle.setImageResource(itemDetalle.getFoto());
    }
}