/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiveware;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class DaoPessoa extends Dao {
    
    public ResultSet res = null;  
    private Pessoa pessoa;
    private Filho filho;

    public DaoPessoa() {
    }
    
    public DaoPessoa(Pessoa pessoa) {
        pessoa = new Pessoa();
//        filho = new Filho();
    }

    public List<Pessoa> listarPessoa() throws Exception {
        List<Pessoa> pessoa = new ArrayList<>();

        try {
            abreConexao();
//             st = cn.prepareStatement("SELECT * FROM PESSOA ");
            st = cn.prepareStatement("SELECT P.NOME, P.CPF, P.IDADE, P.SEXO, COUNT(IDFILHO) "
                    + " FROM PESSOA P, FILHO F "
                    + "WHERE F.PESSOA_CPF = P.CPF "
                    + "GROUP BY P.NOME");
            rs = st.executeQuery();

            while (rs.next()) {
                Pessoa pe = new Pessoa();

                pe.setNome(rs.getString("P.NOME"));
                pe.setCpf(rs.getInt("P.CPF"));
                pe.setIdade(rs.getInt("P.IDADE"));
                pe.setSexo(rs.getString("P.SEXO"));
                pe.setQntdFilho(rs.getInt("COUNT(IDFILHO)"));

                pessoa.add(pe);
            }
        } catch (Exception e) {
            throw e;
        } finally
            {
                fechaConexao();
            }
            return pessoa;
        }
    
    public List<Pessoa> listarTodasPessoas() throws Exception {
        List<Pessoa> pessoa = new ArrayList<>();

        try {
            abreConexao();
//             st = cn.prepareStatement("SELECT * FROM PESSOA ");
            st = cn.prepareStatement("SELECT * FROM PESSOA");
            rs = st.executeQuery();

            while (rs.next()) {
                Pessoa pe = new Pessoa();

                pe.setNome(rs.getString("NOME"));
                pe.setCpf(rs.getInt("CPF"));
                pe.setIdade(rs.getInt("IDADE"));
                pe.setSexo(rs.getString("SEXO"));

                pessoa.add(pe);
            }
        } catch (Exception e) {
            throw e;
        } finally
            {
                fechaConexao();
            }
            return pessoa;
        }
    
    public String incluirPessoa(Pessoa pessoa)throws Exception{
        String result = "Pessoa incluída com sucesso!";
        
        try{
            abreConexao();
            
            st = cn.prepareStatement("INSERT INTO PESSOA (CPF, NOME, SEXO, IDADE) VALUES(?,?,?,?)");
            st.setInt(1, pessoa.getCpf());
            st.setString(2, pessoa.getNome());
            st.setString(3, pessoa.getSexo());
            st.setInt(4, pessoa.getIdade());
            
            st.executeUpdate();
        }catch(Exception e){
            result = e.getMessage();
            throw e;
        }finally{
            fechaConexao();
        }
        return result;
    }
    
    public ResultSet getResultado() {  
      return res;  
   }
    
    }
