/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caipsfa.app.modelo;

import caipsfa.app.bean.*;
import java.util.ArrayList;
import caipsfa.db.hibernate.*;
import caipsfa.app.form.*;
import caipsfa.db.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Familia
 */
public class GestionProductos {
    ArrayList<Productos> productos;
    
    public ArrayList<Productos> getAllProductos(){
        SessionFactory sesFact = HibernateUtil.getSessionFactory();
        Session ses = sesFact.openSession();
        productos= new ArrayList<Productos>();
        String sql = "from Productos";
        productos = (ArrayList<Productos>)ses.createQuery(sql).list();
        return productos;
    }
    
}
