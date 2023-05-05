package tdcc.animal;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
// Strategy 1:
//@Entity
//@Table(name = "animal_single")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "type")

// Strategy 2:
//@Entity
//@Table(name = "animal_join")
//@Inheritance(strategy = InheritanceType.JOINED)

// Strategy 3:
//@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Animal
{

    @Id
    private int id;

    private String name;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

}
