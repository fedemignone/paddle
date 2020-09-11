import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "color")
public class Color extends EntidadPersistente {

    @Column
    private String descripcion;
}
