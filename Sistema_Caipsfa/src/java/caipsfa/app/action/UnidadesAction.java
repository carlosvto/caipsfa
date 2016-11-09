/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caipsfa.app.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.actions.DispatchAction;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import java.util.ArrayList;
import caipsfa.app.modelo.GestionUnidades;
import caipsfa.app.form.UnidadesForm;
import caipsfa.db.hibernate.Unidades;
import java.util.Base64;

/**
 *
 * @author Familia
 */
public class UnidadesAction extends DispatchAction {

    /* forward name="success" path="" */
    private final static String SUCCESS = "success";

    /**
     * This is the Struts action method called on
     * http://.../actionPath?method=myAction1, where "method" is the value
     * specified in <action> element : ( <action parameter="method" .../> )
     */
    public ActionForward Agregar(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        UnidadesForm unidades = (UnidadesForm) form;
        GestionUnidades gunidades = new GestionUnidades();
        if(gunidades.addUnit(unidades)){
            ArrayList<Unidades> listunidades = gunidades.getAllUnidades();
            request.setAttribute("listunidades", listunidades);
            return mapping.findForward("tableunidades");
        }else{
            return mapping.findForward("addformunits");
        }
    }

    /**
     * This is the Struts action method called on
     * http://.../actionPath?method=myAction2, where "method" is the value
     * specified in <action> element : ( <action parameter="method" .../> )
     */
    public ActionForward getOneUnit(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
               UnidadesForm unidades = (UnidadesForm) form;
               byte prueba[] = Base64.getDecoder().decode(unidades.getCodigoUnidad());
               String unit = new String(prueba);
               GestionUnidades gunidades = new GestionUnidades();
               ArrayList<Unidades> unidad = gunidades.geOne(unit);
               for (Unidades unidad1 : unidad) {
                   unidades.setCodigoUnidad(Integer.toString(unidad1.getCodigoUnidad()));
                   unidades.setNombre(unidad1.getNombre());
                   unidades.setPrefijo(unidad1.getPrefijo());
               }
               form = unidades;
               request.setAttribute("editar", "Editar Usuario");
               return mapping.findForward("addformunits");
    }
    
    public ActionForward Editar(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        UnidadesForm unidades = (UnidadesForm) form;
        GestionUnidades gunidades = new GestionUnidades();
        if(gunidades.editUnit(unidades)){
            ArrayList<Unidades> listunidades = gunidades.getAllUnidades();
            request.setAttribute("listunidades", listunidades);
            return mapping.findForward("tableunidades");
        }else{
            return mapping.findForward("addformunits");
        }
    }
    
    public ActionForward Eliminar(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        int codigoUnidad = Integer.parseInt(request.getParameter("codigoUnidad"));
        GestionUnidades gunidades = new GestionUnidades();
        if(gunidades.deleteUnit(codigoUnidad)){
            return mapping.findForward("tableunidades");
        }else{
            return mapping.findForward("tableunidades");
        }
    }
}
