package com.jcah.abyte.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jcah.abyte.DetalleArgCatorceClasicaActivity;
import com.jcah.abyte.R;
import com.jcah.abyte.models.Argolla14k;


import java.util.List;
import java.util.zip.Inflater;

public class ReciclerArgollas14kAdapter extends RecyclerView.Adapter<ReciclerArgollas14kAdapter.RecyclerHolder> {

    private List<Argolla14k> items;

    public ReciclerArgollas14kAdapter(List<Argolla14k> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_argolla_catorcek,parent,false);

        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerHolder holder, int position) {

        final Argolla14k item = items.get(position);
        holder.codigo.setText(item.getCodigo());
        holder.descripcion.setText(item.getDescripcion());
        holder.peso.setText(item.getPeso());
        holder.peso.setText(item.getFoto());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent14k = new Intent(holder.itemView.getContext(), DetalleArgCatorceClasicaActivity.class);
                intent14k.putExtra("itemDetalle",item);
                holder.itemView.getContext().startActivity(intent14k);
            }
        });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    public  static class RecyclerHolder extends RecyclerView.ViewHolder{

        private ImageView foto;
        private TextView codigo;
        private TextView descripcion;
        private TextView peso;

        public RecyclerHolder(@NonNull View view ){
            super(view);
            foto = itemView.findViewById(R.id.imgArgolla14k);
            codigo = itemView.findViewById(R.id.txtCodigo14k);
            descripcion = itemView.findViewById(R.id.txtDescripcion14k);
            peso = itemView.findViewById(R.id.txtPesoProm14k);

        }

    }


}
