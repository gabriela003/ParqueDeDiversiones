
package Logica;

import java.util.ArrayList;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Juego {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;
    
    @Basic
    String nombre;
    boolean disponible;
    
    @OneToOne
    Horario hora;
    
    @OneToMany
    ArrayList<Empleado> empleados;
    @OneToMany
    ArrayList<Entrada> entradas;

    public Juego() {
    }

    public Juego(int id, String nombre, boolean disponible, Horario hora) {
        this.id = id;
        this.nombre = nombre;
        this.disponible = disponible;
        this.hora = hora;
        this.empleados = empleados;
    }
     public void agregarEmpleadoEncargado(Empleado emp){
         this.empleados.add(emp);
     }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public Horario getHora() {
        return hora;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setHora(Horario hora) {
        this.hora = hora;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
}
