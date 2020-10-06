package com.jcah.abyte;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.jcah.abyte.adapters.ReciclerArg14kConfortAdapter;
import com.jcah.abyte.adapters.ReciclerArg14kEurofitAdapter;
import com.jcah.abyte.models.Argolla14Confort;
import com.jcah.abyte.models.Argolla14Eurofit;

import java.util.ArrayList;
import java.util.List;

public class ArgollaEurofitActivity extends AppCompatActivity {

    private RecyclerView rvLista;
    private ReciclerArg14kEurofitAdapter adapter;
    private List<Argolla14Eurofit> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_argolla_eurofit);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        initViews();
        initValues();

    }

    private void initViews() {
        rvLista = findViewById(R.id.ReciclerViewEurofit);
    }

    private void initValues() {

        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvLista.setLayoutManager(manager);

        items = getItems();
        adapter = new ReciclerArg14kEurofitAdapter(items);
        rvLista.setAdapter(adapter);


    }

    private List<Argolla14Eurofit> getItems() {
        List<Argolla14Eurofit> itemList = new ArrayList<>();

        itemList.add(new Argolla14Eurofit("EF028R", "Argolla 6 mm 14 Kilates", "p.p. 4.5 gramos", R.drawable.ef028r));
        itemList.add(new Argolla14Eurofit("EF028R", "Argolla 2.5 mm 14 Kilates", "p.p. 4.5 gramos", R.drawable.ef009b));
        itemList.add(new Argolla14Eurofit("EF057R-54", "Argolla 5 mm 14 Kilates", "p.p. 3.2 gramos", R.drawable.ef057r_54));
        itemList.add(new Argolla14Eurofit("EF098R-64", "Argolla 6 mm 14 Kilates", "p.p. 3.4 gramos", R.drawable.ef098r_64));
        itemList.add(new Argolla14Eurofit("EF097BP-44", "Argolla 4 mm 14 Kilates", "p.p. 3.2 gramos", R.drawable.ef097bp_44));
        itemList.add(new Argolla14Eurofit("EF098R-44", "Argolla 4 mm 14 Kilates", "p.p. 2.6 gramos", R.drawable.ef098r_44));
        itemList.add(new Argolla14Eurofit("EF102CP-44", "Argolla 4 mm 14 Kilates", "p.p. 3.0 gramos", R.drawable.ef102cp_44));


        return itemList;
    }
}