package com.jcah.abyte;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.jcah.abyte.adapters.ReciclerAreteAdapter;
import com.jcah.abyte.models.Aretes;

import java.util.ArrayList;
import java.util.List;

public class AretesActivity extends AppCompatActivity {

     private RecyclerView rvLista;
        private ReciclerAreteAdapter adapter;
        private List<Aretes> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aretes);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        initViews();
        initValues();

    }

    private void initViews(){
        rvLista = findViewById(R.id.rvAretes);

    }

    private void initValues() {

        LinearLayoutManager manager = new  LinearLayoutManager(this);
        rvLista.setLayoutManager(manager);
        items = getItems();
        adapter = new ReciclerAreteAdapter(items);
        rvLista.setAdapter(adapter);

    }

    private List<Aretes> getItems(){
        List<Aretes>  itemList = new ArrayList<>();

        itemList.add(new Aretes(R.drawable.gra011at_1,"GRA011AT","Aretes angel niña corazon","0.7 gr"));
        itemList.add(new Aretes(R.drawable.gra020at_1,"GRA020AT","Aretes Corazón","0.7 gr"));
        itemList.add(new Aretes(R.drawable.gra043hg_1,"GRA043HG","Arete Huggies flores con piedra","2.8 gr"));
        itemList.add(new Aretes(R.drawable.gra044hg_2,"GRA044HG","Arete Huggies corazones calados con piedra","2.6 gr"));
        itemList.add(new Aretes(R.drawable.gra180hg_1,"GRA180HG","Arete Huggies corazón con hueco y piedras","3.0 gr;"));
        itemList.add(new Aretes(R.drawable.gra181hg_1,"GRA181HG","Arete Huggies corazón piedras rosas","2.9 gr"));
        itemList.add(new Aretes(R.drawable.gra182hg,"GRA182HG","Arete Huggies tipo herradura con piedras azules","2.9 gr"));

        return  itemList;



    }

}