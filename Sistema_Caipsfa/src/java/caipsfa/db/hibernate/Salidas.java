package caipsfa.db.hibernate;
// Generated 10-19-2016 11:40:37 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Salidas generated by hbm2java
 */
public class Salidas  implements java.io.Serializable {


     private Integer codigoSalida;
     private Diagnostico diagnostico;
     private Doctores doctores;
     private Productos productos;
     private Usuarios usuarios;
     private Date fechaSalida;
     private int cantidad;

    public Salidas() {
    }

    public Salidas(Diagnostico diagnostico, Doctores doctores, Productos productos, Usuarios usuarios, Date fechaSalida, int cantidad) {
       this.diagnostico = diagnostico;
       this.doctores = doctores;
       this.productos = productos;
       this.usuarios = usuarios;
       this.fechaSalida = fechaSalida;
       this.cantidad = cantidad;
    }
   
    public Integer getCodigoSalida() {
        return this.codigoSalida;
    }
    
    public void setCodigoSalida(Integer codigoSalida) {
        this.codigoSalida = codigoSalida;
    }
    public Diagnostico getDiagnostico() {
        return this.diagnostico;
    }
    
    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }
    public Doctores getDoctores() {
        return this.doctores;
    }
    
    public void setDoctores(Doctores doctores) {
        this.doctores = doctores;
    }
    public Productos getProductos() {
        return this.productos;
    }
    
    public void setProductos(Productos productos) {
        this.productos = productos;
    }
    public Usuarios getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
    public Date getFechaSalida() {
        return this.fechaSalida;
    }
    
    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }




}


