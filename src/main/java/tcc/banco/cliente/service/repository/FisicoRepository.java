package tcc.banco.cliente.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tcc.banco.cliente.service.model.Fisico;

public interface FisicoRepository extends JpaRepository<Fisico, Integer>{
    
}
