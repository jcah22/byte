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

    private void initValues(){

        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvLista.setLayoutManager(manager);

        items = getItems();
        adapter = new ReciclerArg14kEurofitAdapter(items);
        rvLista.setAdapter(adapter);



    }

    private List<Argolla14Eurofit> getItems() {
        List<Argolla14Eurofit> itemList = new ArrayList<>();

      //  itemList.add(new Argolla14Confort("CF002", "Argolla 6 mm 14 Kilates", "p.p. 3.5gr", R.drawable.cf002));
        itemList.add(new Argolla14Eurofit("EF028R","Argolla 6 mm 14 Kilates","p.p. 4.5 gr",R.drawable.ef028r));



        return itemList;
    }
}