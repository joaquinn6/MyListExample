package com.cam.mylistexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

    private List<Persona> personaList = new ArrayList<>();

    private RvAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        personaList.add(new Persona("Oton","01/03/1986",
                "Masculino","Profesor de Android"));
        personaList.add(new Persona("Esperanza","01/04/2018",
                "Femenino","Bebe del grupo"));
        personaList.add(new Persona("Javier","14/07/1996",
                "Masculino","Alumno ayudante"));
        personaList.add(new Persona("Rebeca","20/12/2008",
                "Femenino","Supervisora de la clase"));

        RecyclerView rvPersona= findViewById(R.id.rvPersona);
        adapter= new RvAdapter(personaList);
        adapter.setOnItemClickListener(new RvAdapter.OnItemClickListener() {
            @Override
            public void OnItemClickListener(int posicion) {
                Toast.makeText(RecyclerActivity.this, "HIIIII", Toast.LENGTH_SHORT).show();
            }
        });
//        LinearLayoutManager manager = new LinearLayoutManager(this,
//                LinearLayoutManager.HORIZONTAL,false);
        GridLayoutManager manager = new GridLayoutManager(this,2);
        rvPersona.setLayoutManager(manager);
        rvPersona.setAdapter(adapter);


    }
}



