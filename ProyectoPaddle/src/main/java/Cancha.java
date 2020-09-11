import javax.persistence.*;

@Entity
@Table(name = "cancha")
public class Cancha extends EntidadPersistente {

    @Column (name = "nombre")
    private String nombre;

    @Column (name = "esta_iluminada")
    private boolean esta_iluminada;

    @ManyToOne
    private Color color;


    public Cancha() {
        this.nombre = null;
        this.esta_iluminada = false;
        this.color = null;
    }
}
