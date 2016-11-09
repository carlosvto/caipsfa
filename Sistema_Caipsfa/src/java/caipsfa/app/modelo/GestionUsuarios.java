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
public class GestionUsuarios {
    ArrayList<Usuarios> usuarios;
    ArrayList<TipoUsuarios> tipoUsuarios;
    
    public ArrayList<Usuarios> getAllUsers(){
        SessionFactory sesFact = HibernateUtil.getSessionFactory();
        Session ses = sesFact.openSession();
        usuarios = new ArrayList<Usuarios>();
        String sql = "from Usuarios";
        usuarios = (ArrayList<Usuarios>)ses.createQuery(sql).list();
        return usuarios;
    }
    
    public ArrayList<Usuarios> geOne(String nombreUsuario){
        SessionFactory sesFact = HibernateUtil.getSessionFactory();
        Session ses = sesFact.openSession();
        usuarios = new ArrayList<Usuarios>();
        String sql = "from Usuarios where nombreUsuario = '"+nombreUsuario +"'";
        usuarios = (ArrayList<Usuarios>)ses.createQuery(sql).list();
        return usuarios;
    }
    
    public ArrayList<TipoUsuarios> getUserType(){
        SessionFactory sesFact = HibernateUtil.getSessionFactory();
        Session ses = sesFact.openSession();
        tipoUsuarios = new ArrayList<TipoUsuarios>();
        String sql = "from TipoUsuarios";
        tipoUsuarios = (ArrayList<TipoUsuarios>)ses.createQuery(sql).list();
        return tipoUsuarios;
    }
    
    public boolean addUser(UsuariosForm usuario){
        boolean estado = false;
        try{
            SessionFactory sesFact = HibernateUtil.getSessionFactory();
            Session ses = sesFact.openSession();
            Transaction trans =  ses.beginTransaction();
            Usuarios user = new Usuarios();
            TipoUsuarios type = new TipoUsuarios();
            type.setIdTipo(usuario.getIdTipo());
            user.setIdUsuario(usuario.getIdUsuario());
            user.setNombreUsuario(usuario.getNombreUsuario());
            user.setPassword(usuario.getPassword());
            user.setTipoUsuarios(type);
            ses.save(user);
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
    
    public boolean editUser(UsuariosForm usuario){
        boolean estado = false;
        try{
            SessionFactory sesFact = HibernateUtil.getSessionFactory();
            Session ses = sesFact.openSession();
            Transaction trans =  ses.beginTransaction();
            Usuarios user = new Usuarios();
            TipoUsuarios type = new TipoUsuarios();
            type.setIdTipo(usuario.getIdTipo());
            user.setIdUsuario(usuario.getIdUsuario());
            user.setNombreUsuario(usuario.getNombreUsuario());
            user.setPassword(usuario.getPassword());
            user.setTipoUsuarios(type);
            ses.update(user);
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
    
    public boolean deleteUser(int id){
        boolean estado = false;
        try{
            SessionFactory sesFact = HibernateUtil.getSessionFactory();
            Session ses = sesFact.openSession();
            Transaction trans =  ses.beginTransaction();
            Usuarios user = (Usuarios)ses.get(Usuarios.class, id);
            ses.delete(user);
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
