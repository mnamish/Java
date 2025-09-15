package Trees2;

public class TreeTester {
    public static void main(String[] args) {
        Tree tree = new Tree();

        for (int val : new int[]{50, 25, 75, 10, 40, 60, 80, 5, 20, 30, 45, 55, 70, 90}) {
            tree.add(val);
        }

        System.out.println("In-order:");
        tree.inOrder();

        System.out.println("Pre-order:");
        tree.preOrder();

        System.out.println("Post-order:");
        tree.postOrder();

        System.out.println("Reverse-order:");
        tree.revOrder();

        System.out.println("Find 45: " + tree.find(45));
        System.out.println("Find 100: " + tree.find(100));

        System.out.println("Smallest: " + tree.getSmallest());
        System.out.println("Largest: " + tree.getLargest());

        System.out.println("Number of leaves: " + tree.getNumLeaves());
        System.out.println("Number of levels: " + tree.getNumLevels());
        System.out.println("Tree width: " + tree.getWidth());
        System.out.println("Number of nodes: " + tree.getNumNodes());

        System.out.println("Is full tree? " + tree.isFullTree());
        System.out.println("Is complete tree? " + tree.isCompleteTree());

        Tree coinTree = new Tree();

            coinTree.add(new Coin("Penny", 1));
            coinTree.add(new Coin("Nickel", 5));
            coinTree.add(new Coin("Dime", 10));
            coinTree.add(new Coin("Nickel", 5));  // Duplicate

            System.out.println("=== Coin Tree ===");
            System.out.println(coinTree.toString());

            coinTree.delete(new Coin("Nickel", 5));
            System.out.println("After deleting one Nickel:");
            System.out.println(coinTree.toString());


    }
}

