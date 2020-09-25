package com.jcah.abyte;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.jcah.abyte.models.ArgollaDiezK;

public class DetalleArgolla10kActivity extends AppCompatActivity {

    ImageView imagenDetalle;
    TextView codigoDetalle;
    private ArgollaDiezK itemDetalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_argolla10k);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        initViews();
        initValues();
    }
    private void initViews(){

        imagenDetalle = findViewById(R.id.imgDetalleArgolla10k);
        codigoDetalle = findViewById(R.id.txtCodigoDetalle10k);
    }
    private  void initValues(){

        itemDetalle = (ArgollaDiezK) getIntent().getExtras().getSerializable("itemDetalle");
        codigoDetalle.setText(itemDetalle.getCodigo());
        imagenDetalle.setImageResource(itemDetalle.getFoto());

    }
}