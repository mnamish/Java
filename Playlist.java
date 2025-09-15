package Final;

public class Playlist {
    private Node head;

    public void addSong(Song song) {
        Node newNode = new Node(song);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null)
                curr = curr.next;
            curr.next = newNode;
        }
    }

    public void printSongs() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
           curr = curr.next;
        }
    }
}

