package com.jcah.abyte;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.jcah.abyte.adapters.ReciclerCollarPlataAdapter;
import com.jcah.abyte.models.CollaresPlata;

import java.util.ArrayList;
import java.util.List;

public class CollarPlataActivity extends AppCompatActivity {

        private RecyclerView rvLista;
        private ReciclerCollarPlataAdapter adapter;
        private List<CollaresPlata> items;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collar_plata);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        initViews();
        initValues();
    }

    private void initViews() {

        rvLista = findViewById(R.id.rvCollaresPlata);

    }

    private void initValues() {
        LinearLayoutManager manager  = new LinearLayoutManager(this);
        rvLista.setLayoutManager(manager);

        items = getItems();
        adapter = new ReciclerCollarPlataAdapter(items);
        rvLista.setAdapter(adapter);

    }


    private List<CollaresPlata> getItems(){
        List<CollaresPlata> itemList  = new ArrayList<>();

        itemList.add(new CollaresPlata("DI2105CL","Collar con dije de estrella vaciada",R.drawable.di2105cl));


        return itemList;
    }

}