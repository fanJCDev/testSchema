package file;

import java.io.*;

public class FileBufferedExample {
    public static void main(String args[]) throws Exception {
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
                BufferedOutputStream bout = new BufferedOutputStream(fout);
                String s = "Welcome to javaTpoint.";
                System.out.println("trying to writing to file");
                byte b[] = s.getBytes();//converting string into byte array
                bout.write(b);
                bout.flush();
                bout.close();
                fout.close();
                System.out.println("success...");
            } catch (Exception e) {
                System.out.println(e);
            }
            try {
                FileInputStream fin = new FileInputStream("C:\\Users\\behda\\Documents\\PArent Document\\madarek\\covid\\sql\\testout.txt");
                BufferedInputStream bin = new BufferedInputStream(fin);
                int i = 0;
                System.out.println("trying to reading from file");
                while ((i = bin.read()) != -1) {
                    System.out.print((char) i);
                }
                bin.close();
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
