package com.jcah.abyte;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.jcah.abyte.models.Broqueles;

public class DetalleBroquelActivity extends AppCompatActivity {

    ImageView imagenDetalle;
    TextView codigoDetalle;
      private Broqueles itemDetalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_broquel);


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        initViews();
        initValues();


    }

    private void initViews(){
        imagenDetalle = findViewById(R.id.imgDetalleBroquel);
        codigoDetalle = findViewById(R.id.txtCodigoDetalleBroquel);

    }

    private void initValues() {
        itemDetalle = (Broqueles) getIntent().getExtras().getSerializable("itemDetalle");
        codigoDetalle.setText(itemDetalle.getCodigo());
        imagenDetalle.setImageResource(itemDetalle.getFoto());
    }
}