import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "jugador")
public class Jugador extends EntidadPersistente{

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private String domicilio;

    @Column( columnDefinition = "DATE")
    private LocalDate nacimiento;

    @ManyToOne
    private Paleta paleta;
}
