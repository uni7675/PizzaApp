package utli;

import java.io.*;

public class FileUtils {

//    public static void writeToFile(String directory, String fileName, Object data) throws IOException {
//        File file = new File(directory, fileName);
//        if (!file.exists()) {
//            file.createNewFile();
//        }
//
//        FileOutputStream fos = new FileOutputStream(fileName);
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(data);
//        oos.flush();
//        oos.close();
//        fos.close();
//    }

    public static Object readFromFile(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream oi = new ObjectInputStream(fis);
        Object data = oi.readObject();
        oi.close();
        fis.close();
        return data;
    }
}
