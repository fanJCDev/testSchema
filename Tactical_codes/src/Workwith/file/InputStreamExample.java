package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class InputStreamExample {
    public static void main(String args[]) throws Exception {
        try {
            File myObj1 = new File("C:\\Users\\behda\\Documents\\PArent Document\\madarek\\covid\\sql\\testout1.txt");
            if (myObj1.createNewFile()) {
                System.out.println("File created: " + myObj1.getName());
            } else {
                System.out.println("File already exists.");
            }
            try {
                File myObj2 = new File("C:\\Users\\behda\\Documents\\PArent Document\\madarek\\covid\\sql\\testout2.txt");
                if (myObj2.createNewFile()) {
                    System.out.println("File created: " + myObj2.getName());
                } else {
                    System.out.println("File already exists.");
                }
                FileInputStream input1 = new FileInputStream("C:\\Users\\behda\\Documents\\PArent Document\\madarek\\covid\\sql\\testout1.txt");
                FileInputStream input2 = new FileInputStream("C:\\Users\\behda\\Documents\\PArent Document\\madarek\\covid\\sql\\testout2.txt");
                SequenceInputStream inst = new SequenceInputStream(input1, input2);
                //FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
                int j;
                while ((j = inst.read()) != -1) {
                    System.out.print((char) j);
                }
                inst.close();
                //fout.close();
                input1.close();
                input2.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
