package Trees2;

public class Node {
    Comparable value;
    Node left, right;
    int count; // for handling duplicates (Tree 2)

    public Node(Comparable val) {
        value = val;
        left = right = null;
        count = 1;
    }

    public String toString() {
        return value.toString() + (count > 1 ? (" [" + count + "]") : "");
    }
}
