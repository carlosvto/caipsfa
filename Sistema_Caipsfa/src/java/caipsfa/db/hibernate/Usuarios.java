package caipsfa.db.hibernate;
// Generated 10-19-2016 11:40:37 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuarios generated by hbm2java
 */
public class Usuarios  implements java.io.Serializable {


     private int idUsuario;
     private TipoUsuarios tipoUsuarios;
     private String nombreUsuario;
     private String password;
     private Set salidases = new HashSet(0);

    public Usuarios() {
    }

	
    public Usuarios(int idUsuario, TipoUsuarios tipoUsuarios, String nombreUsuario, String password) {
        this.idUsuario = idUsuario;
        this.tipoUsuarios = tipoUsuarios;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }
    public Usuarios(int idUsuario, TipoUsuarios tipoUsuarios, String nombreUsuario, String password, Set salidases) {
       this.idUsuario = idUsuario;
       this.tipoUsuarios = tipoUsuarios;
       this.nombreUsuario = nombreUsuario;
       this.password = password;
       this.salidases = salidases;
    }
   
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public TipoUsuarios getTipoUsuarios() {
        return this.tipoUsuarios;
    }
    
    public void setTipoUsuarios(TipoUsuarios tipoUsuarios) {
        this.tipoUsuarios = tipoUsuarios;
    }
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Set getSalidases() {
        return this.salidases;
    }
    
    public void setSalidases(Set salidases) {
        this.salidases = salidases;
    }




}

