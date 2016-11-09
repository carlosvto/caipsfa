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
import caipsfa.app.modelo.GestionUsuarios;
import caipsfa.app.form.UsuariosForm;
import caipsfa.db.hibernate.TipoUsuarios;
import caipsfa.db.hibernate.Usuarios;
import java.util.Base64;

/**
 *
 * @author Familia
 */
public class UsuariosAction extends DispatchAction {

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
        UsuariosForm usuarios = (UsuariosForm) form;
        GestionUsuarios gusuarios = new GestionUsuarios();
        if(gusuarios.addUser(usuarios)){
            ArrayList<Usuarios> listusuarios = gusuarios.getAllUsers();
            request.setAttribute("listusuarios", listusuarios);
            return mapping.findForward("tableusuarios");
        }else{
            return mapping.findForward("addformuser");
        }
    }

    /**
     * This is the Struts action method called on
     * http://.../actionPath?method=myAction2, where "method" is the value
     * specified in <action> element : ( <action parameter="method" .../> )
     */
    public ActionForward getOneUser(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
               UsuariosForm usuarios = (UsuariosForm) form;
               byte prueba[] = Base64.getDecoder().decode(usuarios.getNombreUsuario());
               String user = new String(prueba);
               GestionUsuarios gusuarios = new GestionUsuarios();
               ArrayList<Usuarios> usuario = gusuarios.geOne(user);
               for (Usuarios usuario1 : usuario) {
                   usuarios.setIdUsuario(usuario1.getIdUsuario());
                   usuarios.setNombreUsuario(usuario1.getNombreUsuario());
                   usuarios.setPassword(usuario1.getPassword());
                   usuarios.setIdTipo(usuario1.getTipoUsuarios().getIdTipo());
               }
               form = usuarios;
               ArrayList<TipoUsuarios> tipoUsuarios = gusuarios.getUserType();
               request.setAttribute("editar", "Editar Usuario");
               request.setAttribute("tipoUsuarios", tipoUsuarios);
               return mapping.findForward("addformuser");
    }
    
    public ActionForward Editar(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        UsuariosForm usuarios = (UsuariosForm) form;
        GestionUsuarios gusuarios = new GestionUsuarios();
        if(gusuarios.editUser(usuarios)){
            ArrayList<Usuarios> listusuarios = gusuarios.getAllUsers();
            request.setAttribute("listusuarios", listusuarios);
            return mapping.findForward("tableusuarios");
        }else{
            return mapping.findForward("addformuser");
        }
    }
    
    public ActionForward Eliminar(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
        GestionUsuarios gusuarios = new GestionUsuarios();
        if(gusuarios.deleteUser(idUsuario)){
            return mapping.findForward("tableusuarios");
        }else{
            return mapping.findForward("tableusuarios");
        }
    }
}
