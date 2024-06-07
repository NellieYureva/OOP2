// Реализовать класс Market и все методы, которые он обязан реализовывать Методы из интерфейса
// QueueBehaviour, имитируют работу очереди, MarketBehaviour – помещает и удаляет человека из очереди,
// метод update – обновляет состояние магазина (принимает и отдает заказы)

import java.util.*;

public class Market implements MarketBehaviour, QueueBehaviour {

  protected List<Actor> actors = new ArrayList<>();
  protected Deque<Actor> actorsDeque = new ArrayDeque<>();
  public Deque<Product> productsDeque = new ArrayDeque<>();

  @Override
  public void acceptToMarket(Actor actor) {
    actors.add(actor);
    System.out.println(actor.getName() + " зашел в магазин, в магазине находятся: " + actors);
            
  }
   
   @Override
  public void takeInQueue(Actor actor) {
    actorsDeque.add(actor);
    System.out.println(actor.getName() + " всстал в очередь, в очереди находятся: " + actorsDeque);
    
  }

  @Override
  public void releaseFromQueue(Actor actor) {
    System.out.println(actorsDeque.pollFirst().getName() + " покинул очередь, в очереди находятся: " + actorsDeque);
  
  }

  @Override
  public void giveOrders() {
    actorsDeque.peekFirst().isMakeOrder();
    System.out.println(actorsDeque.peekFirst().getName() + " сделал заказ");
    
  }

  @Override
  public void takeOrders(Deque <Product> productsDeque) {
    actorsDeque.peekFirst().isTakeOrder();
    System.out.println(actorsDeque.peekFirst().getName() + " забрал заказ: " + productsDeque.peekFirst());
    productsDeque.pop();
        
  }

  @Override
  public void releaseFromMarket(Actor actor) {
    actors.remove(0);
    System.out.println(actor.getName() + " покинул магазин, в магазине находятся: " + actors);
    
  }

  @Override
  public void update (Deque<Product>productsDeque) {
    System.out.println("Market: Продукты в наличии:" + productsDeque);

  }

  
}
