package com.jcah.abyte;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.jcah.abyte.models.Argolla14Confort;
import com.jcah.abyte.models.Argolla14Eurofit;

import java.util.Objects;

public class DetalleEurofitActivity extends AppCompatActivity {

    ImageView imagenDetalle;
    TextView codigoDetalle;
    private Argolla14Eurofit itemDetalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_eurofit);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        initViews();
        initValues();
    }

    private void initValues() {
        itemDetalle = (Argolla14Eurofit) Objects.requireNonNull(getIntent().getExtras()).getSerializable("itemDetalle");
        codigoDetalle.setText(itemDetalle.getCodigo());
        imagenDetalle.setImageResource(itemDetalle.getFoto());


    }

    private void initViews() {

        imagenDetalle = findViewById(R.id.imgDetalleArgollaEurofit);
        codigoDetalle = findViewById(R.id.txtCodigoDetalleEurofit);


    }
}