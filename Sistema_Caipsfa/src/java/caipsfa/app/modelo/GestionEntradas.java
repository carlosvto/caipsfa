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
public class GestionEntradas {
    ArrayList<Entradas> entradas;
    
    public ArrayList<Entradas> getAllEntradas(){
        SessionFactory sesFact = HibernateUtil.getSessionFactory();
        Session ses = sesFact.openSession();
        entradas = new ArrayList<Entradas>();
        String sql = "from Entradas";
        entradas = (ArrayList<Entradas>)ses.createQuery(sql).list();
        return entradas;
    }
    
}
