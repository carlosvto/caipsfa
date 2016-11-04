/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caipsfa.app.decorator;
import org.displaytag.decorator.TableDecorator;
import caipsfa.db.hibernate.Unidades;

/**
 *
 * @author Familia
 */
public class UnidadesDecorator extends TableDecorator{
    public String getActualizar(){
        Unidades unidades = (Unidades) getCurrentRowObject();
        String enlace;
        enlace ="<a href=\"#\" class=\"btn btn-primary btn-xs\"><i class=\"fa fa-pencil\"></i> Actualizar</a>";
        return enlace;
    }
    
    public String getEliminar(){
        Unidades unidades = (Unidades) getCurrentRowObject();
        String enlace;
        enlace ="<a href=\"#\" class=\"btn btn-danger btn-xs\"><i class=\"fa fa-trash-o \"></i> Eliminar</a>";
        return enlace;
    }
    
}
