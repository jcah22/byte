package com.jcah.abyte;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.jcah.abyte.models.CollaresPlata;

public class DetalleCollarPlataActivity extends AppCompatActivity {

    ImageView imagenDetalle;
    TextView codigoDetalle;
    private CollaresPlata itemDetalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_collar_plata);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        initViews();
        initValues();
    }



    private void initViews() {

        codigoDetalle = findViewById(R.id.txtCodigoDetalleCollarPlata);
        imagenDetalle = findViewById(R.id.imgDetalleCollarPlata);

    }

    private void initValues() {

        itemDetalle = (CollaresPlata) getIntent().getExtras().getSerializable("itemDetalle");
        codigoDetalle.setText(itemDetalle.getCodigo());
        imagenDetalle.setImageResource(itemDetalle.getFoto());
    }
}