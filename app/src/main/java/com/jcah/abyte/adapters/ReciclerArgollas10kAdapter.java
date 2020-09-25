package com.jcah.abyte.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jcah.abyte.DetalleArgolla10kActivity;
import com.jcah.abyte.R;
import com.jcah.abyte.models.ArgollaDiezK;

import java.util.List;


public class ReciclerArgollas10kAdapter extends RecyclerView.Adapter<ReciclerArgollas10kAdapter.RecyclerHolder>{

    private List<ArgollaDiezK> items;

    public ReciclerArgollas10kAdapter(List<ArgollaDiezK> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View  view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_argolla_diezk,parent,false);

        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerHolder holder, final int position) {

        final ArgollaDiezK item = items.get(position);
        holder.codigo.setText(item.getCodigo());
        holder.descripcion.setText(item.getDescripcion());
        holder.peso.setText(item.getPeso());
        holder.foto.setImageResource(item.getFoto());

        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(holder.itemView.getContext(), DetalleArgolla10kActivity.class);
                i.putExtra("itemDetalle",item);
                holder.itemView.getContext().startActivity(i);
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
            foto = itemView.findViewById(R.id.imgArgolla10k);
            codigo = itemView.findViewById(R.id.txtCodigo);
            descripcion = itemView.findViewById(R.id.txtDescripcion);
            peso = itemView.findViewById(R.id.txtPesoProm);

        }

    }


}
