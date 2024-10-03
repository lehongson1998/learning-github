package B6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Father {
    private final int A = 123;
    private final String PATH = "C:\\SMBC\\learning-github\\git_log_time.log";

    public Father() {
    }

    public int getA() {
        return A;
    }

    public String getPath() {
        return PATH;
    }

    @Override
    public String toString() {
        return "Father{" +
                "A=" + A +
                ", PATH='" + PATH + '\'' +
                '}';
    }

    public static void main(String[] args) throws FileNotFoundException {
        try{
            Father f = new Father();
            File file = new File(f.PATH);
            System.out.println(f);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }catch (FileNotFoundException e) {
            System.out.print("File not found");
        }

    }
}
