package com.jcah.abyte;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.jcah.abyte.adapters.ReciclerArgollas10kAdapter;
import com.jcah.abyte.adapters.ReciclerArgollas14kAdapter;
import com.jcah.abyte.models.ArgollaDiezK;

import java.util.List;

public class argollaClasica14Activity extends AppCompatActivity {

    private RecyclerView rvLista;
    private ReciclerArgollas14kAdapter adapter;
    private List<ArgollaDiezK> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_argolla_clasica14);



    }
}