package com.jcah.abyte;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.jcah.abyte.adapters.ReciclerBroquelesAdapter;
import com.jcah.abyte.models.Broqueles;

import java.util.ArrayList;
import java.util.List;

public class BroquelesActivity extends AppCompatActivity {

    private RecyclerView rvLista;
    private ReciclerBroquelesAdapter adapter;
    private List<Broqueles> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broqueles);


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        initViews();
        initValues();
    }

    private void initViews() {
        rvLista = findViewById(R.id.rvBroqueles);
    }

    private void initValues(){

        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvLista.setLayoutManager(manager);
        items = getItems();
        adapter = new ReciclerBroquelesAdapter(items);
        rvLista.setAdapter(adapter);


    }

    private List<Broqueles> getItems() {
        List<Broqueles> itemList = new ArrayList<>();

            itemList.add(new Broqueles(R.drawable.di1095bq,"DI1095BQ","Broquel","1.0 gr"));
            itemList.add(new Broqueles(R.drawable.di1098bq,"DI1098BQ","Broquel","1.0 gr"));
            itemList.add(new Broqueles(R.drawable.di1251bq,"DI1251BQ","Broquel","1.0 gr"));
            itemList.add(new Broqueles(R.drawable.di10279bq,"DI10279BQ","Broquel","1.0 gr"));
            itemList.add(new Broqueles(R.drawable.dv301bqe,"DV301BQE","Broquel","1.0 gr"));
            itemList.add(new Broqueles(R.drawable.gra279bq,"GRA279BQ","Broquel","1.0 gr"));
            itemList.add(new Broqueles(R.drawable.gra285bq,"GRA285BQ","Broquel","1.0 gr"));
            itemList.add(new Broqueles(R.drawable.gra293bq,"GRA293BQ","Broquel","1.0 gr"));
            itemList.add(new Broqueles(R.drawable.gra294bq,"GRA294BQ","Broquel","1.0 gr"));
            itemList.add(new Broqueles(R.drawable.gra299bq,"GRA300BQ","Broquel","1.0 gr"));
            itemList.add(new Broqueles(R.drawable.gra301bq,"GRA301BQ","Broquel","1.0 gr"));



        return itemList;
    }
}