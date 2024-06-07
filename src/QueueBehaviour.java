import java.util.Deque;

public interface QueueBehaviour {

    void takeInQueue(Actor actor);

    void takeOrders(Deque <Product> productsDeque);// сделать заказ

    void giveOrders();// забрать заказы

    void releaseFromQueue(Actor actor);// выйти из очереди
}
