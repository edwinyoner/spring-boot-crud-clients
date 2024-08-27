package com.visionary.crud_cliente.service;

import com.visionary.crud_cliente.model.Client;
import com.visionary.crud_cliente.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> obtenerTodosLosClientes(){
        return clientRepository.findAll();
    }

    public Optional<Client> obtenerClientById(Long id){
        return clientRepository.findById(id);
    }

    public Client guardarClient(Client client){
        return clientRepository.save(client);
    }

    public void eliminarClient(Long id){
        clientRepository.deleteById(id);
    }
}