package package1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<File> files = new ArrayList<>();
        Directory directory = new Directory(files);

        Scanner scanner = new Scanner(System.in);
        directory.setName("dir1");
        System.out.println("You created a directory '" + directory.getName() + "'");

        directory.addFiles(new TextFile());
        directory.getFiles().get(0).setName("File1");
        System.out.println("'" + directory.getFiles().get(0).getName() + "' file has been created");

        directory.addFiles(new TextFile());
        directory.getFiles().get(1).setName("File2");
        System.out.println("'" + directory.getFiles().get(1).getName() + "' file has been created");

        directory.addFiles(new TextFile());
        directory.getFiles().get(2).setName("File3");
        System.out.println("'" + directory.getFiles().get(2).getName() + "' file has been created");

        //Візьмемо файл за іменем
        System.out.print("Enter the file name you want to get: ");
        String fileName = scanner.next();
        directory.getFileByName(fileName);
    }
}
