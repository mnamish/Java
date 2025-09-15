package Maps;

import java.util.HashMap;

public class TeamMap {
    private HashMap<Integer, TeamSet> wrestMap;

    public TeamMap() {
        wrestMap = new HashMap<>();
        for (int i = 0; i <= 9; i++) {
            wrestMap.put(i, new TeamSet());
        }
    }

    public int getWeightGroup(Wrestler w) {
        int weight = w.getWeight();
        return Math.min(9, (weight - 100) / 10);
    }

    public void addWrestler(Wrestler w) {
        int group = getWeightGroup(w);
        wrestMap.get(group).addWrestler(w);
    }

    public void changeWeightGroup(Wrestler w, int newGroup) {
        int currentGroup = getWeightGroup(w);
        if (newGroup < currentGroup) {
            System.out.println("Request denied. Cannot move to a lower weight group becasue the Wrester gains an advantage over the other Wrestlers in the new Group!");
            return;
        }
        wrestMap.get(currentGroup).removeWrestler(w);
        wrestMap.get(newGroup).addWrestler(w);
    }

    public void changeWeight(Wrestler w, int newWeight) {
        int oldGroup = getWeightGroup(w);
        wrestMap.get(oldGroup).removeWrestler(w);
        w.setWeight(newWeight);
        int newGroup = getWeightGroup(w);
        wrestMap.get(newGroup).addWrestler(w);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int group : wrestMap.keySet()) {
            sb.append("Group ").append(group).append(": ").append(wrestMap.get(group).toString()).append("\n");
        }
        return sb.toString();
    }
}