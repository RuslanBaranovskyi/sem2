package ДЗ;

public interface QueueBehaviour {
    void enQueue(Human human); // Добавление человека в очередь

    Human deQueue(); //удаление человека из очереди
    
    boolean isEmpty(); // Проверка на пустоту

    int size(); // размер очереди
}
