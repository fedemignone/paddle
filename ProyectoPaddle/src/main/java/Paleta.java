import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "paleta")
public class Paleta extends EntidadPersistente{

    @Column
    private String nombre;

    @Column
    private int grosor;

    @ManyToOne
    private Color color;

    @ManyToOne
    private Constructor constructor;
}
