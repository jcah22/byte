package com.jcah.abyte;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.jcah.abyte.adapters.ReciclerCollarPlataAdapter;
import com.jcah.abyte.models.CollaresPlata;

import java.util.ArrayList;
import java.util.List;

public class CollarPlataActivity extends AppCompatActivity {

    private RecyclerView rvLista;
    private ReciclerCollarPlataAdapter adapter;
    private List<CollaresPlata> items;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collar_plata);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        initViews();
        initValues();
    }

    private void initViews() {

        rvLista = findViewById(R.id.rvCollaresPlata);

    }

    private void initValues() {
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvLista.setLayoutManager(manager);

        items = getItems();
        adapter = new ReciclerCollarPlataAdapter(items);
        rvLista.setAdapter(adapter);

    }


    private List<CollaresPlata> getItems() {
        List<CollaresPlata> itemList = new ArrayList<>();


        itemList.add(new CollaresPlata("CREA198CL-1", "Collar doble de bolitas", R.drawable.crea198cl_1));
        itemList.add(new CollaresPlata("CREA200CL-1", "Collar de bolita", R.drawable.crea200cl_1));
        itemList.add(new CollaresPlata("DI1100CL-1", "Collar flor de loto", R.drawable.di1100cl));
        itemList.add(new CollaresPlata("DI1117CL-1", "Collar corazon", R.drawable.di1114cl_1));
        itemList.add(new CollaresPlata("DI1117CL-1", "Collar corazon estrella de david", R.drawable.di1117cl_1));
        itemList.add(new CollaresPlata("DI1120CL-1", "Collar flecha infinito", R.drawable.di1120cl_1));
        itemList.add(new CollaresPlata("DI1204CL-1", "Collar unicornio", R.drawable.di1204cl_1));
        itemList.add(new CollaresPlata("DI1219CL_1", "Collar corazon mundial", R.drawable.di1219cl_1));
        itemList.add(new CollaresPlata("DI1255CL-1", "Collar de perrito sin patas", R.drawable.di1255cl_1));
        itemList.add(new CollaresPlata("DI1261CL-1", "Collar infinito i love you", R.drawable.di1261cl_1));
        itemList.add(new CollaresPlata("DI2127CL-1", "Collar tu y yo ", R.drawable.di2127cl_1));
        itemList.add(new CollaresPlata("DI2129CL-1", "Collar corazon al infinito", R.drawable.di2129cl_1));
        itemList.add(new CollaresPlata("DI2158CL_1", "Collar corazon vacio", R.drawable.di2158cl_1));
        itemList.add(new CollaresPlata("DI2159CL_1", "Collar corazon y corazoncito", R.drawable.di2159cl_1));
        itemList.add(new CollaresPlata("DI2161CL-1", "Collar corazones unidos", R.drawable.di2161cl_1));
        itemList.add(new CollaresPlata("DI2162CL-1", "Collar corazones entrelazados", R.drawable.di2162cl_1));
        itemList.add(new CollaresPlata("DI2169CL-1", "Collar corazon plano", R.drawable.di2169cl_1));
        itemList.add(new CollaresPlata("DI3001CL_1", "Collar corazon mocho", R.drawable.di3001cl_1));
        itemList.add(new CollaresPlata("DI3077CL-1", "Collar muñeca ", R.drawable.di3077cl_1));
        itemList.add(new CollaresPlata("DI3079CL_1", "Collar circulos entrelazados", R.drawable.di3079cl_1));
        itemList.add(new CollaresPlata("DI3080CL-1", "Collar de trebol", R.drawable.di3080cl_1));
        itemList.add(new CollaresPlata("DI3081CL-1", "Collar arbol de la abundancia", R.drawable.di3081cl));
        itemList.add(new CollaresPlata("DI3082CL-1", "Collar mano de fatima", R.drawable.di3082cl_1));
        itemList.add(new CollaresPlata("DI3084CL-1", "Collar infinito vertical", R.drawable.di3084cl_1));
        itemList.add(new CollaresPlata("DI3085CL-1", "Collar de mariposa", R.drawable.di3085cl_1));


        return itemList;
    }

}