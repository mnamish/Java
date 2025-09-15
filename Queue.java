package Final;

public class Queue {
    private class QNode {
        Song data;
        QNode next;

        QNode(Song data) {
            this.data = data;
        }
    }

    private QNode front, rear;

    public void enqueue(Song song) {
        QNode node = new QNode(song);
        if (rear == null) {
            front = rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
    }

    public Song dequeue() {
        if (front == null) return null;
        Song data = front.data;
        front = front.next;
        if (front == null) rear = null;
        return data;
    }

    public void printQueue() {
        QNode curr = front;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}

