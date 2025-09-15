package Trees;

public class BookProblam_1 {



    
    public void createCompleteBinaryTree(int[] arr) {
        root = createCompleteCinaryTree(arr, 0);

    }

    public Node createCompleteCinaryTree(int[] arr, int start) {
        int size = arr.length;
        Node curr = new Node(arr[start]);
        int left = 2 * start + 1;
        int right = 2 * start + 2;

        if (left < size) {
            curr.left = createCompleteCinaryTree(arr, left);
        }
        if (right < size) {
            curr.right = createCompleteCinaryTree(arr, right);
        }
        return curr;
    }
    //testing code
    public static void main(String[] args) {
        BookProblam_1 tree = new BookProblam_1();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        tree.createCompleteBinaryTree(arr);
        t.printPreorder(t.root);
    }
}
