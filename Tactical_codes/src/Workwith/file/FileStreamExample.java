package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamExample {
    public static void main(String args[]) {
        try {
            File myObj = new File("C:\\Users\\behda\\Documents\\PArent Document\\madarek\\covid\\sql\\testout.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
            try {

                FileOutputStream fout = new FileOutputStream("C:\\Users\\behda\\Documents\\PArent Document\\madarek\\covid\\sql\\testout.txt");
                //fout.write(65);
                String s = "Welcome to javaTpoint.";
                System.out.println("trying to writing to file");
                byte b[] = s.getBytes();//converting string into byte array
                fout.write(b);
                fout.close();
                System.out.println("success...");
            } catch (Exception e) {
                System.out.println(e);
            }
            try {
                FileInputStream fin = new FileInputStream("C:\\Users\\behda\\Documents\\PArent Document\\madarek\\covid\\sql\\testout.txt");
                int i = 0;
                System.out.println("trying to reading from file");
                while ((i = fin.read()) != -1) {
                    System.out.print((char) i);
                }
                fin.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
