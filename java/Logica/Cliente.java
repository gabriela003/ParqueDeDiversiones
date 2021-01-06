
package Logica;

import java.util.ArrayList;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id_cliente;
    
    @Basic
    String email_cliente;
    
    @OneToMany
    ArrayList<Entrada> entradas_cliente;

    public Cliente() {
    }

    public Cliente(int id_cliente, String email_cliente, ArrayList<Entrada> entradas_cliente) {
        this.id_cliente = id_cliente;
        this.email_cliente = email_cliente;
        this.entradas_cliente = entradas_cliente;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public String getEmail_cliente() {
        return email_cliente;
    }

    public ArrayList<Entrada> getEntradas_cliente() {
        return entradas_cliente;
    }
    
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }

    public void setEntradas_cliente(ArrayList<Entrada> entradas_cliente) {
        this.entradas_cliente = entradas_cliente;
    }
    
}
