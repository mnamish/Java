package Final;

public class Stack {
    private class SNode {
        Song data;
        SNode next;

        SNode(Song data) {
            this.data = data;
        }
    }

    private SNode top;

    public void push(Song song) {
        SNode node = new SNode(song);
        node.next = top;
        top = node;
    }

    public Song pop() {
        if (top == null) return null;
        Song song = top.data;
        top = top.next;
        return song;
    }

    public void printStack() {
        SNode curr = top;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}

