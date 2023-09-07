package HWs.HW_003;

// Реализация интерфейса Pet
class Dog implements Pet {
    @Override
    public void makeSound() {
        System.out.println("Собака гавкает.");
    }

    @Override
    public void play() {
        System.out.println("Собака играет.");
    }
}