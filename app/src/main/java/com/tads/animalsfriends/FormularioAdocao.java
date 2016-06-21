package com.tads.animalsfriends;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.tads.animalsfriends.R;
import com.tads.animalsfriends.modelo.Adocao;

import java.util.Date;

public class FormularioAdocao extends AppCompatActivity {
    Adocao adocao = new Adocao();

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

        if(getIntent().hasExtra("idAdocao")){
            Bundle bundle = getIntent().getExtras();
            Long id = bundle.getLong("idAdocao");
            adocao = (Adocao) Adocao.findById(Adocao.class, id);
            preencherFormulario();
        }

    }

    private void preencherFormulario(){
        EditText cidade = ((EditText) findViewById(R.id.et_cidade));
        cidade.setText(adocao.getCidade());
        EditText cpf = ((EditText) findViewById(R.id.et_cpf));
        cpf.setText(adocao.getCpf());
        EditText descricao = ((EditText) findViewById(R.id.et_descricao));
        descricao.setText(adocao.getDescricao());
        EditText especie = ((EditText) findViewById(R.id.et_especie));
        especie.setText(adocao.getEspecie());
        EditText idade = ((EditText) findViewById(R.id.et_idade));
        idade.setText(adocao.getIdade().toString());
        EditText linkVideo = ((EditText) findViewById(R.id.et_linkVideo));
        linkVideo.setText(adocao.getLinkVideo());
        EditText nomeAnimal = ((EditText) findViewById(R.id.et_nomeAnimal));
        nomeAnimal.setText(adocao.getNomeAnimal());
        EditText nomeAnunciante = ((EditText) findViewById(R.id.et_nomeAnunciante));
        nomeAnunciante.setText(adocao.getNomeAnunciante());
        EditText pelagem = ((EditText) findViewById(R.id.et_pelagem));
        pelagem.setText(adocao.getPelagem());
        EditText peso = ((EditText) findViewById(R.id.et_peso));
        peso.setText(adocao.getPeso());
        EditText raca = ((EditText) findViewById(R.id.et_raca));
        raca.setText(adocao.getRaca());
        EditText telefone = ((EditText) findViewById(R.id.et_telefone));
        telefone.setText(adocao.getTelefone());
        if(adocao.getCastrado()){
            RadioButton sim = (RadioButton) findViewById(R.id.sim);
            sim.setChecked(true);
        }
        else{
            RadioButton nao = (RadioButton) findViewById(R.id.nao);
            nao.setChecked(true);
        }
        if(adocao.getSexo().equals("F")){
            RadioButton femea = (RadioButton) findViewById(R.id.femea);
            femea.setChecked(true);
        }
        else{
            RadioButton macho = (RadioButton) findViewById(R.id.macho);
            macho.setChecked(true);
        }

        Button bt = (Button) findViewById(R.id.bt_excluir);
        bt.setEnabled(true);
    }

    public void salvar(View view){

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

    public void excluir(View view){
        adocao.delete();
        finish();
    }

}
