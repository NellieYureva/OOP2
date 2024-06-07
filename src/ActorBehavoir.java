public interface ActorBehavoir { //поведение субъекта
    void setMakeOrder(boolean flag); // метод устанавливающий готовность сделать заказ

    void setTakeOrder(boolean flag); // метод, который устатнавливает сделал ли уже заказ

    boolean isMakeOrder();

    boolean isTakeOrder();

}
