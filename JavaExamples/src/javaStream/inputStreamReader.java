package javaStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputStreamReader {
    public static void main(String[] args) {
        try(InputStreamReader fis = new InputStreamReader(new FileInputStream("b.txt"))){
            int i=0;
            while((i=fis.read()) != -1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
