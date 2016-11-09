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
    
    public ArrayList<Proveedores> geOne(String codigoProveedores){
        SessionFactory sesFact = HibernateUtil.getSessionFactory();
        Session ses = sesFact.openSession();
        proveedores = new ArrayList<Proveedores>();
        String sql = "from Proveedores where codigoProveedor = '"+ codigoProveedores +"'";
        proveedores = (ArrayList<Proveedores>)ses.createQuery(sql).list();
        return proveedores;
    }
    
    public boolean addProvider(ProveedoresForm provs){
        boolean estado = false;
        try{
            SessionFactory sesFact = HibernateUtil.getSessionFactory();
            Session ses = sesFact.openSession();
            Transaction trans =  ses.beginTransaction();
            Proveedores providers = new Proveedores();
            providers.setCodigoProveedor(Integer.parseInt(provs.getCodigoProveedor()));
            providers.setNombreProveedor(provs.getNombreProveedor());
            providers.setDireccion(provs.getDireccion());
            providers.setContacto(provs.getContacto());
            providers.setNumeroTelefono(provs.getNumeroTelefono());
            ses.save(providers);
            trans.commit();
            ses.close();
            estado = true;
            return estado;
        }
        catch(Exception e){
            System.out.println(e);
            return estado;
        }
    }
    
    public boolean editProvider(ProveedoresForm provs){
        boolean estado = false;
        try{
            SessionFactory sesFact = HibernateUtil.getSessionFactory();
            Session ses = sesFact.openSession();
            Transaction trans =  ses.beginTransaction();
            Proveedores providers = new Proveedores();
            providers.setCodigoProveedor(Integer.parseInt(provs.getCodigoProveedor()));
            providers.setNombreProveedor(provs.getNombreProveedor());
            providers.setDireccion(provs.getDireccion());
            providers.setContacto(provs.getContacto());
            providers.setNumeroTelefono(provs.getNumeroTelefono());
            ses.update(providers);
            trans.commit();
            ses.close();
            estado = true;
            return estado;
        }
        catch(Exception e){
            System.out.println(e);
            return estado;
        }
    }
    
    public boolean deleteProvider(int id){
        boolean estado = false;
        try{
            SessionFactory sesFact = HibernateUtil.getSessionFactory();
            Session ses = sesFact.openSession();
            Transaction trans =  ses.beginTransaction();
            Proveedores providers = (Proveedores)ses.get(Proveedores.class, id);
            ses.delete(providers);
            trans.commit();
            ses.close();
            estado = true;
            return estado;
        }
        catch(Exception e){
            System.out.println(e);
            return estado;
        }
    }
    
}
