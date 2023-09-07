package HWs.HW_003;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        

        // Использование методов из интерфейсов
        dog.makeSound(); // Вывод: Собака гавкает.
        dog.play();      // Вывод: Собака играет.

        cat.makeSound(); // Вывод: Кот мяукает.
        
    }
}