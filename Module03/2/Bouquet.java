public class Bouquet {
    //Поля класу
    private Flower[] flowers = new Flower[21];
    private int quantity;

    //Конструктор
    Bouquet() {
        quantity = 0;
    }

    //Методи
    //Геттери і сеттери
    public Flower[] getFlowers() {
        return flowers;
    }

    public int getQuantity() {
        return quantity;
    }

    //Логіка
    public void smell() {
        //Smell algorithm
    }

    public void present() {
        //Present algorithm
    }

    public void add(Flower flower) {
        flowers[quantity] = flower;
        quantity += 1;
    }
}
