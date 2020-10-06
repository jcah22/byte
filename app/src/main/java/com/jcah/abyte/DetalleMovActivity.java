package com.jcah.abyte;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.jcah.abyte.models.Argolla14Mov;

import java.util.Objects;

public class DetalleMovActivity extends AppCompatActivity {

    ImageView imagenDetalle;
    TextView codigoDetalle;
    private Argolla14Mov itemDetalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_mov);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        initViews();
        initValues();
    }

    private void initValues() {

        itemDetalle = (Argolla14Mov) Objects.requireNonNull(getIntent().getExtras()).getSerializable("itemDetalle");
        codigoDetalle.setText(itemDetalle.getCodigo());
        imagenDetalle.setImageResource(itemDetalle.getFoto());
    }

    private void initViews() {
        imagenDetalle = findViewById(R.id.imgDetalleArgollaMov);
        codigoDetalle = findViewById(R.id.txtCodigoDetalleMov);
    }
}