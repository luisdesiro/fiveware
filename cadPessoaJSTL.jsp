<%@page import="br.com.fiveware.Pessoa"%>
<%@page import="br.com.fiveware.DaoPessoa"%>
<%
           DaoPessoa dao = new DaoPessoa();
           Pessoa pessoa = new Pessoa();
//           String cpf = (String)request.getParameter("cpf");
           int cpf = Integer.parseInt((String)request.getParameter("cpf"));
           int idade = Integer.parseInt((String)request.getParameter("idade"));
                      
           pessoa.setCpf(cpf);
           pessoa.setIdade(idade);
           pessoa.setNome((String)request.getParameter("nome"));
           pessoa.setSexo((String)request.getParameter("sexo"));
           
           dao.incluirPessoa(pessoa);
           response.sendRedirect("http://localhost:8080/FiveWare/cadastroPessoa.jsp");
           
       %>
