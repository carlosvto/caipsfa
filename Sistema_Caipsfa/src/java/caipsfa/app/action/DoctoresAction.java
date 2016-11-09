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
import caipsfa.app.modelo.GestionDoctores;
import caipsfa.app.form.DoctoresForm;
import caipsfa.db.hibernate.Doctores;
import java.util.ArrayList;
import java.util.Base64;


/**
 *
 * @author Familia
 */
public class DoctoresAction extends DispatchAction {

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
        DoctoresForm doctores = (DoctoresForm) form;
        GestionDoctores gdoctores = new GestionDoctores();
        if(gdoctores.addDoctor(doctores)){
            ArrayList<Doctores> listdoctors = gdoctores.getAllDoctors();
            request.setAttribute("listdoctores", listdoctors);
            return mapping.findForward("tabledoctores");
        }else{
            return mapping.findForward("addformdoctor");
        }
    }

    /**
     * This is the Struts action method called on
     * http://.../actionPath?method=myAction2, where "method" is the value
     * specified in <action> element : ( <action parameter="method" .../> )
     */
    public ActionForward getOneDoctor(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
               DoctoresForm doctores = (DoctoresForm) form;
               byte prueba[] = Base64.getDecoder().decode(doctores.getCodigoDoctor());
               String doctor = new String(prueba);
               GestionDoctores gdoctores = new GestionDoctores();
               ArrayList<Doctores> doctors = gdoctores.geOne(doctor);
               for (Doctores doctores1 : doctors){
                   doctores.setCodigoDoctor(Integer.toString(doctores1.getCodigoDoctor()));
                   doctores.setNombres(doctores1.getNombres());
                   doctores.setApellidos(doctores1.getApellidos());
                   doctores.setEspecialidad(doctores1.getEspecialidad());
                   doctores.setDui(doctores1.getDui());
                   doctores.setNit(doctores1.getNit());
                   doctores.setEmail(doctores1.getEmail());
                   doctores.setTelefono(doctores1.getTelefono());
                   doctores.setDependencia(doctores1.getDependencia());
               }
               form = doctores;
               request.setAttribute("editar", "Editar Doctor");
               return mapping.findForward("addformdoctor");
    }
    
    public ActionForward Editar(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        DoctoresForm doctores = (DoctoresForm) form;
        GestionDoctores gdoctores = new GestionDoctores();
        if(gdoctores.editDoctor(doctores)){
            ArrayList<Doctores> listdoctores = gdoctores.getAllDoctors();
            request.setAttribute("listdoctores", listdoctores);
            return mapping.findForward("tabledoctores");
        }else{
            return mapping.findForward("addformdoctor");
        }
    }
    
    public ActionForward Eliminar(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String codigoDoctor = request.getParameter("codigoDoctor");
        GestionDoctores gdoctores = new GestionDoctores();
        if(gdoctores.deleteDoctor(Integer.parseInt(codigoDoctor))){
            return mapping.findForward("tabledoctores");
        }else{
            return mapping.findForward("tabledoctores");
        }
    }
}
