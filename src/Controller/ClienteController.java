/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.ClienteDAO;
import java.util.List;
import model.Cliente;



/**
 *
 * @author alexs
 */
public class ClienteController {
    
    private final ClienteDAO CLIENTE_DAO = new ClienteDAO();
    
    public int salvarClienteController(Cliente pCliente){
        return this.CLIENTE_DAO.salvarClienteDAO(pCliente);
}
    public List<Cliente> getTodosClientesController(){
        return this.CLIENTE_DAO.getTodosClientesDAO();
    }
    
}
