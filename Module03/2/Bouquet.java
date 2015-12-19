public class Bouquet {
    //Поля класу
    public Flower[] flowers;
    public int quantity;

    //Конструктор
    Bouquet() {
        quantity = 0;
    }

    //Методи
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
