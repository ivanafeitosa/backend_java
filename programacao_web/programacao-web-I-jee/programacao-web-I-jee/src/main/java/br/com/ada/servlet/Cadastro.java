package br.com.ada.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/cadastro")
public class Cadastro extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //pegando as infos passadas no forms
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        String address = req.getParameter("address");

        //validação para que não submeta o forms vazio
        if(name.equals("") || age.equals("") || address.equals("")) {
            resp.setContentType("text/html");
            resp.getWriter().println("<h3>Dados obrigatórios não preenchidos</h3>");
        } else {
            //setando como atributo para ser passada para a outra aba jsp
            req.setAttribute("name", name);
            req.setAttribute("age", age);
            req.setAttribute("address", address);

            //redirecionando os dados recebidos na requisição no forms (index.jsp) e passando para a aba resumo (data.jsp)
            RequestDispatcher rd = req.getRequestDispatcher("data.jsp");

            rd.forward(req, resp);

        }

    }
}
