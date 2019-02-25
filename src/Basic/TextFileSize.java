package Basic;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextFileSize {

    public static void main(String[] args) {

        System.out.println("/home/michael/Pulpit/SQL.txt : " + new File("SQL.txt").length() + " bytes");
        System.out.println("/home/michael/Pulpit/Dependencies.txt : " + new File("Dependencies.txt").length() + " bytes");


        File file = new File("/home/michael/Pulpit/SQL.txt");
        if (file.exists()) {
            System.out.println(file.getAbsolutePath()+":"+file.length());
        }else {
            System.out.println(12);
        }

    }

}
