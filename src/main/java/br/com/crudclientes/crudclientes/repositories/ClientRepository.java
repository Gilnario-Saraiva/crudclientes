package br.com.crudclientes.crudclientes.repositories;

import br.com.crudclientes.crudclientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
