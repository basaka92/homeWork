package family_tree.model.creatures.interfaces;

import java.io.Serializable;
import java.time.LocalDate;

public interface Creatures extends Serializable {
    LocalDate getDateOfBirth();
    void setMother(Creatures creature);
    void setFather(Creatures creature);
    void addChildren(Creatures creature);
    int getId();
    long getAge();
    String viewAllFamily();
    String toString();
}
