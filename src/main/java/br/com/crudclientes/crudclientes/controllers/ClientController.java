package br.com.crudclientes.crudclientes.controllers;

import br.com.crudclientes.crudclientes.dto.ClientDTO;
import br.com.crudclientes.crudclientes.entities.Client;
import br.com.crudclientes.crudclientes.repositories.ClientRepository;
import br.com.crudclientes.crudclientes.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {
    @Autowired
    private ClientService service;
    @GetMapping(value = "/{id}")
    public ClientDTO findById(@PathVariable Long id){
        return service.findById(id);
    }
}
