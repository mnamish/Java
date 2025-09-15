package School;

public class Swimmer implements Comparable<Swimmer> {

    int height, weight, age;
    
    // See document for the list of the other methods that need to be included
    public Swimmer() {
        // Default constructor
    }

    public Swimmer(int height, int weight, int age) {
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public boolean equals(Object o) {
        if (this == o){
             return true;
        }
        if (o == null || getClass() != o.getClass()){
             return false;
        }

        Swimmer swimmer = (Swimmer) o;
        return height == swimmer.height && weight == swimmer.weight && age == swimmer.age;
    }

    @Override
    public int compareTo(Swimmer o) {
        if (this.height != o.height) {
            return this.height - o.height;
        } else if (this.weight != o.weight) {
            return this.weight - o.weight;
        } else {
            return this.age - o.age;
        }
        
    }

    public String toString() {
        return "Swimmer [" +
                "height: " + height +
                ", weight: " + weight +
                ", age: " + age +
                ']';
    }

}
