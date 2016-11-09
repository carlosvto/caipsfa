/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caipsfa.app.decorator;
import org.displaytag.decorator.TableDecorator;
import caipsfa.db.hibernate.Doctores;
import java.util.Base64;

/**
 *
 * @author Familia
 */
public class DoctoresDecorator  extends TableDecorator{
    public String getActualizar(){
        Doctores docs = (Doctores) getCurrentRowObject();
        String enlace;
        String var = Integer.toString(docs.getCodigoDoctor());
        String query = Base64.getEncoder().encodeToString(var.getBytes());
        enlace ="<a href=\"mantodoctores.do?method=getOneDoctor&codigoDoctor="
                + query +"\" class=\"btn btn-primary btn-xs\"><i class=\"fa fa-pencil\"></i> Actualizar</a>";
        return enlace;
    }
    
    public String getEliminar(){
        Doctores docs = (Doctores) getCurrentRowObject();
        String enlace;
        enlace ="<a href=\"#\" codigoDoctor=\""+ docs.getCodigoDoctor() +"\" apellidos=\""+ docs.getNombres() + " " +docs.getApellidos() +"\" class=\"btn btn-danger btn-xs delete\"><i class=\"fa fa-trash-o \"></i> Eliminar</a>";
        return enlace;
    }
}
