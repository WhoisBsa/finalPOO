/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.*;

/**
 *
 * @author robsonresende
 */
public class ClienteController {
    Cliente c;
    
    public ClienteController() {
        c = new Cliente();
    }
    public ClienteController(Cliente c) {
        this.c = c;
    }
    public ClienteController(String nome, String idade, String cpf) {
        c = new Cliente(nome, idade, cpf);
    }
    
    public void salvar() {
        DAOCliente dc = new DAOCliente();
        dc.salvar(c);
    }
}
