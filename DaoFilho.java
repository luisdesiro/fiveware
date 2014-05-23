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
public class DaoFilho extends Dao {

    public ResultSet res = null;

    private Filho filho;

    public DaoFilho() {
    }

    public DaoFilho(Filho filho) {
        filho = new Filho();
//        filho = new Filho();
    }

    public List<Filho> listarFilho() throws Exception {
        List<Filho> filho = new ArrayList<>();

        try {
            abreConexao();
            st = cn.prepareStatement("select f.nome, f.sexo, f.idade, p.nome "
                    + "from filho f, pessoa p "
                    + "where p.cpf = pessoa_cpf");
            rs = st.executeQuery();

            while (rs.next()) {
                Filho pe = new Filho();

                pe.setNome(rs.getString("F.NOME"));
                pe.setNomePai(rs.getString("p.nome"));
//                pe.setIdPai(rs.getInt("Pessoa_CPF"));
                pe.setIdade(rs.getInt("F.IDADE"));
                pe.setSexo(rs.getString("F.SEXO"));

                filho.add(pe);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            fechaConexao();
        }
        return filho;
    }

    public String incluirFilho(Filho filho) throws Exception {
        String result = "Filho incluído com sucesso!";

        try {
            abreConexao();

            st = cn.prepareStatement("INSERT INTO FILHO (PESSOA_CPF, NOME, SEXO, IDADE) VALUES(?,?,?,?)");
            st.setInt(1, filho.getIdPai());
            st.setString(2, filho.getNome());
            st.setString(3, filho.getSexo());
            st.setInt(4, filho.getIdade());

            st.executeUpdate();
        } catch (Exception e) {
            result = e.getMessage();
            throw e;
        } finally {
            fechaConexao();
        }
        return result;
    }

    public ResultSet getResultado() {
        return res;
    }

}
