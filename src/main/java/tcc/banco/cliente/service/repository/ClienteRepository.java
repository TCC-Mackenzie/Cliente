package tcc.banco.cliente.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tcc.banco.cliente.service.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    
}
