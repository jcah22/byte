package com.jcah.abyte.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jcah.abyte.AreteDetalleActivity;
import com.jcah.abyte.R;
import com.jcah.abyte.models.Aretes;

import java.util.List;

public class ReciclerAreteAdapter extends RecyclerView.Adapter<ReciclerAreteAdapter.RecyclerHolder> {

    private List<Aretes> items;

    public ReciclerAreteAdapter(List<Aretes> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_aretes,parent,false);
        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerHolder holder, int position) {

        final  Aretes item = items.get(position);
        holder.foto.setImageResource(item.getFoto());
        holder.codigo.setText(item.getCodigo());
        holder.descripcion.setText(item.getDescripcion());
        holder.pesoProm.setText(item.getPesoProm());

        // TODO - IMPLEMENTAR CLICK EN CADA ITEM
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent iDetalleArete = new Intent(holder.itemView.getContext(), AreteDetalleActivity.class);
                iDetalleArete.putExtra("itemDetalle",item);
                holder.itemView.getContext().startActivity(iDetalleArete);
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
        private TextView pesoProm;


        public RecyclerHolder(@NonNull View itemView) {
            super(itemView);
            foto = itemView.findViewById(R.id.imgAretes);
            codigo = itemView.findViewById(R.id.txtCodigoAretes);
            descripcion = itemView.findViewById(R.id.txtDescripcionAretes);
            pesoProm = itemView.findViewById(R.id.txtPesoPromAretes);
        }
    }
}
