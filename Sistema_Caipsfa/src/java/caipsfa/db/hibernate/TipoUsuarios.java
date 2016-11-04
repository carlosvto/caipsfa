package caipsfa.db.hibernate;
// Generated 10-19-2016 11:40:37 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TipoUsuarios generated by hbm2java
 */
public class TipoUsuarios  implements java.io.Serializable {


     private Integer idTipo;
     private String descripcion;
     private Set usuarioses = new HashSet(0);

    public TipoUsuarios() {
    }

	
    public TipoUsuarios(String descripcion) {
        this.descripcion = descripcion;
    }
    public TipoUsuarios(String descripcion, Set usuarioses) {
       this.descripcion = descripcion;
       this.usuarioses = usuarioses;
    }
   
    public Integer getIdTipo() {
        return this.idTipo;
    }
    
    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getUsuarioses() {
        return this.usuarioses;
    }
    
    public void setUsuarioses(Set usuarioses) {
        this.usuarioses = usuarioses;
    }




}


