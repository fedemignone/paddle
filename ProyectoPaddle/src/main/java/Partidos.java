import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "partido")
public class Partidos extends EntidadPersistente {

    @ManyToOne
    private Cancha cancha;

    @ManyToOne
    private Color color;

    @ManyToOne
    private Reserva reserva;
}
