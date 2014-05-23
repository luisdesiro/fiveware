<%-- 
    Document   : cadFilho
    Created on : 07/04/2014, 17:22:32
    Author     : Acer
--%>

<%@page import="br.com.fiveware.Pessoa"%>
<%@page import="java.util.List"%>
<%@page import="br.com.fiveware.DaoPessoa"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="estilo.css">
    </head>
    <body>
        <form action="cadFilhoJSTL.jsp" method="post">
            <table>
                <!--                <tr>
                                    <td><label form="cpf"> CPF Pai: </label></td>
                                    <td><input type="text" id="cpf" name="cpf" size="14" /></td>
                                </tr>-->

                <tr>
                    <td><label form="nome"> Nome: </label></td>
                    <td><input type="text" id="nome" name="nome" size="45" /></td>
                </tr>

                <tr>
                    <td><label form="idade"> Idade: </label></td>
                    <td><input type="text" id="idade" name="idade"
                               size="20" /></td>
                </tr>

                <tr>
                    <td><label for="sexo">Sexo </label></td>
                    <td><select name="sexo" id="sexo">
                            <option value="M">Maculino</option>
                            <option value="F">Feminino</option>
                        </select></td>
                </tr>

                <tr>
                    <td><label for="pai">Pai </label></td>
                    <td><select name="pai" id="pai">
                            <%
                                DaoPessoa dao = new DaoPessoa();
                                List<Pessoa> pessoas = dao.listarTodasPessoas() ;
                                for (Pessoa p : pessoas) {
                            %>
                            <option value="<%=p.getCpf()%>"><%= p.getNome()%></option>
                            <%}%>
                        </select></td>
                </tr>

                <tr>
                    <td colspan="2"><input type="submit" value="Salvar" /></td>
                </tr>


            </table>
        </form>

        </br>

        <a href='index.html'>Voltar</a>

    </body>
</html>
