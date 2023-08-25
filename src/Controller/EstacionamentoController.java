/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.EstacionamentoDAO;
import java.util.List;
import model.Estacionamento;

/**
 *
 * @author alexs
 */
public class EstacionamentoController {
     private final EstacionamentoDAO ESTACIONAMENTO_DAO = new EstacionamentoDAO();
    
    public int salvarEstacionamentoController(Estacionamento pEstacionamento){
        return this.ESTACIONAMENTO_DAO.salvarEstacionamentoDAO(pEstacionamento);
     }  
        public List<Estacionamento> getTodosEstacionamentoController(){
        return this.ESTACIONAMENTO_DAO.getTodosEstacionamentoDAO();
    }
}
