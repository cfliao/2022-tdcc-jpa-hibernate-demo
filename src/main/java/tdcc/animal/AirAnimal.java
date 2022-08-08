package tdcc.animal;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
// Strategy 1:
//@Entity
//@DiscriminatorValue("A")

// Strategy 3:
//@Entity
//@Table(name="animal_air_concrete")

//Strategy 2:
//@Entity
//@Table(name="air_animal_join")
//@DiscriminatorValue("A")

@Entity
@DiscriminatorValue("A")
public class AirAnimal extends Animal
{
    @Column(name = "wing_span")
    private int wingSpan;

    public int getWingSpan()
    {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan)
    {
        this.wingSpan = wingSpan;
    }

}
