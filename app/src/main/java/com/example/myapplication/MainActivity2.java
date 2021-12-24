package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity
    implements AdapterView.OnItemSelectedListener{

    TextView txtItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        final String[] datos =
        new String[]{"Elem1","Elem2","Elem3","Elem4","Elem5"};
        ArrayAdapter<String> adaptador =
        new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, datos);

        Spinner cmbOpciones = (Spinner)findViewById(R.id.cmbOpciones);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cmbOpciones.setAdapter(adaptador);

        cmbOpciones.setOnItemSelectedListener(this);
        txtItem = (TextView)findViewById(R.id.txtElemento);

        //List View
        ArrayAdapter<String> adaptador2 =
        new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, datos);

        ListView lstOpciones = (ListView)findViewById(R.id.lstLista);
        lstOpciones.setAdapter(adaptador2);




    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {

        txtItem.setText("Seleccionado: " +parent.getItemAtPosition(position));

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        txtItem.setText("Seleccionado nada ");

    }
}