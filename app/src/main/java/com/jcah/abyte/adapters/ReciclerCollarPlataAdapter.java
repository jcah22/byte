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

import com.jcah.abyte.DetalleCollarPlataActivity;
import com.jcah.abyte.R;
import com.jcah.abyte.models.CollaresPlata;

import java.util.List;

public class ReciclerCollarPlataAdapter extends RecyclerView.Adapter<ReciclerCollarPlataAdapter.RecyclerHolder> {

    private List<CollaresPlata> items;

    public ReciclerCollarPlataAdapter(List<CollaresPlata> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_collar_plata,parent,false);

        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerHolder holder, int position) {

        final CollaresPlata item = items.get(position);
        holder.foto.setImageResource(item.getFoto());
        holder.codigo.setText(item.getCodigo());
        holder.descripcion.setText(item.getDescripcion());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iDetalleCollarPlata = new Intent(holder.itemView.getContext(), DetalleCollarPlataActivity.class);
                iDetalleCollarPlata.putExtra("itemDetalle", item);
                holder.itemView.getContext().startActivity(iDetalleCollarPlata);
            }
        });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    public class RecyclerHolder extends  RecyclerView.ViewHolder{

        private ImageView foto;
        private TextView codigo;
        private TextView descripcion;



        public RecyclerHolder(@NonNull View itemView) {
            super(itemView);
            foto = itemView.findViewById(R.id.imgCollarPlata);
            codigo = itemView.findViewById(R.id.txtCodigoCollarPlata);
            descripcion = itemView.findViewById(R.id.txtDescripcionCollarPlata);
        }
    }
}
