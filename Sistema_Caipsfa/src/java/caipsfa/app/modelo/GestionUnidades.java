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
public class GestionUnidades {
    ArrayList<Unidades> unidades;
    
    public ArrayList<Unidades> getAllUnidades(){
        SessionFactory sesFact = HibernateUtil.getSessionFactory();
        Session ses = sesFact.openSession();
        unidades = new ArrayList<Unidades>();
        String sql = "from Unidades";
        unidades = (ArrayList<Unidades>)ses.createQuery(sql).list();
        return unidades;
    }
    
    public ArrayList<Unidades> geOne(String codigoUnidad){
        SessionFactory sesFact = HibernateUtil.getSessionFactory();
        Session ses = sesFact.openSession();
        unidades = new ArrayList<Unidades>();
        String sql = "from Unidades where codigoUnidad = '"+  codigoUnidad +"'";
        unidades = (ArrayList<Unidades>)ses.createQuery(sql).list();
        return unidades;
    }
    
    public boolean addUnit(UnidadesForm unidad){
        boolean estado = false;
        try{
            SessionFactory sesFact = HibernateUtil.getSessionFactory();
            Session ses = sesFact.openSession();
            Transaction trans =  ses.beginTransaction();
            Unidades unit = new Unidades();
            unit.setCodigoUnidad(Integer.parseInt(unidad.getCodigoUnidad()));
            unit.setNombre(unidad.getNombre());
            unit.setPrefijo(unidad.getPrefijo());
            ses.save(unit);
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
    
    public boolean editUnit(UnidadesForm unidad){
        boolean estado = false;
        try{
            SessionFactory sesFact = HibernateUtil.getSessionFactory();
            Session ses = sesFact.openSession();
            Transaction trans =  ses.beginTransaction();
            Unidades unit = new Unidades();
            unit.setCodigoUnidad(Integer.parseInt(unidad.getCodigoUnidad()));
            unit.setNombre(unidad.getNombre());
            unit.setPrefijo(unidad.getPrefijo());
            ses.update(unit);
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
    
    public boolean deleteUnit(int id){
        boolean estado = false;
        try{
            SessionFactory sesFact = HibernateUtil.getSessionFactory();
            Session ses = sesFact.openSession();
            Transaction trans =  ses.beginTransaction();
            Unidades unit = (Unidades)ses.get(Unidades.class, id);
            ses.delete(unit);
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
