package HWs.HW_002;

public class Rectangle {
    private double width;
    private double height;

    /**
     * 1. Конструктор без параметров, создает прямоугольник с шириной и высотой по умолчанию.
     */
    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }

    /**
     * 2. Конструктор, который принимает значения ширины и высоты и создает прямоугольник ними.
     *
     * @param width  ширина прямоугольника
     * @param height высота прямоугольника
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * 3. Получает ширину прямоугольника.
     *
     * @return ширина прямоугольника
     */
    public double getWidth() {
        return width;
    }

    /**
     * Устанавливает ширину прямоугольника.
     *
     * @param width ширина прямоугольника
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * 3. Получает высоту прямоугольника.
     *
     * @return высота прямоугольника
     */
    public double getHeight() {
        return height;
    }

    /**
     * Устанавливает высоту прямоугольника.
     *
     * @param height высота прямоугольника
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * 4. Вычисляет площадь прямоугольника.
     *
     * @return площадь прямоугольника
     */
    public double calculateArea() {
        return width * height;
    }

    /**
     * 5. Вычисляет периметр прямоугольника.
     *
     * @return периметр прямоугольника
     */
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}