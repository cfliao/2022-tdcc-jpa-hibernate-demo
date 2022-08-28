package tdcc.company;


import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
public class Department {
    @Column(name = "dname")
    private String name;

    @Id
    @Column(name = "dnumber")
    //@GeneratedValue(generator = )
    private int id;

    // Department v.2
//    @OneToOne
//    @JoinColumn(name = "mgrssn", referencedColumnName = "ssn")
//    private Employee manager;

    // Department v.1
    @Column(name = "mgrssn")
    private String managerSsn;

    @Column(name = "mgrstartdate")
    @Temporal(TemporalType.DATE)
    private Date managerStartDate;

    // Department v.3
//    @OneToMany(mappedBy = "department")
//    private List<Employee> employees;


}
