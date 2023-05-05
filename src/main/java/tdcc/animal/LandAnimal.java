package tdcc.animal;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
// Strategy 1:
//@Entity
//@DiscriminatorValue("L")

// Strategy 3:
//@Entity
//@Table(name = "animal_land_concrete")

// Strategy 2:
//@Entity
//@Table(name="land_animal_join")

@Entity
@Table(name = "animal_land_concrete")
public class LandAnimal extends Animal
{

    @Column(name="leg_cnt")
    private int legCount;

    public int getLegCount()
    {
        return legCount;
    }

    public void setLegCount(int legCount)
    {
        this.legCount = legCount;
    }
    
    

}
