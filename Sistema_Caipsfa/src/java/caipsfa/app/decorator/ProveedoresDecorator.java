/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caipsfa.app.decorator;
import org.displaytag.decorator.TableDecorator;
import caipsfa.db.hibernate.Proveedores;

/**
 *
 * @author Familia
 */
public class ProveedoresDecorator extends TableDecorator{
    public String getActualizar(){
        Proveedores providers = (Proveedores) getCurrentRowObject();
        String enlace;
        enlace ="<a href=\"#\" class=\"btn btn-primary btn-xs\"><i class=\"fa fa-pencil\"></i> Actualizar</a>";
        return enlace;
    }
    
    public String getEliminar(){
        Proveedores providers = (Proveedores) getCurrentRowObject();
        String enlace;
        enlace ="<a href=\"#\" class=\"btn btn-danger btn-xs\"><i class=\"fa fa-trash-o \"></i> Eliminar</a>";
        return enlace;
    }
}
