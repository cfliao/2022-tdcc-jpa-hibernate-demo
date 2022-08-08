package tdcc.company;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Project
{
    @Column(name = "pname")
    private String name;

    @Id
    @Column(name = "pnumber")
    private int id;

    @Column(name = "dnum")
    private int departmentId;

    @Column(name = "plocation")
    private String location;

}
