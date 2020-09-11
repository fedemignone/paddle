import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "paleta")
public class Reserva extends EntidadPersistente{

    @Column( columnDefinition = "DATE")
    private LocalDate inicio_partido;

    @Column( columnDefinition = "DATE")
    private LocalDate fin_partido;

    @ManyToOne
    private Cancha cancha;

    @ManyToOne
    private Jugador responsable;
}
