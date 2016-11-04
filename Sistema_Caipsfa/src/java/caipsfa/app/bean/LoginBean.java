/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caipsfa.app.bean;

/**
 *
 * @author Familia
 */
public class LoginBean {
    private Integer id_usuario;
    private String nombre_usuario;
    private String password;
    private Integer id_tipo;

    
    //Constructor
    
    public LoginBean(Integer id_user, String name, String pwd, Integer id_type){
        this.id_usuario = id_user;
        this.nombre_usuario = name;
        this.password = pwd;
        this.id_tipo = id_type;
    }
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
     * @return the id_usuario
     */
    public Integer getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    /**
     * @return the id_tipo
     */
    public Integer getId_tipo() {
        return id_tipo;
    }

    /**
     * @param id_tipo the id_tipo to set
     */
    public void setId_tipo(Integer id_tipo) {
        this.id_tipo = id_tipo;
    }
}
