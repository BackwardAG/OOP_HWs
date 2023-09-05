package HWs.HW_001;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Василий", 4);
        Owner owner = new Owner("Сергей");

        cat.setOwner(owner);
        cat.greet();

        // Измененяем имя кота
        cat.setName("Зевс");
        cat.greet();
    }
}