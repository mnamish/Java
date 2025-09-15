package Final;

public class MusicLibrary {
    private TreeNode root;

    public void insert(Song song) {
        root = insertRec(root, song);
    }

    private TreeNode insertRec(TreeNode node, Song song) {
        if (node == null) return new TreeNode(song);
        if (song.title.compareTo(node.data.title) < 0)
            node.left = insertRec(node.left, song);
        else
            node.right = insertRec(node.right, song);
        return node;
    }

    public void printInOrder() {
        printInOrderRec(root);
    }

    private void printInOrderRec(TreeNode node) {
        if (node != null) {
            printInOrderRec(node.left);
            System.out.println(node.data);
            printInOrderRec(node.right);
        }
    }
}

