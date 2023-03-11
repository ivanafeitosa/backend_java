package br.com.ada.locatecar.controller;


import br.com.ada.locatecar.model.Cliente;
import br.com.ada.locatecar.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/clientes")
    public String clientes(Model model) {
        List<Cliente> clientes = this.clienteService.listarTodos();
        model.addAttribute("clientes", clientes);
        return "clientes";
    }

    @GetMapping("/cliente/add")
    public String addCliente(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "cliente-add";
    }

    @PostMapping("/cliente/add")
    public String criarCliente(@ModelAttribute("cliente") Cliente cliente) {
        this.clienteService.createCliente(cliente);
        return "redirect:/clientes";
    }

    @GetMapping("/cliente/{clienteId}/delete")
    public String deletarCliente(@PathVariable("clienteId") Long clienteId) {
        this.clienteService.removerClientePorId(clienteId);
        return "redirect:/clientes";

    }



}
