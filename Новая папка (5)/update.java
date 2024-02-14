package ДЗ;

public void update {
    if (hasOrder()){
        Order order = takeOrder();
        System.out.println("Заказа обработан" + order.ToString());
    }
    else{
        System.out.println("Очередь заказов пуста");
    }
}
