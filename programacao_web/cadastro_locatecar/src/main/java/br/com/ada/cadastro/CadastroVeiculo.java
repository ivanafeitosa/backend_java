package br.com.ada.cadastro;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/cadastro")
public class CadastroVeiculo extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String model = req.getParameter("model");
        String license = req.getParameter("license");
        String name = req.getParameter("name");
        String cpf = req.getParameter("cpf");

        if(model.equals("") || license.equals("") || name.equals("") || cpf.equals("")) {
            resp.setContentType("text/html");
            resp.getWriter().println("<h3>Preencha todos os dados do veículo corretamente!!</h3>");
        } else {
            //setando como atributo para ser passada para a outra aba jsp
            req.setAttribute("model", model);
            req.setAttribute("license", license);
            req.setAttribute("name", name);
            req.setAttribute("cpf", cpf);

            //redirecionando os dados recebidos na requisição no forms (index.jsp) e passando para a aba resumo (data.jsp)
            RequestDispatcher rd = req.getRequestDispatcher("data.jsp");

            rd.forward(req, resp);

        }
    }
}
