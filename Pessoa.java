
package br.com.fiveware;

/**
 *
 * @author Acer
 */
public class Pessoa {
    
    protected String nome;
    protected int cpf;
    protected int idade;
    protected String sexo;
    protected int qntdFilho;

    public int getQntdFilho() {
        return qntdFilho;
    }

    public void setQntdFilho(int qntdFilho) {
        this.qntdFilho = qntdFilho;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
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
