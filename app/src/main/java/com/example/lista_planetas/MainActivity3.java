package com.example.lista_planetas;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    private ImageView planetas;
    private TextView descripcion;
    private ListView listView;  // Declarar ListView
    private int[] planetImages = {
            R.drawable.mercurio,
            R.drawable.venus,
            R.drawable.tierra,
            R.drawable.marte,
            R.drawable.jupiter,
            R.drawable.saturno,
            R.drawable.urano,
            R.drawable.neptuno
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        planetas = findViewById(R.id.planetas);
        descripcion = findViewById(R.id.descripcion);
        listView = findViewById(R.id.listview);

        // Obtener los nombres y descripciones de los planetas desde resources
        String[] planetNames = getResources().getStringArray(R.array.nombres);
        String[] planetDescriptions = getResources().getStringArray(R.array.planet_descriptions);

        // Crear un adaptador para el ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, planetNames);
        listView.setAdapter(adapter);

        // Manejar el evento de selección del ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                planetas.setImageResource(planetas [position]);
                descripcion.setText(planetDescriptions[position]);
            }
        });
    }
}
