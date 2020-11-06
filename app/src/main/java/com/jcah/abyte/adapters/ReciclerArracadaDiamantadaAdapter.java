package com.jcah.abyte.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jcah.abyte.R;
import com.jcah.abyte.models.ArracadaDiamantada;

import java.util.List;

public class ReciclerArracadaDiamantadaAdapter extends RecyclerView.Adapter<ReciclerArracadaDiamantadaAdapter.RecyclerHolder> {

    private List<ArracadaDiamantada> items;

    public ReciclerArracadaDiamantadaAdapter(List<ArracadaDiamantada> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_arracada_diamantada, parent, false);

        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerHolder holder, int position) {
        final ArracadaDiamantada item = items.get(position);
        holder.foto.setImageResource(item.getFoto());
        holder.codigo.setText(item.getCodigo());
        holder.descripcion.setText(item.getDescripcion());
        holder.pesoProm.setText(item.getPesoProm());

        // TODO click para detalle de cada item
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(holder.itemView.getContext(), "Click item", Toast.LENGTH_SHORT).show();
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
            foto = itemView.findViewById(R.id.imgArracadaDiamantada);
            codigo = itemView.findViewById(R.id.txtCodigoArracadaDiamantada);
            descripcion = itemView.findViewById(R.id.txtDescripcionArracadaDiamantada);
            pesoProm = itemView.findViewById(R.id.txtPesoPromArracadaDiamantada);

        }
    }
}
