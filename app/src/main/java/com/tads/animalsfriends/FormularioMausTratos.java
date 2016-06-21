package com.tads.animalsfriends;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.tads.animalsfriends.modelo.MausTratos;

public class FormularioMausTratos extends AppCompatActivity {
    MausTratos mausTratos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_maus_tratos);
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

        if(getIntent().hasExtra("idMausTratos")){
            Bundle bundle = getIntent().getExtras();
            Long id = bundle.getLong("idMausTratos");
            mausTratos = (MausTratos) MausTratos.findById(MausTratos.class, id);
            preencherFormulario();
        }

    }

    private void preencherFormulario(){
        EditText cidade = ((EditText) findViewById(R.id.et_cidade));
        cidade.setText(mausTratos.getCidade());
        EditText descricao = ((EditText) findViewById(R.id.et_descricao));
        descricao.setText(mausTratos.getDescricao());
        EditText telefone = ((EditText) findViewById(R.id.et_telefone));
        telefone.setText(mausTratos.getTelefone());
        EditText latitude = ((EditText) findViewById(R.id.et_latitude));
        latitude.setText(mausTratos.getLatitude());
        EditText longitude = ((EditText) findViewById(R.id.et_longitude));
        longitude.setText(mausTratos.getLongitude());

        Button bt = (Button) findViewById(R.id.bt_excluir);
        bt.setEnabled(true);
    }

    public void salvar(View view){
        mausTratos = new MausTratos();

        mausTratos = new MausTratos();
        mausTratos.setCidade(((EditText) findViewById(R.id.et_cidade)).getText().toString());
        mausTratos.setDescricao(((EditText) findViewById(R.id.et_descricao)).getText().toString());
        mausTratos.setTelefone(((EditText) findViewById(R.id.et_telefone)).getText().toString());
        mausTratos.setLatitude(((EditText) findViewById(R.id.et_latitude)).getText().toString());
        mausTratos.setLongitude(((EditText) findViewById(R.id.et_longitude)).getText().toString());

        mausTratos.save();
        finish();
    }

    public void cancelar(View view){

        finish();
    }

    public void excluir(View view){
        mausTratos.delete();
        finish();
    }

}
