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
@Entity(name="Cliente")
@Table(name="tbl_clientes")
public class Cliente {
    
    @Id
    @GeneratedValue
    @Column(name="id_Cliente")
    private int IdCliente;
    @Column(name="nome")
     private String nome;
    @Column(name="endereco")
    private String endereco;

    public Cliente() {
    }


    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" + "IdCliente=" + IdCliente + ", nome=" + nome + ", endereco=" + endereco + '}';
    }
    
    
}
