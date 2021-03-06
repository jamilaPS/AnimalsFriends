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

import com.tads.animalsfriends.R;
import com.tads.animalsfriends.adapter.AdapterAdocao;
import com.tads.animalsfriends.modelo.Adocao;

import java.util.List;

public class ListaAdocao extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private AdapterAdocao adapterAdocao;
    private ListView listAdocao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_adocao);
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

        listAdocao = (ListView) findViewById(R.id.listAdocao);
        preencherListView();
        listAdocao.setOnItemClickListener(this);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        preencherListView();
    }

    private void preencherListView(){
        adapterAdocao = new AdapterAdocao(this, getListaAdocao());
        listAdocao.setAdapter(adapterAdocao);
    }

    private List<Adocao> getListaAdocao(){
        List<Adocao> la = Adocao.listAll(Adocao.class);
        return la;
    }

    public void chamarCadastro(View view){
        Intent intent = new Intent(getApplicationContext(), FormularioAdocao.class);
        startActivity(intent);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Long idAdocao = adapterAdocao.getItemId(position);
        Bundle bundle = new Bundle();
        bundle.putLong("idAdocao", idAdocao);

        Intent intent = new Intent(getApplicationContext(), FormularioAdocao.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
