/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author alexs
 */
@Entity(name="Estacionamento")
@Table(name="Estacionamento11")
public class Estacionamento {
    @Id
    @GeneratedValue
    @Column(name="id_car")
    private int idCarro;
    @Column(name="placa_car")
    private String placaCarro;
    @Column(name="cor_car")
     private String corCarro;
    @Column(name="nome_piloto")
    private String nomePiloto;

    public Estacionamento() {
    }

    public Estacionamento(String placaCarro, String corCarro, String nomePiloto) {
        this.placaCarro = placaCarro;
        this.corCarro = corCarro;
        this.nomePiloto = nomePiloto;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public String getCorCarro() {
        return corCarro;
    }

    public void setCorCarro(String corCarro) {
        this.corCarro = corCarro;
    }

    public String getNomePiloto() {
        return nomePiloto;
    }

    public void setNomePiloto(String nomePiloto) {
        this.nomePiloto = nomePiloto;
    }

    
    @Override
    public String toString() {
        return "Estacionamento{" + "placaCarro=" + placaCarro + ", corCarro=" + corCarro + ", nomePiloto=" + nomePiloto + '}';
    }

   
    
}
