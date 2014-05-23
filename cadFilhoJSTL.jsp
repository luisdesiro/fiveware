<%@page import="br.com.fiveware.Filho"%>
<%@page import="br.com.fiveware.DaoFilho"%>
<%
           DaoFilho dao = new DaoFilho();
           Filho filho = new Filho();
//           String cpf = (String)request.getParameter("cpf");
           int cpf = Integer.parseInt((String)request.getParameter("pai"));
           int idade = Integer.parseInt((String)request.getParameter("idade"));
                      
           filho.setIdPai(cpf);
           filho.setIdade(idade);
           filho.setNome((String)request.getParameter("nome"));
           filho.setSexo((String)request.getParameter("sexo"));
           
           dao.incluirFilho(filho);
           response.sendRedirect("http://localhost:8080/FiveWare/cadastroFilho.jsp");
           
       %>
