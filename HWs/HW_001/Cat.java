package HWs.HW_001;

public class Cat {
    private String name;
    private int age;
    private Owner owner;

    /**
     * Конструктор класса Cat.
     *
     * @param name имя кота
     * @param age  возраст кота
     */
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Получает имя кота.
     *
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * Определяет имя кота.
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получает возраст кота.
     *
     * @return 
     */
    public int getAge() {
        return age;
    }

    /**
     * Определяет возраст кота.
     *
     * @param age 
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Получает владельца кота.
     *
     * @return 
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * Определяет владельца кота.
     *
     * @param owner 
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * Выводит приветствие на консоль.
     * Если у кота есть владелец, в приветствие будет включено имя его владельца.
     */
    public void greet() {
        if (owner != null) {
            System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет). Мой владелец - " + owner.getName() + ".");
        } else {
            System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет).");
        }
    }
}