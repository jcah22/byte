package com.jcah.abyte;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.jcah.abyte.adapters.ReciclerArracadaLisaAdapter;
import com.jcah.abyte.models.ArracadaLisa;

import java.util.ArrayList;
import java.util.List;

public class ArracadaLisaActivity extends AppCompatActivity {

    private RecyclerView rvLista;
    private ReciclerArracadaLisaAdapter adapter;
    private List<ArracadaLisa> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arracada_lisa);


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        initViews();
        initValues();


    }

    private void initViews() {

        rvLista = findViewById(R.id.rvArracadaLisa);
    }

    private void initValues() {
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvLista.setLayoutManager(manager);
        items = getItems();
        adapter = new ReciclerArracadaLisaAdapter(items);
        rvLista.setAdapter(adapter);

    }

    private List<ArracadaLisa> getItems() {
        List<ArracadaLisa> itemList = new ArrayList<>();

        itemList.add(new ArracadaLisa(R.drawable.al073r5, "AL073R5", "Ovalado con lineas 4.8mm ", "4.4 gr R5"));
        itemList.add(new ArracadaLisa(R.drawable.adc200zfr3, "ADC200ZFR3", "Arracada zafiro Redondo 2.0mm", "2.3gr  R9,R7,R4,R3"));


        return itemList;
    }


}