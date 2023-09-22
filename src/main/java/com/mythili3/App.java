package com.mythili3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mythili3.model.Cart;
import com.mythili3.model.Products;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        
        try 
        {
        session.beginTransaction();
        Cart c1=new Cart();
        c1.setName("oil");
        
        Cart c2=new Cart();
        c2.setName("choclates");
        
        Products pp1=new Products();
        pp1.setName("books");
        
        Products pp2=new Products();
        pp2.setName("soaps");
        
       c1.getProducts().add(pp1);
       c1.getProducts().add(pp2);
       c2.getProducts().add(pp1);
        
        session.save(c1);
        session.save(c2);
        session.save(pp1);
        session.save(pp2);
        session.getTransaction().commit();
        }
        finally 
        {
        	session.close();
        	sessionFactory.close();
        }    

    }

    }

