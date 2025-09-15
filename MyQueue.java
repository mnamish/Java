public interface MyQueue<E>
{  
   //Tests if this stack is empty.
    public boolean isEmpty();
   
    //Inserts the specified element into this queue
    public boolean offer(E item);
   
   //Retrieves and removes the head of this queue,
   //or returns null if this queue is empty.
   public E poll();
 
   //Retrieves, but does not remove, the head of this queue,
   //or returns null if this queue is empty
   public E peek();
   
   public String toString();
}