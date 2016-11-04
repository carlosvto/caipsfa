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
public class GestionLogin {
    ArrayList<Usuarios> listausuarios = new ArrayList<Usuarios>();
    
    public ArrayList<Usuarios> llenarusu (LoginForm login){
        SessionFactory sesFact=HibernateUtil.getSessionFactory();
        Session ses=sesFact.openSession();
        String sql = "from Usuarios where Nombre_usuario = '" + login.getNombre_usuario()+ "' and Password  = '" + login.getPassword() + "'";
        ArrayList<Usuarios> listausuarios = new ArrayList<Usuarios>();
        listausuarios = (ArrayList<Usuarios>) ses.createQuery(sql).list();
        for(int i=0;i<listausuarios.size();i++){
            Usuarios usuario = (Usuarios)listausuarios.get(i);
            System.out.println(usuario.getIdUsuario());
        }
        return listausuarios;
    }
}
