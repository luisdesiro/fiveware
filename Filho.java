/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fiveware;

/**
 *
 * @author Acer
 */
public class Filho extends Pessoa{
    
    protected int idPai;
//    protected String nome;
    protected int idFilho;
    protected String nomePai;
//    protected int idade;
//    protected String sexo;

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public int getIdPai() {
        return idPai;
    }

    public void setIdPai(int idPai) {
        this.idPai = idPai;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdFilho() {
        return idFilho;
    }

    public void setIdFilho(int idFilho) {
        this.idFilho = idFilho;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
}
