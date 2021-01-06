
package Logica;

import java.util.ArrayList;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Empleado {
   
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   int id_empleado;
   
   @Basic
   String nombre;
   String apellido;
   String categoria;
   
   @OneToOne
   Usuario usuario_empleado;
   
    public Empleado() {
    }
    public Empleado(int id_empleado, String nombre, String apellido, String categoria, Usuario usuario_empleado) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.categoria = categoria;
        this.usuario_empleado = usuario_empleado;
    }

    public int getId() {
        return id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setId(int id) {
        this.id_empleado = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setUsuario_empleado(Usuario usuario_empleado) {
        this.usuario_empleado = usuario_empleado;
    }

    public Usuario getUsuario_empleado() {
        return usuario_empleado;
    }
}
