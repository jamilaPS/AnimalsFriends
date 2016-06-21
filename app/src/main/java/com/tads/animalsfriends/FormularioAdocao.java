package com.tads.animalsfriends;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.tads.animalsfriends.R;
import com.tads.animalsfriends.modelo.Adocao;

import java.util.Date;

public class FormularioAdocao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_adocao);
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

    }

    public void salvar(View view){
        Adocao adocao = new Adocao();

        RadioButton sim = (RadioButton) findViewById(R.id.sim);
        adocao.setCastrado(sim.isChecked());
        adocao.setCidade(((EditText) findViewById(R.id.et_cidade)).getText().toString());
        adocao.setCpf(((EditText) findViewById(R.id.et_cpf)).getText().toString());
        adocao.setDataCadastro(new Date());
        adocao.setDescricao(((EditText) findViewById(R.id.et_descricao)).getText().toString());
        adocao.setEspecie(((EditText) findViewById(R.id.et_especie)).getText().toString());
        adocao.setIdade(Integer.parseInt(((EditText) findViewById(R.id.et_idade)).getText().toString()));
        adocao.setLinkVideo(((EditText) findViewById(R.id.et_linkVideo)).getText().toString());
        adocao.setNomeAnimal(((EditText) findViewById(R.id.et_nomeAnimal)).getText().toString());
        adocao.setNomeAnunciante(((EditText) findViewById(R.id.et_nomeAnunciante)).getText().toString());
        adocao.setPelagem(((EditText) findViewById(R.id.et_pelagem)).getText().toString());
        adocao.setPeso(((EditText) findViewById(R.id.et_peso)).getText().toString());
        adocao.setRaca(((EditText) findViewById(R.id.et_raca)).getText().toString());

        RadioButton macho = (RadioButton) findViewById(R.id.macho);
        if(macho.isChecked()){
            adocao.setSexo("M");
        }
        else{
            adocao.setSexo("F");
        }
        adocao.setTelefone(((EditText) findViewById(R.id.et_telefone)).getText().toString());
        adocao.save();
        finish();
    }

    public void cancelar(View view){
        finish();
    }

}
