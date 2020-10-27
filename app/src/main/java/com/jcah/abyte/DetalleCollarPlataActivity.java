package com.jcah.abyte;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.jcah.abyte.models.CollaresPlata;

import java.util.Objects;

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
    private void initValues() {

           itemDetalle = (CollaresPlata) Objects.requireNonNull(getIntent().getExtras()).getSerializable("itemDetalle");
          codigoDetalle.setText(itemDetalle.getCodigo());
           imagenDetalle.setImageResource(itemDetalle.getFoto());
       }

      private void initViews() {
      imagenDetalle = findViewById(R.id.imgDetalleCollarPlata);
           codigoDetalle = findViewById(R.id.txtCodigoCollarPlata);
       }


}