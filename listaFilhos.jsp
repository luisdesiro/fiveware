<%-- 
    Document   : listaPessoas
    Created on : 07/04/2014, 13:08:20
    Author     : Acer
--%>

<%@page import="br.com.fiveware.DaoFilho"%>
<%@page import="br.com.fiveware.Filho"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<jsp:useBean id="con" class="br.com.fiveware.DaoPessoa"/>--%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Filhos</title>
        <link rel="stylesheet" type="text/css" href="estilo.css">
    </head>
    <body>
        <h1>Lista de Pessoas</h1>
        <%@ page import="br.com.fiveware.DaoPessoa" %>  
        <%@ page import="br.com.fiveware.Pessoa" %> 
        <%@ page import="java.util.ArrayList" %>  
        <%@ page import="java.util.Iterator" %>  


        <p><strong>Tabela Pessoa </strong></p>  
        <table border=1 cellspacing=0 cellpadding=0 >  

            <tr>  
                <td width=200><strong>  
                        ID  
                    </strong></td>      
                <td width=50><strong>  
                        Nome  
                    </strong></td>      
                <td width=30><strong>  
                        CPF  
                    </strong></td>  
                <td width=30><strong>  
                        Telefone  
                    </strong></td> 
                <td width=30><strong>  
                        Email  
                    </strong></td> <td width=30><strong>  
                        Sexo  
                    </strong></td> <td width=30><strong>  
                        Data de Nascimento  
                    </strong></td> <td width=30><strong>  
                        Nacionalidade  
                    </strong></td> <td width=30><strong>  
                        Etnia  
                    </strong></td> <td width=30><strong>  
                        Tipo Sanguíneo  
                    </strong></td> <td width=30><strong>  
                        Escola de Origem  
                    </strong></td> <td width=30><strong>  
                        Série  
                    </strong></td> <td width=30><strong>  
                        Responsável  
                    </strong></td> 
                <td width=30><strong>  
                        País  
                    </strong></td> 
                <td width=30><strong>  
                        Estado  
                    </strong></td> 
                <td width=30><strong>  
                        Cidade  
                    </strong></td>  
                <td width=30><strong>  
                        CEP  
                    </strong></td>  
                <td width=30><strong>  
                        Bairro  
                    </strong></td> 
                <td width=30><strong>  
                        Logradouro  
                    </strong></td>  
                <td width=30><strong>  
                        Número  
                    </strong></td>  

            </tr>  


            <%
                DaoPessoa dao = new DaoPessoa();
                DaoFilho daoF = new DaoFilho();
                List<Pessoa> pessoas = dao.listarPessoa();
                List<Filho> filhos = daoF.listarFilho();
                //List<Livros> livros = new DaoLivros(null).listaLivros();
                for (Filho f : filhos) {
            %>

            <tr>
                <td><%= f.getNomePai()%></td> 
                <td><%=f.getNome()%></td>
                <td><%=f.getIdade()%></td>
                <td><%=f.getSexo()%></td>
            </tr>
            <%
                }
            %>




        </table>  
        </br>

        <a href='index.html'>Voltar</a>
    </body>
</html>
