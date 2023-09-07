package HWs.HW_003;

// Реализация интерфейса Animal
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Кот мяукает.");
    }
}