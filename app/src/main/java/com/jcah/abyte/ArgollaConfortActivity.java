package com.jcah.abyte;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.jcah.abyte.adapters.ReciclerArg14kConfortAdapter;
import com.jcah.abyte.adapters.ReciclerArgollas14kAdapter;
import com.jcah.abyte.models.Argolla14Confort;
import com.jcah.abyte.models.Argolla14k;

import java.util.ArrayList;
import java.util.List;

public class ArgollaConfortActivity extends AppCompatActivity {

    private RecyclerView rvLista;
    private ReciclerArg14kConfortAdapter adapter;
    private List<Argolla14Confort> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_argolla_confort);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


    }

    private void initViews() {
        rvLista = findViewById(R.id.ReciclerViewConfort);

    }

    private void initValues() {
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvLista.setLayoutManager(manager);

        items = getItems();
        adapter = new ReciclerArg14kConfortAdapter(items);
        rvLista.setAdapter(adapter);
    }

    private List<Argolla14Confort> getItems() {
        List<Argolla14Confort> itemList = new ArrayList<>();


       // itemList.add(new Argolla14k("CL001", "Argolla 6mm 14 Kilates", "P.P. 2.0 gr", R.drawable.cl001));
        itemList.add( new Argolla14Confort("CF002","Argolla 6 mm 14 Kilates","p.p. 3.5gr",R.drawable.cf002 ));
        itemList.add(new Argolla14Confort("CF007","Argola 6 mm 14 Kilates","p.p. 3.3gr",R.drawable.cf007));
        itemList.add(new Argolla14Confort("CF002-44","Argolla 4 mm 14 Kilates","p.p. 2.4 gr",R.drawable.cf002_44));
        itemList.add(new Argolla14Confort("CF065-44","Argolla 4 mm 14 Kilates","p.p. 2.4 gr",R.drawable.cf065_44));
        itemList.add(new Argolla14Confort("CF065-64","Argolla 6 mm 14 Kilates","p.p. 3.5gr",R.drawable.cf065_64));
        itemList.add(new Argolla14Confort("CF006R","Argolla 6 mm 14 Kilates","p.p. 3.4 gr",R.drawable.cf006r));
        itemList.add(new Argolla14Confort("CF009R","Argolla 6 mm 14 Kilates","p.p. 3.4 gr",R.drawable.cf009r));
        itemList.add(new Argolla14Confort("CF011R","Argolla 6 mm 14 Kilates","p.p. 3.4 gr",R.drawable.cf011r));
        itemList.add(new Argolla14Confort("CF004CPR","Argolla 6 mm 14 Kilates","p.p. 3.5 gr",R.drawable.cf004cpr));
        itemList.add(new Argolla14Confort("CF007CPR","Argollas 6 mm 14 Kilates","p.p. 3.5 gr",R.drawable.cf007cpr));
        itemList.add(new Argolla14Confort("CP069-64","Argolla 6 mm 14 Kilates","p.p. 3.5 gr",R.drawable.cp069_64));
        itemList.add(new Argolla14Confort("CP072R-64","Argolla 6 mm 14 Kilates","p.p. 3.4 gr",R.drawable.cp072r_64));
        itemList.add(new Argolla14Confort("CP073R-64","Argolla 6 mm 14 Kilates","p.p. 3.5 gr",R.drawable.cp073r_64));


        return itemList;
    }
}