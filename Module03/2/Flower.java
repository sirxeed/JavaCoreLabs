public class Flower {
    //Поля класу
    public int height;
    public int color;

    //Конструктори
    Flower() {
        height = 10;
        color = 0xff0000;
    }

    Flower(int height, int color) {
        this.height = height;
        this.color = color;
    }

    //Методи класу
    public void cut() {
        //Cut algorithm
    }

    public void smell() {
        //Smell algorithm
    }
}
