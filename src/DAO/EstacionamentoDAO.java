/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.HibernateUtil;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import model.Estacionamento;
import org.hibernate.HibernateError;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author alexs
 */
public class EstacionamentoDAO {
    
    public int salvarEstacionamentoDAO(Estacionamento pEstacionamento){
       
        Session session = null;
        Integer IdCarroInserido = 0;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
         
        try{
            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            IdCarroInserido = (Integer) session.save(pEstacionamento);
            
            transaction.commit();
        }catch(HibernateException e){
            e.printStackTrace();
        }finally{
            if(session != null){
                session.close();
            }
        }
        
        
        return IdCarroInserido;
    }
    
    public List<Estacionamento> getTodosEstacionamentoDAO(){
        
        List<Estacionamento> listaEstacionamentos = null;
        
        Session session = null;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        
        try{
            
            session = sessionFactory.openSession();
            CriteriaBuilder buider = session.getCriteriaBuilder();
            
            CriteriaQuery<Estacionamento> criteriaQuery = buider.createQuery(Estacionamento.class);
            
            criteriaQuery.from(Estacionamento.class);
            
            listaEstacionamentos = session.createQuery(criteriaQuery).getResultList();
            
        }catch(HibernateError e){
            e.printStackTrace();
 
        }finally{
            if(session!= null){
                session.close();
            }
        }
        
        return listaEstacionamentos;
        
    }
}
