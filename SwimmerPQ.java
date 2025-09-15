package School;

import java.util.PriorityQueue;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class SwimmerPQ  
{
    private PriorityQueue<Swimmer> pQueue;

    public SwimmerPQ()
    {
        pQueue = new PriorityQueue<Swimmer>();
    }

    public void add(Swimmer obj)
    {
        pQueue.add(obj);
    }
    
    public Swimmer getMin()
    {
        return pQueue.peek();
    }
    
    public Swimmer removeMin()
    {
        return pQueue.poll();
    }
    
    public String getNaturalOrder()
    {
        List<Swimmer> list = new ArrayList<>(pQueue);
        Collections.sort(list);
        StringBuilder output = new StringBuilder();
        for (Swimmer swimmer : list) {
            output.append(swimmer.toString()).append(" ");
        }
        return output.toString().trim();        
    }

    @Override
    public String toString()
    {
        return pQueue.toString();
    }
}
