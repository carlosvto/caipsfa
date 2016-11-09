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
import caipsfa.app.modelo.GestionDiagnostico;
import caipsfa.app.form.DiagnosticoForm;
import caipsfa.db.hibernate.Diagnostico;
import java.util.ArrayList;
import java.util.Base64;

/**
 *
 * @author Familia
 */
public class DiagnosticoAction extends DispatchAction {

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
        DiagnosticoForm diagnosticos = (DiagnosticoForm) form;
        GestionDiagnostico gdiagnostico = new GestionDiagnostico();
        if(gdiagnostico.addDiagnostic(diagnosticos)){
            ArrayList<Diagnostico> listdiagnostico = gdiagnostico.getAllDiagnostico();
            request.setAttribute("listdiagnostico", listdiagnostico);
            return mapping.findForward("tablediagnosticos");
        }else{
            return mapping.findForward("addformdiagnostic");
        }
    }

    /**
     * This is the Struts action method called on
     * http://.../actionPath?method=myAction2, where "method" is the value
     * specified in <action> element : ( <action parameter="method" .../> )
     */
    public ActionForward getOneDiagnostic(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
               DiagnosticoForm diagnosticos = (DiagnosticoForm) form;
               byte prueba[] = Base64.getDecoder().decode(diagnosticos.getCodigoDiagnostico());
               String diag = new String(prueba);
               GestionDiagnostico gdiagnostico = new GestionDiagnostico();
               ArrayList<Diagnostico> diagnostics = gdiagnostico.geOne(diag);
               for (Diagnostico diagnosticos1 : diagnostics){
                   diagnosticos.setCodigoDiagnostico(Integer.toString(diagnosticos1.getCodigoDiagnostico()));
                   diagnosticos.setNombre(diagnosticos1.getNombre());
                   diagnosticos.setDescripcion(diagnosticos1.getDescripcion());
               }
               form = diagnosticos;
               request.setAttribute("editar", "Editar Diagnostico");
               return mapping.findForward("addformdiagnostic");
    }
    
    public ActionForward Editar(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        DiagnosticoForm diagnosticos = (DiagnosticoForm) form;
        GestionDiagnostico gdiagnostico = new GestionDiagnostico();
        if(gdiagnostico.editDiagnostic(diagnosticos)){
            ArrayList<Diagnostico> listdiagnostico = gdiagnostico.getAllDiagnostico();
            request.setAttribute("listdiagnostico", listdiagnostico);
            return mapping.findForward("tablediagnosticos");
        }else{
            return mapping.findForward("addformdiagnostic");
        }
    }
    
    public ActionForward Eliminar(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String codigoDoctor = request.getParameter("codigoDiagnostico");
        GestionDiagnostico gdiagnostico = new GestionDiagnostico();
        if(gdiagnostico.deleteDiagnostic(Integer.parseInt(codigoDoctor))){
            return mapping.findForward("tablediagnosticos");
        }else{
            return mapping.findForward("tablediagnosticos");
        }
    }
}
