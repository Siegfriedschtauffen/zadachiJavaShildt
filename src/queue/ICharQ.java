package queue;

// Интерфейс для очереди символов.
public interface ICharQ {
    // поместить символ в очередь
    void put(char ch);

    // извлечь символ из очереди
    char get();

    void reset();
}


