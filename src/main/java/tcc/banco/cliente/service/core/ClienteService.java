package tcc.banco.cliente.service.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tcc.banco.cliente.service.model.Cliente;
import tcc.banco.cliente.service.repository.ClienteRepository;

@Service
public class ClienteService {
    static final Logger logger = LoggerFactory.getLogger(ClienteService.class);
    private ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public void create(Cliente cliente) {
        try {
            clienteRepository.save(cliente);
        } catch (Exception e) {
            logger.error("Erro ao criar conta para {} em {}/{}", cliente.getNome());
        }
    }
}
