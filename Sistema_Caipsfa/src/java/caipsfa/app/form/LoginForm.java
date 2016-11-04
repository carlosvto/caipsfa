/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caipsfa.app.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Familia
 */
public class LoginForm extends org.apache.struts.validator.ValidatorForm {
    
    private String nombre_usuario;
    
    private String password;

    /**
     * @return
     */
    public String getNombre_usuario() {
        return nombre_usuario;
    }

    /**
     * @param string
     */
    public void setNombre_usuario(String string) {
        nombre_usuario = string;
    }

    /**
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param pwd
     */
    public void setPassword(String pwd) {
        password = pwd;
    }

    /**
     *
     */
    public LoginForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
   /* public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getNombre_usuario()== null || getNombre_usuario().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }*/
}
