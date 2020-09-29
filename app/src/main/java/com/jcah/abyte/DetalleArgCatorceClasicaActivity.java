package com.jcah.abyte;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.jcah.abyte.adapters.ReciclerArgollas10kAdapter;
import com.jcah.abyte.adapters.ReciclerArgollas14kAdapter;
import com.jcah.abyte.models.Argolla14k;
import com.jcah.abyte.models.ArgollaDiezK;

import java.util.List;

public class DetalleArgCatorceClasicaActivity extends AppCompatActivity {

    ImageView imagenDetalle;
    TextView codigoDetalle;
    private Argolla14k itemDetalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_arg_catorce_clasica);


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        initViews();
        initValues();


    }

    private void initViews(){

        imagenDetalle = findViewById(R.id.imgDetalleArgolla14kClasica);
        codigoDetalle = findViewById(R.id.txtCodigoDetalle14kClasica);
    }
    private  void initValues(){

        itemDetalle = (Argolla14k) getIntent().getExtras().getSerializable("itemDetalle");
        codigoDetalle.setText(itemDetalle.getCodigo());
        imagenDetalle.setImageResource(itemDetalle.getFoto());

    }
}