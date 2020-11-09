package com.jcah.abyte;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.jcah.abyte.models.ArgollaDiezK;
import com.jcah.abyte.models.ArracadaDiamantada;

public class DetalleArracadaDiamantadaActivity extends AppCompatActivity {


    ImageView imagenDetalle;
    TextView codigoDetalle;
    private ArracadaDiamantada itemDetalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_arracada_diamantada);


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        initViews();
        initValues();
    }



    private void initViews() {
          imagenDetalle = findViewById(R.id.imgDetalleArracadaDiamantada);
               codigoDetalle = findViewById(R.id.txtCodigoDetalleArracadaDiamantada);
    }

    private void initValues() {
        itemDetalle = (ArracadaDiamantada) getIntent().getExtras().getSerializable("itemDetalle");
        codigoDetalle.setText(itemDetalle.getCodigo());
        imagenDetalle.setImageResource(itemDetalle.getFoto());
    }
}