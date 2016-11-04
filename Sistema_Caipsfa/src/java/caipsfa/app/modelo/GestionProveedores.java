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
public class GestionProveedores {
    ArrayList<Proveedores> proveedores;
    
    public ArrayList<Proveedores> getAllProviders(){
        SessionFactory sesFact = HibernateUtil.getSessionFactory();
        Session ses = sesFact.openSession();
        proveedores = new ArrayList<Proveedores>();
        String sql = "from Proveedores";
        proveedores = (ArrayList<Proveedores>)ses.createQuery(sql).list();
        return proveedores;
    }
    
}
