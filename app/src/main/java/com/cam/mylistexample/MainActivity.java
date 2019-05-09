package com.cam.mylistexample;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Array de datos
    //List<String> nombreLista= new ArrayList<>();
    List<Persona> personaList = new ArrayList<>();
    //ArrayAdapter adapter;
    AdapPersona adapPersona;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //obtener listview
        ListView lvListaNombre = findViewById(R.id.lvListaNombre);


//        nombreLista.add("a");
//        nombreLista.add("b");
//        nombreLista.add("c");
//        nombreLista.add("d");
//        nombreLista.add("e");
//        nombreLista.add("f");
//        nombreLista.add("g");
//        nombreLista.add("h");
//        nombreLista.add("i");
//        nombreLista.add("j");
//        nombreLista.add("k");
//        nombreLista.add("m");
//        nombreLista.add("n");
//        nombreLista.add("r");
//        nombreLista.add("s");
//        nombreLista.add("o");
//        nombreLista.add("p");
//        nombreLista.add("q");
//        //Adaptador
//        adapter = new ArrayAdapter(this,
//                android.R.layout.simple_list_item_1
//                ,nombreLista);
//
//        //Asignar adaptador al ListView
//        lvListaNombre.setAdapter(adapter);
//
//
//        //Agregar evento
//        lvListaNombre.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                //Long id identificador de cada item de lista.
//                //int position es la posicion del item en la lista
//                //View view es el item
//                //AdapterView parent es el control ListView
//                final int temp=position;
//                TextView textView = (TextView) view;
//                Toast.makeText(MainActivity.this, "Id:" + id + " position:" + position + " Item:" + textView.getText(),
//                        Toast.LENGTH_SHORT).show();
//
//
//                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//                builder.setTitle("Borrar");
//                builder.setMessage("Desea borrar?");
//                builder.setNegativeButton("NO",null);
//                builder.setPositiveButton("Si", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        nombreLista.remove(temp);
//                        adapter.notifyDataSetChanged();
//                    }
//                });
//
//                AlertDialog dialog= builder.create();
//                dialog.show();
//
//            }
//        });

//        Persona persona= new Persona();
//        persona.setNombre("datos");
//        Persona persona1= new Persona("Datos","","","");
        personaList.add(new Persona("Oton","01/03/1986",
                "Masculino","Profesor de Android"));
        personaList.add(new Persona("Esperanza","01/04/2018",
                "Femenino","Bebe del grupo"));
        personaList.add(new Persona("Javier","14/07/1996",
                "Masculino","Alumno ayudante"));
        personaList.add(new Persona("Rebeca","20/12/2008",
                "Femenino","Supervisora de la clase"));

    adapPersona = new AdapPersona(this,
            R.layout.item_persona,
            personaList);
    lvListaNombre.setAdapter(adapPersona);
    lvListaNombre.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            TextView tvNombre= view.findViewById(R.id.tvNombre);
            TextView tvFechaNac= view.findViewById(R.id.tvFechaNac);

            Toast.makeText(MainActivity.this, tvNombre.getText().toString()+ " "
                    + tvFechaNac.getText().toString(), Toast.LENGTH_SHORT).show();
        }
    });
    }

    public void onClick(View view)
    {
        EditText etNombre= findViewById(R.id.etNombre);
        EditText etFechNac= findViewById(R.id.etFechaNac);
        EditText etSexo= findViewById(R.id.etSexo);
        EditText etDescripcion= findViewById(R.id.etDescripcion);

        personaList.add(new Persona(etNombre.getText().toString(),
                etFechNac.getText().toString(),
                etSexo.getText().toString(),etDescripcion.getText().toString()));
        adapPersona.notifyDataSetChanged();
//        //agregar al vector
//        nombreLista.add(etNombre.getText().toString());
//        //actualizar lista
//        adapter.notifyDataSetChanged();
//        etNombre.setText("");
    }

}






