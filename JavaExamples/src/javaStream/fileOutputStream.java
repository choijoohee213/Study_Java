package javaStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputStream {
    public static void main(String[] args) {
        byte[] bs = new byte[26];
        byte date = 65;
        for(int i=0; i<bs.length; i++)
            bs[i] = date++;
        try(FileOutputStream fos = new FileOutputStream("output.txt")){
            fos.write(bs,2 ,10);
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("end");
    }
}
