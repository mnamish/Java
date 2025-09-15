package Maps;

import java.util.HashSet;
import java.util.Set;

public class TeamSet {
    private HashSet<Wrestler> wrestSet;

    public TeamSet() {
        wrestSet = new HashSet<>();
    }

    public void addWrestler(Wrestler w) {
        wrestSet.add(w);
    }

    public void removeWrestler(Wrestler w) {
        wrestSet.remove(w);
    }

    public Set<Wrestler> lightweight() {
        Set<Wrestler> light = new HashSet<>();
        for (Wrestler w : wrestSet) {
            if (w.getWeight() < 120) {
                light.add(w);
            }
        }
        return light;
    }

    public double avgWeight() {
        if (wrestSet.isEmpty()) {
            return 0.0;
        }

        int total = 0;
        for (Wrestler w : wrestSet) {
            total += w.getWeight();
        }
        return total / (double) wrestSet.size();
    }

    public HashSet<Wrestler> getWrestSet() {
        return wrestSet;
    }

    @Override
    public String toString() {
        return wrestSet.toString();
    }
}
