package br.com.ada.locatecar.service;

import br.com.ada.locatecar.model.Cliente;
import br.com.ada.locatecar.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public void createCliente(Cliente cliente){
        this.clienteRepository.save(cliente);
    }

    public List<Cliente> listarTodos() {
        return this.clienteRepository.findAll();
    }

    public Optional<Cliente> buscarClientePorId(Long id) {
        return this.clienteRepository.findById(id);
    }

    public Optional<Cliente> buscarClientePorPlaca(String placa) {
        return this.clienteRepository.findByPlacaContaining(placa);
    }

    public void removerClientePorId(Long id) {
       this.clienteRepository.deleteById(id);
    }
}
