/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caipsfa.app.action;
import caipsfa.app.form.LoginForm;
import caipsfa.db.hibernate.Usuarios;
import caipsfa.app.modelo.GestionLogin;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.actions.DispatchAction;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

/**
 *
 * @author Familia
 */
public class LoginAction extends DispatchAction {

    /* forward name="success" path="" */
    private final static String SUCCESS = "success";

    /**
     * This is the Struts action method called on
     * http://.../actionPath?method=myAction1, where "method" is the value
     * specified in <action> element : ( <action parameter="method" .../> )
     */
    public ActionForward ingresar(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        LoginForm log = (LoginForm) form;
            GestionLogin gl = new GestionLogin();
            ArrayList<Usuarios> usu  = new ArrayList<Usuarios>();
            usu.addAll(gl.llenarusu(log));
            Usuarios usuario = new Usuarios();
            if(!usu.isEmpty()){
                HttpSession session_actual = request.getSession(true);
                session_actual.setAttribute("USER", log.getNombre_usuario());
                for(int i = 0; i<usu.size();i++){
                    usuario = (Usuarios)usu.get(i);
                }
                if(usuario.getTipoUsuarios().getIdTipo() == 1){
                    return mapping.findForward("inicioEnf");
                    //return mapping.findForward("Welcome");
                }
                else{
                    return mapping.findForward("inicioEnf");
                    //return mapping.findForward("Welcome");
                }
            }
            else{
                return mapping.findForward("error");
            }
    }

    /**
     * This is the Struts action method called on
     * http://.../actionPath?method=myAction2, where "method" is the value
     * specified in <action> element : ( <action parameter="method" .../> )
     */
    public ActionForward cerrar(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        HttpSession sessionOk = request.getSession();
        System.out.println(sessionOk.getAttribute("USER"));
        sessionOk.invalidate();
        return mapping.findForward("close");
    }
}
