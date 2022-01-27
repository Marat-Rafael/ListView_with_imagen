package com.example.fancywithlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    private TextView selection;
    ListView listView ;
    private static final String[] items = {"Madrid",
            "Palma de Mallorca", "Barcelona","Valencia",  "Valladolid", "Leon", "Burgos",
            "Ciudad Real", "Gijon","Sevilla","Alicante", "Malaga", "Murcia", "Cadiz", "Asturias","Zaragoza","Santiago"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        selection = findViewById(R.id.tv_mostrar_elemento);

        ArrayAdapter adapterConImagen = new ArrayAdapter<>(
                this, // context
                R.layout.list_row, // de donde coje el formato
                R.id.textview_item, // donde colocar datos del array
                items); // el array

        listView.setAdapter(adapterConImagen);
        // añadimos onClickItemListener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                selection.setText(items[i]);
            }
        });
    }


}