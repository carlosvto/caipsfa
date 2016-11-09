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
public class GestionDiagnostico {
    ArrayList<Diagnostico> diagnostico;    
    
    public ArrayList<Diagnostico> getAllDiagnostico(){
        SessionFactory sesFact = HibernateUtil.getSessionFactory();
        Session ses = sesFact.openSession();
        diagnostico = new ArrayList<Diagnostico>();
        String sql = "from Diagnostico";
        diagnostico = (ArrayList<Diagnostico>)ses.createQuery(sql).list();
        return diagnostico;
    }
    
    public ArrayList<Diagnostico> geOne(String codigoDiagnostico){
        SessionFactory sesFact = HibernateUtil.getSessionFactory();
        Session ses = sesFact.openSession();
        diagnostico = new ArrayList<Diagnostico>();
        String sql = "from Diagnostico where codigoDiagnostico = '"+ codigoDiagnostico +"'";
        diagnostico = (ArrayList<Diagnostico>)ses.createQuery(sql).list();
        return diagnostico;
    }
    
    public boolean addDiagnostic(DiagnosticoForm diag){
        boolean estado = false;
        try{
            SessionFactory sesFact = HibernateUtil.getSessionFactory();
            Session ses = sesFact.openSession();
            Transaction trans =  ses.beginTransaction();
            Diagnostico diagnostic = new Diagnostico();
            diagnostic.setCodigoDiagnostico(0);
            diagnostic.setNombre(diag.getNombre());
            diagnostic.setDescripcion(diag.getDescripcion());
            ses.save(diagnostic);
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
    
    public boolean editDiagnostic(DiagnosticoForm diag){
        boolean estado = false;
        try{
            SessionFactory sesFact = HibernateUtil.getSessionFactory();
            Session ses = sesFact.openSession();
            Transaction trans =  ses.beginTransaction();
            Diagnostico diagnostic = new Diagnostico();
            diagnostic.setCodigoDiagnostico(Integer.parseInt(diag.getCodigoDiagnostico()));
            diagnostic.setNombre(diag.getNombre());
            diagnostic.setDescripcion(diag.getDescripcion());
            ses.update(diagnostic);
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
    
    public boolean deleteDiagnostic(int id){
        boolean estado = false;
        try{
            SessionFactory sesFact = HibernateUtil.getSessionFactory();
            Session ses = sesFact.openSession();
            Transaction trans =  ses.beginTransaction();
            Diagnostico diagnostic = (Diagnostico)ses.get(Diagnostico.class, id);
            ses.delete(diagnostic);
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
