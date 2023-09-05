package HWs.HW_001;
public class Owner {
    private String name;

    /**
     * Конструктор класса Owner.
     *
     * @param name 
     */
    public Owner(String name) {
        this.name = name;
    }

    /**
     * Получает имя владельца.
     *
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает имя владельца.
     *
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
}
