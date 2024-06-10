package com.example.lista_planetas;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewGroupCompat;

public class Adaptador extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] nombres;
    private final  String[] descripcion;
    private final Integer[] planetasImagenes;

    public Adaptador (Activity context, String[] nombres, String[] descripcion, Integer[] planetasImagenes) {
        super(context,R.layout.item,nombres);
        this.context = context;
        this.nombres = nombres;
        this.descripcion = descripcion;
        this.planetasImagenes = planetasImagenes;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.item,null);
        TextView _nombres=(TextView)rowView.findViewById(R.id.nombres);
        TextView _descripcion=(TextView)rowView.findViewById(R.id.descripcion);
        ImageView _imagen=(ImageView) rowView.findViewById(R.id.logo);
        _nombres.setText(nombres[position]);
        _descripcion.setText(descripcion[position]);
        _imagen.setImageResource(planetasImagenes[position]);
        return rowView;
    }
}
