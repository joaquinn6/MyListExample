package com.cam.mylistexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapPersona extends ArrayAdapter {
    private Context context;
    private int resource;
    private List<Persona> personaList;
    public AdapPersona(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.context=context;
        this.personaList=objects;
        this.resource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        LayoutInflater inflater= LayoutInflater.from(this.context);
        View v=inflater.inflate(this.resource,parent,false);
        TextView tvNombre=v.findViewById(R.id.tvNombre);
        TextView tvFechaNac= v.findViewById(R.id.tvFechaNac);
        TextView tvSexo=v.findViewById(R.id.tvSexo);
        TextView tvDescripcion=v.findViewById(R.id.tvDescripcion);

        tvNombre.setText(personaList.get(position).getNombre());
        tvFechaNac.setText(personaList.get(position).getFechaNac());
        tvSexo.setText(personaList.get(position).getSexo());
        tvDescripcion.setText(personaList.get(position).getDescripcion());


        return v;
    }
}
