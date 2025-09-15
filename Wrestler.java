package Maps;

import java.util.Objects;

public class Wrestler {
    private String name;
    private int weight;

    public Wrestler(String theName, int theWeight) {
        name = theName;
        weight = theWeight;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setWeight(int newWeight) {
        weight = newWeight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Wrestler wrestler = (Wrestler) obj;
        return weight == wrestler.weight && name.equals(wrestler.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    @Override
    public String toString() {
        return name + ": " + weight;
    }
}