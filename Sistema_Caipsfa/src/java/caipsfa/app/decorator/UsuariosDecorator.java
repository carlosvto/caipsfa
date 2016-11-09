/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caipsfa.app.decorator;
import org.displaytag.decorator.TableDecorator;
import caipsfa.db.hibernate.Usuarios;
import java.util.Base64;

/**
 *
 * @author Familia
 */
public class UsuariosDecorator extends TableDecorator {
    public String getActualizar(){
        Usuarios users = (Usuarios) getCurrentRowObject();
        String enlace;
        String var = users.getNombreUsuario();
        String query = Base64.getEncoder().encodeToString(var.getBytes());
        enlace ="<a href=\"mantousuarios.do?method=getOneUser&nombreUsuario=" +
                 query +"\" class=\"btn btn-primary btn-xs\"><i class=\"fa fa-pencil\"></i> Actualizar</a>";
        return enlace;
    }
    
    public String getEliminar(){
        Usuarios users = (Usuarios) getCurrentRowObject();
        String enlace;
        enlace ="<a href=\"#\" idUsuario=\""+ users.getIdUsuario() +"\" nombreUsuario=\""+ users.getNombreUsuario() +"\" class=\"btn btn-danger btn-xs delete\"><i class=\"fa fa-trash-o \"></i> Eliminar</a>";
        return enlace;
    }
}
