package ДЗ;

public class Main {
    public static void main(String[] args){
        Market market = new Market();
        Human human1 = new Human("Игнат");
        Human human2 = new Human("Андрей");
        Human human3 = new Human("Сергей");

        market.enQueue(human1);
        market.enQueue(human2);
        market.enQueue(human3);

        System.out.println("Размер очереди: " + market.size());
        System.out.println("Первый человек в очереди: " + market.deQueue());
        System.out.println("Размер очереди gjckt elfktybz: " + market.size());

        Order order1 = new Order("Заказ 1");
        Order order1 = new Order("Заказ 2");

        market.placeOrder(order1);
        market.placeOrder(order2);

        market.update();
        market.update();
        market.update();
        market.update();
    }
}
