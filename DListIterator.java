public class DListIterator {
private DListNode current;
private DListNode previous;
private DLinkedList myList;
private boolean canRemove; // for remove() method. true if OK to call

// remove()

public DListIterator(DLinkedList list) {
myList = list;
current = null;
previous = null;
canRemove = false;
}
public String toString() {}
public boolean hasPrevious() {}
public boolean hasNext() {}
public Object next() {}
public Object previous() {}
public void remove() {}
public void add(Object element) {}
public void set(Object element) {}

}