/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexoes;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
/**
 *
 * @author alexs
 */
public class HibernateUtil {
    
    private static StandardServiceRegistry registry;
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {//Uso do getSessionFactory, abrir uma conexão e deixar tudo configurado//
        //Criamos uma fabrica de seções, dentro dela temos o poder de criar seções, essas
        //seções fazem conexão com o banco.
        //ex. Abre uma seção pra dar um sql e dps fecha.
        //Conhecido com0:Abrir e fechar conexão com o banco.
        if (sessionFactory == null) {
            try {
                // Cria o registro
                //Para saber mais
                //https://docs.jboss.org/hibernate/orm/5.3/javadocs/org/hibernate/boot/registry/class-use/StandardServiceRegistry.html
                registry = new StandardServiceRegistryBuilder().configure().build();

                // Cria oMetadataSources
                //para saber mais
                //https://docs.jboss.org/hibernate/orm/5.3/javadocs/org/hibernate/boot/MetadataSources.html
                MetadataSources sources = new MetadataSources(registry);

                // Create Metadata
                //para saber mais
                //https://docs.jboss.org/hibernate/orm/5.3/javadocs/org/hibernate/boot/Metadata.html
                Metadata metadata = sources.getMetadataBuilder().build();

                // Create SessionFactory
                //para saber mais
                //https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/SessionFactory.html
                sessionFactory = metadata.getSessionFactoryBuilder().build();

            } catch (Exception e) {
                e.printStackTrace();
                if (registry != null) {
                    StandardServiceRegistryBuilder.destroy(registry);
                }
            }
        }
        return sessionFactory;
    }

    public static void fecharConexoes() {
        //Esse método da um close no SessionFactory.
        //Usado para fecharmos o programa sem deixar nada aberto.
        if (registry != null) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
    
}
