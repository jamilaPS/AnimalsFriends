package com.tads.animalsfriends.modelo;

import com.orm.SugarRecord;

/**
 * Created by jamila on 21/06/16.
 */
public class MausTratos extends SugarRecord{
    private String descricao;
    private String telefone;
    private String cidade;
    private String latitude;
    private String longitude;

    public MausTratos() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
