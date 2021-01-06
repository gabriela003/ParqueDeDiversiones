
package Logica;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Entrada {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int nro_entrada;
    @Basic
    @Temporal(TemporalType.TIME)
    Date fecha_reservada;
    
    
}
