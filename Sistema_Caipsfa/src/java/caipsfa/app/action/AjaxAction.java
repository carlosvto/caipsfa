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
import javax.json.*;
import java.util.ArrayList;
import caipsfa.app.modelo.*;
import caipsfa.db.hibernate.*;
import java.io.InputStream;

/**
 *
 * @author Familia
 */
public class AjaxAction extends DispatchAction {

    /* forward name="success" path="" */
    private final static String SUCCESS = "success";

    /**
     * This is the Struts action method called on
     * http://.../actionPath?method=myAction1, where "method" is the value
     * specified in <action> element : ( <action parameter="method" .../> )
     */
    public ActionForward getUsers(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
            
        GestionUsuarios gusuarios = new GestionUsuarios();
        ArrayList<Usuarios> listusuarios = gusuarios.getAllUsers();
        request.setAttribute("listusuarios", listusuarios);
        return mapping.findForward("tableusuarios");
    }

    /**
     * This is the Struts action method called on
     * http://.../actionPath?method=myAction2, where "method" is the value
     * specified in <action> element : ( <action parameter="method" .../> )
     */
    public ActionForward getDoctors(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        GestionDoctores gdoctores = new GestionDoctores();
        ArrayList<Doctores> listdoctores = gdoctores.getAllDoctors();
        request.setAttribute("listdoctores", listdoctores);
        return mapping.findForward("tabledoctores");
    }
    
    public ActionForward getDiag(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        GestionDiagnostico gdiagnostico = new GestionDiagnostico();
        ArrayList<Diagnostico> listdiagnostico = gdiagnostico.getAllDiagnostico();
        request.setAttribute("listdiagnostico", listdiagnostico);
        return mapping.findForward("tablediagnostico");
    }
    
    public ActionForward getArtic(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        GestionProductos gproductos = new GestionProductos();
        ArrayList<Productos> listproductos = gproductos.getAllProductos();
        request.setAttribute("listproductos", listproductos);
        return mapping.findForward("tableproductos");
    }
    
    public ActionForward getProvs(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        GestionProveedores gproveedores = new GestionProveedores();
        ArrayList<Proveedores> listproveedores = gproveedores.getAllProviders();
        request.setAttribute("listproveedores", listproveedores);
        return mapping.findForward("tableproveedores");
    }
    
    public ActionForward getUnidades(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        GestionUnidades gunidades = new GestionUnidades();
        ArrayList<Unidades> listunidades = gunidades.getAllUnidades();
        request.setAttribute("listunidades", listunidades);
        return mapping.findForward("tableunidades");
    }
    
    public ActionForward addUsers(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        GestionUsuarios gusuarios = new GestionUsuarios();
        ArrayList<TipoUsuarios> tipoUsuarios = gusuarios.getUserType();
        request.setAttribute("tipoUsuarios", tipoUsuarios);
        return mapping.findForward("addformuser");
    }
}
