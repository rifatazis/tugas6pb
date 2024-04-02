package com.example.recycleactivity;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.viewHolder> {

    private ArrayList<Model> models;
    private Context context;

    public adapter(ArrayList<Model> models, Context context) {
        this.models = models;
        this.context = context;

    }

    @NonNull
    @Override
    public adapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem,parent,false);
        viewHolder vh = new viewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull adapter.viewHolder holder, int position) {
        Model model = models.get(position);
        holder.nama.setText(model.getNama());
        holder.negara.setText(model.getNegara());
        holder.tglLahir.setText(model.getTglLahir());
        holder.desc.setText(model.getDesc());
        holder.foto.setImageResource(model.getFoto());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, detailActivity.class);

                intent.putExtra("nama", model.getNama());
                intent.putExtra("negara", model.getNegara());
                intent.putExtra("desc", model.getDesc());
                intent.putExtra("tglLahir", model.getTglLahir());
                intent.putExtra("foto", model.getFoto());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView nama,negara,tglLahir, desc;
        ImageView foto;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

             nama = itemView.findViewById(R.id.tvNama);
             negara = itemView.findViewById(R.id.tvNegara);
             tglLahir = itemView.findViewById(R.id.tvTglLahir);
             desc = itemView.findViewById(R.id.tvDesc);
             foto = itemView.findViewById(R.id.foto);
        }
    }
}
