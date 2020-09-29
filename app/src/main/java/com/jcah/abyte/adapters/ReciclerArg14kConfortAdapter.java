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

import java.util.List;

public class ReciclerArg14kConfortAdapter extends RecyclerView.Adapter<ReciclerArg14kConfortAdapter.RecyclerHolder> {



    private List<Argolla14Confort> items;


    public ReciclerArg14kConfortAdapter(List<Argolla14Confort> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_argolla_confort,parent,false);

        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHolder holder, int position) {
        final Argolla14Confort  item = items.get(position);
        holder.codigo.setText(item.getCodigo());
        holder.descripcion.setText(item.getDescripcion());
        holder.peso.setText(item.getPeso());
        holder.foto.setImageResource(item.getFoto());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


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
            foto = itemView.findViewById(R.id.imgArgollaConfort);
            codigo = itemView.findViewById(R.id.txtCodigoConfort);
            descripcion = itemView.findViewById(R.id.txtDescripcionConfort);
            peso = itemView.findViewById(R.id.txtPesoPromConfort);
        }
    }
}
