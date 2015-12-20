import java.util.ArrayList;

public class Directory extends File {
    /*
    //ArrayList<File> files = new ArrayList<File>();
    //files.add(new GraphicFile);
    */

    File[] files = new File[100];

    files[0] = new AudioFile;

    for (int i = 1; i <= 10; i++) {
        files[i] = new GraphicFile();
    }
}
