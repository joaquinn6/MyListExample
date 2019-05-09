package com.cam.mylistexample;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.PersonaHolder>{

    private List<Persona> personaList;


    private  OnItemClickListener onItemClickListener;

    public interface OnItemClickListener{

        void OnItemClickListener(int posicion);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }


    public RvAdapter(List<Persona> personaList) {
        this.personaList = personaList;
    }

    @NonNull
    @Override
    public PersonaHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view=inflater.inflate(R.layout.item_persona,viewGroup, false);
        PersonaHolder personaHolder = new PersonaHolder(view);
        return personaHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PersonaHolder personaHolder, int i) {
        personaHolder.tvNombre.setText(personaList.get(i).getNombre());
        personaHolder.tvFechaNac.setText(personaList.get(i).getFechaNac());
        personaHolder.tvSexo.setText(personaList.get(i).getSexo());
        personaHolder.tvDescripcion.setText(personaList.get(i).getDescripcion());
    }

    @Override
    public int getItemCount() {
        return personaList.size();
    }

    public  class PersonaHolder extends RecyclerView.ViewHolder  implements View.OnClickListener
    {
        private TextView tvNombre;
        private TextView tvFechaNac;
        private TextView tvSexo;
        private TextView tvDescripcion;

        public PersonaHolder(@NonNull View itemView) {
            super(itemView);
            tvNombre= itemView.findViewById(R.id.tvNombre);
            tvFechaNac= itemView.findViewById(R.id.tvFechaNac);
            tvSexo= itemView.findViewById(R.id.tvSexo);
            tvDescripcion= itemView.findViewById(R.id.tvDescripcion);

//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    onItemClickListener.OnItemClickListener(getAdapterPosition());
//                }
//            });

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            onItemClickListener.OnItemClickListener(getAdapterPosition());
        }
    }
}
