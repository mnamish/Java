package Sets;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class mySet<T> implements Iterable<T> {
    private T[] elements;
    private int size;
    private static final int initialCapacity = 10;

    @SuppressWarnings("unchecked")
    public mySet() {
        elements = (T[]) new Object[initialCapacity];
        size = 0;
    }

    private void resize() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    private void shrink() {
        if (size <= elements.length / 4 && elements.length > initialCapacity) {
            int newCapacity = elements.length / 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    public void add(T value) {
        if (!contains(value)) {
            if (size == elements.length) {
                resize();
            }
            elements[size++] = value;
        }
    }

    public boolean contains(T value) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    public void remove(T value) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(value)) {
                elements[i] = elements[--size];
                elements[size] = null; // Avoid memory leak
                shrink(); // Shrink the array if needed
                return;
            }
        }
    }

    public int size() {
        return size;
    }

    public T[] getElements() {
        return Arrays.copyOf(elements, size);
    }

    public void addAll(mySet<T> other) {
        for (T element : other.getElements()) {
            add(element);
        }
    }

    public void retainAll(mySet<T> other) {
        int originalSize = size;
        for (int i = 0; i < originalSize; i++) {
            if (!other.contains(elements[i])) {
                remove(elements[i]);
                i--; // Adjust index after removal
            }
        }
    }

    public void removeAll(mySet<T> other) {
        for (T element : other.getElements()) {
            remove(element);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int current = 0;

            @Override
            public boolean hasNext() {
                return current < size;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return elements[current++];
            }
        };
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements, size));
    }
}