package com.jcah.abyte;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import com.jcah.abyte.adapters.ReciclerArg14Mov;
import com.jcah.abyte.models.Argolla14Mov;

import java.util.ArrayList;
import java.util.List;

public class ArgollaMovActivity extends AppCompatActivity {

    private RecyclerView rvLista;
    private ReciclerArg14Mov adapter;
    private List<Argolla14Mov> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_argolla_mov);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        initViews();
        initValues();
    }

    private void initValues() {

        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvLista.setLayoutManager(manager);
        items = getItems();
        adapter = new ReciclerArg14Mov(items);
        rvLista.setAdapter(adapter);

    }

    private void initViews() {
        rvLista = findViewById(R.id.ReciclerViewMovimiento);
    }

    private List<Argolla14Mov>  getItems(){
        List<Argolla14Mov> itemList = new ArrayList<>();

        itemList.add(new Argolla14Mov("CM074RG-64","Argolla 6 mm 14 Kilates","p.p. 2.4 gramos",R.drawable.cm074rg_64));

        return itemList;

    }


}