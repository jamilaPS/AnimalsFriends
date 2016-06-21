package com.tads.animalsfriends;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.tads.animalsfriends.adapter.AdapterMausTratos;
import com.tads.animalsfriends.modelo.MausTratos;

import java.util.List;

public class ListaMausTratos extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private AdapterMausTratos adapterMausTratos;
    private ListView listMausTratos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_maus_tratos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        listMausTratos = (ListView) findViewById(R.id.listMausTratos);
        preencherListView();
        listMausTratos.setOnItemClickListener(this);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        preencherListView();
    }

    private void preencherListView(){
        adapterMausTratos = new AdapterMausTratos(this, getListaMausTratos());
        listMausTratos.setAdapter(adapterMausTratos);
    }

    private List<MausTratos> getListaMausTratos(){
        List<MausTratos> la = MausTratos.listAll(MausTratos.class);
        return la;
    }

    public void chamarCadastro(View view){
        Intent intent = new Intent(getApplicationContext(), FormularioMausTratos.class);
        startActivity(intent);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Long idMausTratos = adapterMausTratos.getItemId(position);
        Bundle bundle = new Bundle();
        bundle.putLong("idMausTratos", idMausTratos);

        Intent intent = new Intent(getApplicationContext(), FormularioMausTratos.class);
        intent.putExtras(bundle);
        startActivity(intent);

    }
}
