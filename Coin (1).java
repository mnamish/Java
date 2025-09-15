package Trees2;

public class Coin implements Comparable<Coin> {
    private String name;
    private int value;

    public Coin(String n, int v) {
        name = n;
        value = v;
    }

    public int compareTo(Coin other) {
        return Integer.compare(this.value, other.value);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Coin)) return false;
        Coin other = (Coin) obj;
        return this.name.equals(other.name) && this.value == other.value;
    }

    public String toString() {
        return name + " (" + value + ")";
    }
}

