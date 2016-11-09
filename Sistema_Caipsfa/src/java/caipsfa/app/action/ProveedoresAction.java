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
import caipsfa.app.modelo.GestionProveedores;
import caipsfa.app.form.ProveedoresForm;
import caipsfa.db.hibernate.Proveedores;
import java.util.ArrayList;
import java.util.Base64;

/**
 *
 * @author Familia
 */
public class ProveedoresAction extends DispatchAction {

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
        ProveedoresForm proveedores = (ProveedoresForm) form;
        GestionProveedores gproveedores = new GestionProveedores();
        if(gproveedores.addProvider(proveedores)){
            ArrayList<Proveedores> listproveedores = gproveedores.getAllProviders();
            request.setAttribute("listproveedores", listproveedores);
            return mapping.findForward("tableproveedores");
        }else{
            return mapping.findForward("addformproviders");
        }
    }

    /**
     * This is the Struts action method called on
     * http://.../actionPath?method=myAction2, where "method" is the value
     * specified in <action> element : ( <action parameter="method" .../> )
     */
    public ActionForward getOneProvider(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
               ProveedoresForm proveedores = (ProveedoresForm) form;
               byte prueba[] = Base64.getDecoder().decode(proveedores.getCodigoProveedor());
               String provs = new String(prueba);
               GestionProveedores gproveedores = new GestionProveedores();
               ArrayList<Proveedores> diagnostics = gproveedores.geOne(provs);
               for (Proveedores proveedores1 : diagnostics){
                   proveedores.setCodigoProveedor(Integer.toString(proveedores1.getCodigoProveedor()));
                   proveedores.setNombreProveedor(proveedores1.getNombreProveedor());
                   proveedores.setDireccion(proveedores1.getDireccion());
                   proveedores.setContacto(proveedores1.getContacto());
                   proveedores.setNumeroTelefono(proveedores1.getNumeroTelefono());
               }
               form = proveedores;
               request.setAttribute("editar", "Editar Proveedores");
               return mapping.findForward("addformproviders");
    }
    
    public ActionForward Editar(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ProveedoresForm proveedores = (ProveedoresForm) form;
        GestionProveedores gproveedores = new GestionProveedores();
        if(gproveedores.editProvider(proveedores)){
            ArrayList<Proveedores> listproveedores = gproveedores.getAllProviders();
            request.setAttribute("listproveedores", listproveedores);
            return mapping.findForward("tableproveedores");
        }else{
            return mapping.findForward("addformproviders");
        }
    }
    
    public ActionForward Eliminar(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String codigoProveedor = request.getParameter("codigoProveedor");
        GestionProveedores gproveedores = new GestionProveedores();
        if(gproveedores.deleteProvider(Integer.parseInt(codigoProveedor))){
            return mapping.findForward("tableproveedores");
        }else{
            return mapping.findForward("tableproveedores");
        }
    }
}
