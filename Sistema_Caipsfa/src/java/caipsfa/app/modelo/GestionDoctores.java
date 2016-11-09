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
public class GestionDoctores {
    ArrayList<Doctores> doctores;
    
    public ArrayList<Doctores> getAllDoctors(){
        SessionFactory sesFact = HibernateUtil.getSessionFactory();
        Session ses = sesFact.openSession();
        doctores = new ArrayList<Doctores>();
        String sql = "from Doctores";
        doctores = (ArrayList<Doctores>)ses.createQuery(sql).list();
        return doctores;
    }
    
    public ArrayList<Doctores> geOne(String codigoDoctor){
        SessionFactory sesFact = HibernateUtil.getSessionFactory();
        Session ses = sesFact.openSession();
        doctores = new ArrayList<Doctores>();
        String sql = "from Doctores where codigoDoctor = '"+ codigoDoctor +"'";
        doctores = (ArrayList<Doctores>)ses.createQuery(sql).list();
        return doctores;
    }
    
    public boolean addDoctor(DoctoresForm docs){
        boolean estado = false;
        try{
            SessionFactory sesFact = HibernateUtil.getSessionFactory();
            Session ses = sesFact.openSession();
            Transaction trans =  ses.beginTransaction();
            Doctores doctors = new Doctores();
            doctors.setCodigoDoctor(Integer.parseInt(docs.getCodigoDoctor()));
            doctors.setNombres(docs.getNombres());
            doctors.setApellidos(docs.getApellidos());
            doctors.setEspecialidad(docs.getEspecialidad());
            doctors.setDui(docs.getDui());
            doctors.setNit(docs.getNit());
            doctors.setEmail(docs.getEmail());
            doctors.setTelefono(docs.getTelefono());
            doctors.setDependencia(docs.getDependencia());
            ses.save(doctors);
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
    
    public boolean editDoctor(DoctoresForm docs){
        boolean estado = false;
        try{
            SessionFactory sesFact = HibernateUtil.getSessionFactory();
            Session ses = sesFact.openSession();
            Transaction trans =  ses.beginTransaction();
            Doctores doctors = new Doctores();
            doctors.setCodigoDoctor(Integer.parseInt(docs.getCodigoDoctor()));
            doctors.setNombres(docs.getNombres());
            doctors.setApellidos(docs.getApellidos());
            doctors.setEspecialidad(docs.getEspecialidad());
            doctors.setDui(docs.getDui());
            doctors.setNit(docs.getNit());
            doctors.setEmail(docs.getEmail());
            doctors.setTelefono(docs.getTelefono());
            doctors.setDependencia(docs.getDependencia());
            ses.update(doctors);
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
    
    public boolean deleteDoctor(int id){
        boolean estado = false;
        try{
            SessionFactory sesFact = HibernateUtil.getSessionFactory();
            Session ses = sesFact.openSession();
            Transaction trans =  ses.beginTransaction();
            Doctores doctors = (Doctores)ses.get(Doctores.class, id);
            ses.delete(doctors);
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
