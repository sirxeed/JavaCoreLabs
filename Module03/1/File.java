public class File {
    //Поля класу
    public String name;
    public String type;
    public String path;
    public boolean hidden = false;
    public boolean directory = false;

    //Конструктори
    File() {
        name = "NewFile";
        type = "tmp";
        path = "C:\\";
        directory = false;
    }

    File(String name, String type, String path) {
        this.name = name;
        this.type = type;
        this.path = path;
    }

    File(String name, boolean directory) {
        this.name = name;
        this.directory = true;
    }

    //Методи
    public void move(String pathNew) {
        //move algorithm
    }

    public void delete() {
        //delete algorithm
    }

    public void rename(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }
    
}
