package hw2;

public interface QueueBehaviour {
    void takeInQueue(Actor actor);
    void makeOrders();
    void takeOrders();
    void releaseFromQueue();
}
