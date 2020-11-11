package com.jcah.abyte.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jcah.abyte.DetalleBroquelActivity;
import com.jcah.abyte.R;
import com.jcah.abyte.models.Broqueles;

import java.util.List;

public class ReciclerBroquelesAdapter extends RecyclerView.Adapter<ReciclerBroquelesAdapter.RecyclerHolder> {

    private List<Broqueles> items;

    public ReciclerBroquelesAdapter(List<Broqueles> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_broqueles,parent,false);

        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerHolder holder, int position) {

        final  Broqueles item = items.get(position);
        holder.foto.setImageResource(item.getFoto());
        holder.codigo.setText(item.getCodigo());
        holder.descripcion.setText(item.getDescripcion());
        holder.pesoProm.setText(item.getPesoProm());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iDetalleBroqueles = new Intent(holder.itemView.getContext(), DetalleBroquelActivity.class);
                iDetalleBroqueles.putExtra("itemDetalle",item);
                holder.itemView.getContext().startActivity(iDetalleBroqueles);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class RecyclerHolder extends RecyclerView.ViewHolder{


        private ImageView foto;
        private TextView codigo;
        private TextView descripcion;
        private TextView pesoProm;

        public RecyclerHolder(@NonNull View itemView) {
            super(itemView);
            foto = itemView.findViewById(R.id.imgBroqueles);
            codigo = itemView.findViewById(R.id.txtCodigoBroqueles);
            descripcion = itemView.findViewById(R.id.txtDescripcionBroqueles);
            pesoProm = itemView.findViewById(R.id.txtPesoPromBroqueles);
        }
    }
}
