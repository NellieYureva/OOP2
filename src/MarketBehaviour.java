
import java.util.Deque;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor);//входит в магазин

    void releaseFromMarket(Actor actor);//выходит из магазина

    void update(Deque<Product>productsDeque);//обновление состояиния магазина


}
