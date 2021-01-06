
package Logica;


import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Horario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id_horario;
    
    @Temporal(TemporalType.TIME)
    Date h_apertura;
    @Temporal(TemporalType.TIME)
    Date h_cierre;

    public Horario() {
    }

    public Horario(int id_horario, Date apertura, Date cierre) {
        this.id_horario = id_horario;
        this.h_apertura = apertura;
        this.h_cierre = cierre;
    }

    public int getId_horario() {
        return id_horario;
    }

    public Date getApertura() {
        return h_apertura;
    }

    public Date getCierre() {
        return h_cierre;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public void setApertura(Date apertura) {
        this.h_apertura = apertura;
    }

    public void setCierre(Date cierre) {
        this.h_cierre = cierre;
    }
    
    
}
