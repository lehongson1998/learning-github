package FileInJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File folder1 = new File("Lesson3/src/FileInJava/main.txt");
        File folder2 = new File("Lesson3/src/FileInJava10");
        System.out.println("folder1 already exists: " + folder1.exists());
        System.out.println("folder2 already exists: " + folder2.exists());

        Scanner sc = new Scanner(folder1);
        String line = "";
        if (sc.hasNextLine()) {
            line = sc.nextLine();
        }
        System.out.println(line);

        File d1 = new File("Lesson3/src/FileInJava/directory_1");
        if (!(d1.exists())) {
            d1.mkdir();
        }else {
            System.out.println("Directory already exists: " + d1.exists());
        }

        File d2 = new File("Lesson3/src/FileInJava/directory_1/directory_2/directory_3/directory_4");
        if (!(d2.exists())) {
            d2.mkdirs();
        }else {
            System.out.println("Directory already exists: " + d2.exists());
        }

        File file1 = new File("Lesson3/src/FileInJava/directory_1/main.txt");
        if (!(file1.exists())) {
            try {
                file1.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println("File already exists: " + file1.exists());
        }
    }
}
