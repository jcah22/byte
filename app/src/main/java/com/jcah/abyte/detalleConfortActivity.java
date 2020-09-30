package com.jcah.abyte;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.jcah.abyte.models.Argolla14Confort;
import com.jcah.abyte.models.ArgollaDiezK;

public class detalleConfortActivity extends AppCompatActivity {

    ImageView imagenDetalle;
    TextView codigoDetalle;
    private Argolla14Confort itemDetalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_confort);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        initViews();
        initValues();
    }

    private void initViews(){

        imagenDetalle = findViewById(R.id.imgDetalleArgollaConfort);
        codigoDetalle = findViewById(R.id.txtCodigoDetalleConfort);
    }
    private  void initValues(){

        itemDetalle = (Argolla14Confort) getIntent().getExtras().getSerializable("itemDetalle");
        codigoDetalle.setText(itemDetalle.getCodigo());
        imagenDetalle.setImageResource(itemDetalle.getFoto());

    }
}