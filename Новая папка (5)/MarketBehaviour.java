package ДЗ;

public interface MarketBehaviour {
    void placeOrder(Order order);   //Помещение заказа
    Order takeOrder();              // Взятие заказа
    boolean hasOrder();             //Проверка наличия заказа
}
