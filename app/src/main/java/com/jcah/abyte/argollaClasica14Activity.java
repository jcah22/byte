package com.jcah.abyte;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.jcah.abyte.adapters.ReciclerArgollas10kAdapter;
import com.jcah.abyte.adapters.ReciclerArgollas14kAdapter;
import com.jcah.abyte.models.Argolla14k;
import com.jcah.abyte.models.ArgollaDiezK;

import java.util.ArrayList;
import java.util.List;

public class argollaClasica14Activity extends AppCompatActivity {

    private RecyclerView rvLista;
    private ReciclerArgollas14kAdapter adapter;
    private List<Argolla14k> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_argolla_clasica14);


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        initViews();
        initValues();



    }


    private void initViews(){
        rvLista = findViewById(R.id.reclicerViewCatorceK);

    }

    private void initValues(){
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvLista.setLayoutManager(manager);

        items = getItems();
        adapter = new ReciclerArgollas14kAdapter(items);
        rvLista.setAdapter(adapter);
    }

    private List<Argolla14k> getItems(){
        List<Argolla14k> itemList = new ArrayList<>();


        itemList.add( new Argolla14k("CL001","Argolla 6mm 14 Kilates","P.P: 2.0 gr",R.drawable.cl001));
        itemList.add(new Argolla14k("CL002","Argolla 6mm 14 Kilates","P.P: 1.9 gr",R.drawable.cl002));
        itemList.add(new Argolla14k("CL003","Argolla 6mm 14 Kilates","P.P: 1.9 gr",R.drawable.cl003));
        itemList.add(new Argolla14k("CL005","Argolla 6mm 14 Kilates" ,"P.P: 2.0 gr",R.drawable.cl005));
        itemList.add(new Argolla14k("CL012","Argolla 6mm 14 Kilates","P.P: 2.0 gr",R.drawable.cl012));
        itemList.add(new Argolla14k("CL014","Argolla 6mm 14 Kilates","P.P: 1.9 gr",R.drawable.cl014));
        itemList.add(new Argolla14k("CL016","Argolla 6 mm 14 Kilates","P.P: 1.9 gr",R.drawable.cl016));
        itemList.add(new Argolla14k("CL017","Argolla 6mm 14 Kilates","P.P: 2.0 gr",R.drawable.cl017));
        itemList.add(new Argolla14k("CL068-64","Argolla 6 mm 14 Kilates","P.P: 2.2 gr",R.drawable.cl068_64));
        itemList.add(new Argolla14k("CL095R-64","Argolla 6mm 14 Kilates","P.P: 2.1 gr",R.drawable.cl095r_64));
        itemList.add(new Argolla14k("CL106-64","Argolla 6mm 14 Kilates","P.P: 2.1",R.drawable.cl106_64));
        itemList.add(new Argolla14k("CL1112-64","Argolla 6mm 14 Kilates","P.P: 1.9 gr",R.drawable.cl1112_64));
        itemList.add(new Argolla14k("CL009","Argolla 4 mm 14 Kilates","P.P: 1.3 gr", R.drawable.cl009));
        itemList.add(new Argolla14k("CL010","Argolla 4 mm 14 Kilates","P.P: 1.3 gr",R.drawable.cl010));
        itemList.add(new Argolla14k("CL086-44","Argolla 4 mm 14 Kilates","P.P: 1.4 gr",R.drawable.cl086_44));
        itemList.add(new Argolla14k("CL095R-44","Argolla 4mm ","P.P: 1.4 gr",R.drawable.cl095r_44));
        itemList.add(new Argolla14k("CL096R-44","Argolla 4mm 14 Kilates","P.P: 1.3 gr",R.drawable.cl096r_44));
        itemList.add(new Argolla14k("CL100R-44","Argolla 4mm 14 kilates","P.P: 1.5 gr",R.drawable.cl100r_44));
        itemList.add(new Argolla14k("CL004CPR","Argolla 6mm 14 Kilates","P.P: 2.8 gr",R.drawable.cl004cpr));
        itemList.add(new Argolla14k("CL008CPR","Argolla 6mm 14 Kilates","P.P: 2.9 gr",R.drawable.cl008cpr));
        itemList.add(new Argolla14k("CL001COCP","Argolla 6mm 14 Kilates","P.P: 2.8 gr",R.drawable.cl001cocp));
        itemList.add(new Argolla14k("CL004COCP","Argolla 6mm 14 Kilates","P.P: 2.8gr",R.drawable.cl004cocp));


        return itemList;
    }
}