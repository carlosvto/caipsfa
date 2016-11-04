package caipsfa.db.hibernate;
// Generated 10-19-2016 11:40:37 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Diagnostico generated by hbm2java
 */
public class Diagnostico  implements java.io.Serializable {


     private Integer codigoDiagnostico;
     private String nombre;
     private String descripcion;
     private Set salidases = new HashSet(0);

    public Diagnostico() {
    }

	
    public Diagnostico(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public Diagnostico(String nombre, String descripcion, Set salidases) {
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.salidases = salidases;
    }
   
    public Integer getCodigoDiagnostico() {
        return this.codigoDiagnostico;
    }
    
    public void setCodigoDiagnostico(Integer codigoDiagnostico) {
        this.codigoDiagnostico = codigoDiagnostico;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getSalidases() {
        return this.salidases;
    }
    
    public void setSalidases(Set salidases) {
        this.salidases = salidases;
    }




}

