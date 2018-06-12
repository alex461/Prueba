package com.example.alex.turuta.Adaptador;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alex.turuta.Model.RutasModel;
import com.example.alex.turuta.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MiViewHolder> {

    private List<RutasModel> rutasModels;
    private int layout;
    private Activity activity;

    public MyAdapter(List<RutasModel> rutasModels, int layout, Activity activity) {
        this.rutasModels = rutasModels;
        this.layout = layout;
        this.activity = activity;
    }

    @Override
    public MiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(layout,parent,false);
        MiViewHolder vh = new MiViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MiViewHolder holder, int position) {
        holder.bind(rutasModels.get(position));

    }

    @Override
    public int getItemCount() {
        return rutasModels.size();
    }

    public class MiViewHolder extends RecyclerView.ViewHolder{

        private ImageView fondo;
        private TextView precio;
        private ImageView icono;


        public MiViewHolder(View itemView) {
            super(itemView);

            fondo = itemView.findViewById(R.id.imgP1ID);
            precio = itemView.findViewById(R.id.precioCard);
            icono = itemView.findViewById(R.id.iconoTaxi);

        }

        public void bind(RutasModel rutasModel){

            fondo.setImageResource(rutasModel.getFondo());
            precio.setText(rutasModel.getPrecio());
            icono.setImageResource(rutasModel.getIcono());

        }
    }




}






