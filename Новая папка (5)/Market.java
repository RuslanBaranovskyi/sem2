import java.util.LinkedList;
import java.util.Queue;

package ДЗ;

public class Market implements QueueBehaviour, MarketBehaviour, update{

    private Queue queue;
    private Queue orders;

    public Market(){
        queue = new LinkedList<>();
        orders = new LinkedList<>();
    }

    @Override
    public void placeOrder(Order order) {
       
    }

    @Override
    public Order takeOrder() {
        
    }

    @Override
    public boolean hasOrder() {
        
    }

    @Override
    public void enQueue(Human human) {
        
    }

    @Override
    public Human deQueue() {
       
    }

    @Override
    public boolean isEmpty() {
        
    }

    @Override
    public int size() {
        
    }

    public Queue getQueue() {
        return queue;
    }

    public void setQueue(Queue queue) {
        this.queue = queue;
    }

    public Queue getOrders() {
        return orders;
    }

    public void setOrders(Queue orders) {
        this.orders = orders;
    }
    
}
