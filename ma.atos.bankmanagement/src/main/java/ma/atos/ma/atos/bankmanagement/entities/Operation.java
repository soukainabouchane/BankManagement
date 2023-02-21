package ma.atos.ma.atos.bankmanagement.entities;
import lombok.Data;
import ma.atos.ma.atos.bankmanagement.enums.SensOperation;
import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_OPERATION")
public class Operation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long idOperation;
    protected double montant;
    protected String description;
    protected Date dateOperation;
    @Enumerated(EnumType.STRING)
    protected SensOperation sensOperation;
    @ManyToOne
    private Compte compte;
    @Column(name = "TYPE_OPERATION", insertable = false,updatable = false)
    private String typeOperation;
}
