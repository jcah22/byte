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
        itemList.add(new ArgollaDiezK("CL1108","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1108));
        itemList.add(new ArgollaDiezK("CL1109","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1109));
        itemList.add(new ArgollaDiezK("CL1110","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1110));
        itemList.add(new ArgollaDiezK("CL1116","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1116));
        itemList.add(new ArgollaDiezK("CL1200","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1200));
        itemList.add(new ArgollaDiezK("CL1201","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1201));
        itemList.add(new ArgollaDiezK("CL1202","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1202));
        itemList.add(new ArgollaDiezK("CL088-61","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl088_61));
        itemList.add(new ArgollaDiezK("CL104-61","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl104_61));

        itemList.add(new ArgollaDiezK("CL105-61","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl105_61));
        itemList.add(new ArgollaDiezK("CL107CO-61","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl107co_61));
        // itemList.add(new ArgollaDiezK("CL1108-41","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl108));
        itemList.add(new ArgollaDiezK("CL1117","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1117));
        itemList.add(new ArgollaDiezK("CL1118","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1118));
        itemList.add(new ArgollaDiezK("CL1119","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1119));
        itemList.add(new ArgollaDiezK("CL1120","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1120));
        itemList.add(new ArgollaDiezK("CL1122","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1122));
        itemList.add(new ArgollaDiezK("CL1123","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1123));
        itemList.add(new ArgollaDiezK("CL1126","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1126));

        itemList.add(new ArgollaDiezK("CL1128","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1128));
        itemList.add(new ArgollaDiezK("CL1129","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1129));
        itemList.add(new ArgollaDiezK("CL1131","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1131));
        itemList.add(new ArgollaDiezK("CL1112-41","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1112_41));
        itemList.add(new ArgollaDiezK("CL101R-41","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl101r_41));
        itemList.add(new ArgollaDiezK("CL099R-41","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl099r_41));
        itemList.add(new ArgollaDiezK("CL1104B","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1104b));
        itemList.add(new ArgollaDiezK("CL1110B","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1110b));
        itemList.add(new ArgollaDiezK("CL1112B","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1112b));
        itemList.add(new ArgollaDiezK("CL1114B","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl1101));
        itemList.add(new ArgollaDiezK("CL004COCP-41","Argolla 6mm 10 Kilates","P.P: 1.8 gr ",R.drawable.cl004cocp_41));

        return itemList;
    }


}



