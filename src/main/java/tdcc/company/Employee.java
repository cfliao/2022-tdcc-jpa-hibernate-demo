package tdcc.company;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
public class Employee {
    private String fname;

    private String minit;

    private String lname;

    @Id
    private String ssn;

    @Column(name = "bdate")
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    private String address;

    private String sex;

    private double salary;

    private String superSsn;

    @ManyToMany
    @JoinTable(name = "Works_On", joinColumns = @JoinColumn(name = "essn", referencedColumnName = "ssn"), inverseJoinColumns = @JoinColumn(name = "pno", referencedColumnName = "pnumber"))
    private List<Project> projects;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "dno", referencedColumnName = "dnumber")
    private Department department;

}
