package DeleteFile;

import java.io.File;
import java.io.IOException;

public class DeleteFileExample {
    public static void deleteFile(File file) {
        System.out.println("removing " + file.getAbsoluteFile());
        if (file.isFile()) {
            file.delete();
        }else if (file.isDirectory()) {
            File[] files = file.listFiles();
            assert files != null;
            for (File f : files) {
                deleteFile(f);
            }
            file.delete();
        }
    }
    public static void main(String[] args) throws IOException {
        File f0 = new File("C:\\SMBC\\learning-github\\Lesson3\\src\\DeleteFile\\F0");
        File f1 = new File("C:\\SMBC\\learning-github\\Lesson3\\src\\DeleteFile\\F1");
        File f2 = new File("C:\\SMBC\\learning-github\\Lesson3\\src\\DeleteFile\\demofile.txt");

        deleteFile(f0);
        f1.deleteOnExit();
        if (!f2.exists()){
            f2.createNewFile();
        }else {
            f2.deleteOnExit();
        }
    }
}
