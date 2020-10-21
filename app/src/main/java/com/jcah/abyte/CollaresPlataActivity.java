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

public class CollaresPlataActivity extends AppCompatActivity {

    private RecyclerView rvLista;
    private ReciclerCollarPlataAdapter adapter;
    private List<CollaresPlata> items;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collares_plata);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


    }

    private void initViews(){
        rvLista = findViewById(R.id.reclicerViewCollaresPlata);
    }

    private  void initValues(){
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvLista.setLayoutManager(manager);

        items = getItems();
        adapter =  new ReciclerCollarPlataAdapter(items);
        rvLista.setAdapter(adapter);
    }


    private List<CollaresPlata> getItems(){
        List<CollaresPlata> itemList = new ArrayList<>();

       // itemList.add(new CollaresPlata("","",));



        return itemList;
    }
}