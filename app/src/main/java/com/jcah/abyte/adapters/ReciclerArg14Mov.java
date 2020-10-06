package com.jcah.abyte.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jcah.abyte.R;
import com.jcah.abyte.models.Argolla14Mov;

import java.util.List;

public class ReciclerArg14Mov extends RecyclerView.Adapter<ReciclerArg14Mov.RecyclerHolder> {

    private List<Argolla14Mov> items;

    public ReciclerArg14Mov(List<Argolla14Mov> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_argolla_mov,parent,false);
        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHolder holder, int position) {

        final Argolla14Mov item = items.get(position);

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
            foto = itemView.findViewById(R.id.imgArgollaMov);
            codigo = itemView.findViewById(R.id.txtCodigoMov);
            descripcion = itemView.findViewById(R.id.txtDescripcionMov);
            peso = itemView.findViewById(R.id.txtPesoPromMov);
        }
    }
}
