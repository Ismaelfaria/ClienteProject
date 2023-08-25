/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.HibernateUtil;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import model.Cliente;


import org.hibernate.HibernateError;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


/**
 *
 * @author alexs
 */
public class ClienteDAO {
    
    public int salvarClienteDAO(Cliente pCliente){
       
        Session session = null;
        Integer IdClienteInserido = 0;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
         
        try{
            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            IdClienteInserido = (Integer) session.save(pCliente);
            
            transaction.commit();
        }catch(HibernateException e){
            e.printStackTrace();
        }finally{
            if(session != null){
                session.close();
            }
        }
        
        
        return IdClienteInserido;
    }
    
    public List<Cliente> getTodosClientesDAO(){
        
        List<Cliente> listaClientes = null;       
        Session session = null;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        
        try{           
            session = sessionFactory.openSession();
            CriteriaBuilder buider = session.getCriteriaBuilder();
            CriteriaQuery<Cliente> criteriaQuery = buider.createQuery(Cliente.class); 
            criteriaQuery.from(Cliente.class);
            listaClientes = session.createQuery(criteriaQuery).getResultList();
            
        }catch(HibernateError e){
            e.printStackTrace();
        }finally{
            if(session!= null){
                session.close();
            }
        }
        return listaClientes;  
    }
}
