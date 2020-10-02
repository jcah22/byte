package com.jcah.abyte.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jcah.abyte.R;
import com.jcah.abyte.models.Argolla14Confort;
import com.jcah.abyte.models.Argolla14Eurofit;

import java.util.List;

public class ReciclerArg14kEurofitAdapter extends RecyclerView.Adapter<ReciclerArg14kEurofitAdapter.RecyclerHolder> {

    private List<Argolla14Eurofit> items;

    public ReciclerArg14kEurofitAdapter(List<Argolla14Eurofit> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_argolla_eurofit,parent,false);

        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHolder holder, int position) {
        final Argolla14Eurofit item = items.get(position);
        holder.codigo.setText(item.getCodigo());
        holder.descripcion.setText(item.getDescripcion());
        holder.peso.setText(item.getPeso());
        holder.foto.setImageResource(item.getFoto());




    }


    @Override
    public int getItemCount() {
        return items.size();
    }



    public class RecyclerHolder extends RecyclerView.ViewHolder {

        private ImageView foto;
        private TextView codigo;
        private TextView descripcion;
        private TextView peso;


        public RecyclerHolder(@NonNull View view) {
            super(view);

            foto = itemView.findViewById(R.id.imgArgollaEurofit);
            codigo = itemView.findViewById(R.id.txtCodigoEurofit);
            descripcion = itemView.findViewById(R.id.txtDescripcionEurofit);
            peso = itemView.findViewById(R.id.txtPesoPromEurofit);





        }
    }


}
