import javax.persistence.*;

@Entity
@Table(name = "cancha")
public class Cancha extends EntidadPersistente {

    @Column (name = "nombre")
    private String nombre;

    @Column (name = "esta_iluminada")
    private boolean esta_iluminada;


    public Cancha(String nombre, boolean esta_iluminada  ) {
        this.nombre = nombre;
        this.esta_iluminada = esta_iluminada;
    }
}
