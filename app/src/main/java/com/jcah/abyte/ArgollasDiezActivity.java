package com.jcah.abyte;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.jcah.abyte.adapters.ReciclerArgollas10kAdapter;
import com.jcah.abyte.models.ArgollaDiezK;

import java.util.ArrayList;
import java.util.List;

public class ArgollasDiezActivity extends AppCompatActivity {

    private RecyclerView rvLista;
    private ReciclerArgollas10kAdapter adapter;
    private List<ArgollaDiezK> items;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_argollas_diez);


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        initViews();
        initValues();

    }


private void initViews(){
        rvLista = findViewById(R.id.reclicerViewDiezK);

}

private void initValues(){
        LinearLayoutManager manager = new LinearLayoutManager(this);
    rvLista.setLayoutManager(manager);

    items = getItems();
    adapter = new ReciclerArgollas10kAdapter(items);
    rvLista.setAdapter(adapter);
}




    private List<ArgollaDiezK> getItems(){
        List<ArgollaDiezK> itemList = new ArrayList<>();

        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));
        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));
        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));
        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));
        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));
        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));
        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));
        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));
        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));
        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));

        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));
        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));
        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));
        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));
        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));
        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));
        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));
        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));
        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));
        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));

        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));
        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));
        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));
        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));
        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));
        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));
        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));
        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));
        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));
        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));
        itemList.add(new ArgollaDiezK("CL1101","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));

        return itemList;
    }


}



