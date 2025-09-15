package Trees2;

public class Tree {
    private Node root;

    public void add(Comparable val) {
        root = add(val, root);
    }

    private Node add(Comparable val, Node current) {
        if (current == null)
            return new Node(val);

        int cmp = val.compareTo(current.value);
        if (cmp < 0)
            current.left = add(val, current.left);
        else if (cmp > 0)
            current.right = add(val, current.right);
        else
            current.count++;

        return current;
    }

    public boolean find(Comparable val) {
        return find(val, root);
    }

    private boolean find(Comparable val, Node current) {
        if (current == null)
            return false;
        int cmp = val.compareTo(current.value);
        if (cmp == 0)
            return true;
        else if (cmp < 0)
            return find(val, current.left);
        else
            return find(val, current.right);
    }

    public Comparable getSmallest() {
        if (root == null) return null;
        Node curr = root;
        while (curr.left != null)
            curr = curr.left;
        return curr.value;
    }

    public Comparable getLargest() {
        if (root == null) return null;
        Node curr = root;
        while (curr.right != null)
            curr = curr.right;
        return curr.value;
    }

    public int getNumLeaves() {
        return getNumLeaves(root);
    }

    private int getNumLeaves(Node current) {
        if (current == null) return 0;
        if (current.left == null && current.right == null) return 1;
        return getNumLeaves(current.left) + getNumLeaves(current.right);
    }

    public int getNumLevels() {
        return getNumLevels(root);
    }

    private int getNumLevels(Node current) {
        if (current == null) return 0;
        return 1 + Math.max(getNumLevels(current.left), getNumLevels(current.right));
    }

    public int getWidth() {
        int maxWidth = 0;
        int height = getNumLevels();
        for (int i = 1; i <= height; i++) {
            int width = getLevelWidth(root, i);
            maxWidth = Math.max(maxWidth, width);
        }
        return maxWidth;
    }

    private int getLevelWidth(Node node, int level) {
        if (node == null) return 0;
        if (level == 1) return 1;
        return getLevelWidth(node.left, level - 1) + getLevelWidth(node.right, level - 1);
    }

    public int getNumNodes() {
        return getNumNodes(root);
    }

    private int getNumNodes(Node current) {
        if (current == null) return 0;
        return 1 + getNumNodes(current.left) + getNumNodes(current.right);
    }

    public boolean isFullTree() {
        return isFullTree(root);
    }

    private boolean isFullTree(Node node) {
        if (node == null) return true;
        if ((node.left == null) != (node.right == null)) return false;
        return isFullTree(node.left) && isFullTree(node.right);
    }

    public boolean isCompleteTree() {
        return isCompleteTree(root, 0, getNumNodes());
    }

    private boolean isCompleteTree(Node node, int index, int totalNodes) {
        if (node == null) return true;
        if (index >= totalNodes) return false;
        return isCompleteTree(node.left, 2 * index + 1, totalNodes) &&
                isCompleteTree(node.right, 2 * index + 2, totalNodes);
    }

    public void inOrder() {
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node + " ");
            inOrder(node.right);
        }
    }

    public void preOrder() {
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node node) {
        if (node != null) {
            System.out.print(node + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder() {
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node + " ");
        }
    }

    public void revOrder() {
        revOrder(root);
        System.out.println();
    }

    private void revOrder(Node node) {
        if (node != null) {
            revOrder(node.right);
            System.out.print(node + " ");
            revOrder(node.left);
        }
    }

    public void delete(Comparable value) {
        root = delete(root, value);
    }

    private Node delete(Node current, Comparable value) {
        if (current == null) return null;

        int cmp = value.compareTo(current.value);

        if (cmp < 0) {
            current.left = delete(current.left, value);
        } else if (cmp > 0) {
            current.right = delete(current.right, value);
        } else {
            if (current.count > 1) {
                current.count--;  // Handle duplicates
                return current;
            }

            // Node with one or no child
            if (current.left == null) return current.right;
            if (current.right == null) return current.left;

            // Node with two children – get smallest from right
            Node successor = getMin(current.right);
            current.value = successor.value;
            current.count = successor.count;
            successor.count = 1; // So we delete only one instance
            current.right = delete(current.right, successor.value);
        }

        return current;
    }

    private Node getMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        toString(root, sb);
        return sb.toString();
    }

    private void toString(Node node, StringBuilder sb) {
        if (node != null) {
            toString(node.left, sb);
            sb.append(node.value.toString());
            if (node.count > 1) sb.append(" (x").append(node.count).append(")");
            sb.append(", ");
            toString(node.right, sb);
        }
    }


}
