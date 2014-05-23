package br.com.fiveware;

import java.util.List;

/**
 *
 * @author Acer
 */
public class BeanPessoa extends Pessoa{
    
public String getCadastro() throws Exception{
    DaoPessoa dao = new DaoPessoa();
    Pessoa pessoa = new Pessoa();
    
    pessoa.setCpf(this.getCpf());
    pessoa.setNome(this.getNome());
    pessoa.setIdade(this.getIdade());
    pessoa.setSexo(this.getSexo());
    
    return dao.incluirPessoa(pessoa);
}
    
    public List<Pessoa> getListaPessoa() throws Exception{
        DaoPessoa dao = new DaoPessoa();
//        Pessoa pessoa = new Pessoa();
//        pessoa.setCpf(this.getCpf());
        
        return dao.listarPessoa();
    }
}
