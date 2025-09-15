public interface DoubleList<E> {
		 public void addLast(Object o);
		 public void addFirst(Object o);
		 public void clear();
		 public Object getFirst();
		 public Object getLast();
		 public Object removeFirst ();
		 public Object removeLast ();
		 public String toString();
		 public int size();
		 public boolean isEmpty();
		 public boolean remove(Object o);
		}