package com.jcah.abyte;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.jcah.abyte.adapters.ReciclerArracadaDiamantadaAdapter;
import com.jcah.abyte.models.ArracadaDiamantada;

import java.util.ArrayList;
import java.util.List;

public class ArracadaDiamantadaActivity extends AppCompatActivity {

      private RecyclerView rvLista;
        private ReciclerArracadaDiamantadaAdapter adapter;
      private List<ArracadaDiamantada> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arracada_diamantada);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        initViews();
        initValues();
    }

    private void initViews() {
        rvLista = findViewById(R.id.rvArracadaDiamantada);
    }

    private void initValues() {
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvLista.setLayoutManager(manager);
        items = getItems();
        adapter= new ReciclerArracadaDiamantadaAdapter(items);
        rvLista.setAdapter(adapter);

    }

    private List<ArracadaDiamantada> getItems() {
        List<ArracadaDiamantada> itemList = new ArrayList<>();
        itemList.add(new ArracadaDiamantada(R.drawable.ad200cbr2,"AD200CBR2","Arracada diamantada 2.0 cordon blue R2","1.2 gr R2"));
        itemList.add(new ArracadaDiamantada(R.drawable.ad200cbr3,"AD200CBR3","Arracada diamantada 2.0 cordon blue R3","1.7 gr R3"));
        itemList.add(new ArracadaDiamantada(R.drawable.ad200cbr5,"AD200CBR5","Arracada diamantada 2.0 cordon blue R5","2.5 gr R5"));
        itemList.add(new ArracadaDiamantada(R.drawable.ad200cbr7,"AD200CBR7","Arracada diamantada 2.0 cordon blue R7","3.1 gr R7"));

        itemList.add(new ArracadaDiamantada(R.drawable.ad200cdr2,"AD200CDR2","Arracada diamantada 2.0 candy R2","1.3 gr R2"));
        itemList.add(new ArracadaDiamantada(R.drawable.ad200cdr3,"AD200CDR3","Arracada diamantada 2.0 candy R3","1.7 gr R3"));
        itemList.add(new ArracadaDiamantada(R.drawable.ad200cdr4,"AD200CDR4","Arracada diamantada 2.0 candy R4","2.0 gr R4"));
        itemList.add(new ArracadaDiamantada(R.drawable.ad200cdr5,"AD200CDR5","Arracada diamantada 2.0 candy R5","2.4 gr R5"));
        itemList.add(new ArracadaDiamantada(R.drawable.ad200cdr7,"AD200CDR7","Arracada diamantada 2.0 candy R7","3.1 gr R7"));


        itemList.add(new ArracadaDiamantada(R.drawable.ad200cfr2,"AD200CFR2","Arracada diamantada 2.0 confeti R2","1.2 gr R2"));
        itemList.add(new ArracadaDiamantada(R.drawable.ad200cfr3,"AD200CFR3","Arracada diamantada 2.0 confeti R3","1.7 gr R3"));
        itemList.add(new ArracadaDiamantada(R.drawable.ad200cfr5,"AD200CFR5","Arracada diamantada 2.0 confeti R5","2.4 gr R5"));
        itemList.add(new ArracadaDiamantada(R.drawable.ad200cfr7,"AD200CFR7","Arracada diamantada 2.0 confeti R7","3.1 gr R7"));

        itemList.add(new ArracadaDiamantada(R.drawable.ad200ctr2,"AD200CTR2","Arracada diamantada 2.0 centurión R2","1.3 gr R2"));
        itemList.add(new ArracadaDiamantada(R.drawable.ad200ctr3,"AD200CTR3","Arracada diamantada 2.0 centurión R3","1.8 gr R3"));
        itemList.add(new ArracadaDiamantada(R.drawable.ad200ctr4,"AD200CTR4","Arracada diamantada 2.0 centurión R4","2.0 gr R4" ));
        itemList.add(new ArracadaDiamantada(R.drawable.ad200ctr7,"AD200CTR7","Arracada diamantada 2.0 centurión R7","3.2 gr R7"));

        itemList.add(new ArracadaDiamantada(R.drawable.ad200dmr1,"AD200DMR1","Arracada diamantada 2.0 R1","1.0 gr R1"));
        itemList.add(new ArracadaDiamantada(R.drawable.ad200dmr2,"AD200DMR2","Arracada diamantada 2.0 dominó R2", "1.3 gr R2"));
        itemList.add(new ArracadaDiamantada(R.drawable.ad200dmr3,"AD200DMR3","Arracada diamantada 2.0 dominó R3","1.8 gr R3"));
        itemList.add(new ArracadaDiamantada(R.drawable.ad200dmr5,"AD200DMR5","Arracada diamantada 2.0 dominó R5","2.5 gr R5"));
        itemList.add(new ArracadaDiamantada(R.drawable.ad200dmr7,"AD200DMR7","Arracada diamantada 2.0 dominó R7","2.9 gr R7"));


        itemList.add(new ArracadaDiamantada(R.drawable.ad200mtr2,"AD200MTR2","Arracada diamantada 2.0 militar R2","1.3 gr R2"));
        itemList.add(new ArracadaDiamantada(R.drawable.ad200mtr3,"AD200MTR3","Arracada diamantada 2.0 militar R3","1.8 gr R3"));
        itemList.add(new ArracadaDiamantada(R.drawable.ad200mtr4,"AD200MTR4","Arracada diamantada 2.0 militar TUBO 2.0  R4","2.0 gr R4 "));
        itemList.add(new ArracadaDiamantada(R.drawable.ad200mtr5,"AD200MTR5","Arracada diamantada 2.0 militar R5 TUBO 2.0","2.5 gr R5"));
        itemList.add(new ArracadaDiamantada(R.drawable.ad200mtr7,"AD200MTR7","Arracada diamantada 2.0 militar R7 TUBO 2.0 ","3.1 gr R7"));


        itemList.add(new ArracadaDiamantada(R.drawable.ad200pnr2,"AD200PNR2","Arracada diamantada 2.0 panal R2 TUBO 2.0","1.3 gr R2"));
        itemList.add(new ArracadaDiamantada(R.drawable.ad200pnr2,"AD200PNR3","Arracada diamantada 2.0 panal R3 TUBO 2.0 ","1.7 gr R3"));
        itemList.add(new ArracadaDiamantada(R.drawable.ad200pnr5,"AD200PNR5","Arracada diamantada 2.0 panal R5 TUBO 2.0","2.5 gr R5"));
        itemList.add(new ArracadaDiamantada(R.drawable.ad200pnr7,"AD200PNR7","Arracada diamantada 2.0 panal R7 TUBO 2.0","3.1 GR R7"));




        return  itemList;
    }
}