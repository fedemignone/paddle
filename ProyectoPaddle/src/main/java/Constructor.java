import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "constructor")
public class Constructor extends EntidadPersistente {

    @Column
    private String nombre;

    @Column
    private String domicilio;
}
