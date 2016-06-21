package com.tads.animalsfriends.modelo;

import com.orm.SugarRecord;

import java.util.Date;

/**
 * Created by jamila on 21/06/16.
 */
public class Adocao extends SugarRecord{
    private String nomeAnimal;
    private String cpf;
    private String descricao;
    private String nomeAnunciante;
    private String telefone;
    private String especie;
    private String sexo;
    private String peso;
    private Integer idade;
    private String pelagem;
    private String raca;
    private Boolean isCastrado;
    private String linkVideo;
    private Date dataCadastro;
    private String cidade;

    public Adocao() {
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeAnunciante() {
        return nomeAnunciante;
    }

    public void setNomeAnunciante(String nomeAnunciante) {
        this.nomeAnunciante = nomeAnunciante;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Boolean getCastrado() {
        return isCastrado;
    }

    public void setCastrado(Boolean castrado) {
        isCastrado = castrado;
    }

    public String getLinkVideo() {
        return linkVideo;
    }

    public void setLinkVideo(String linkVideo) {
        this.linkVideo = linkVideo;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
