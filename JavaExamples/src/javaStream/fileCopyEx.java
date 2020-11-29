package javaStream;

import java.io.*;

public class fileCopyEx {
    public static void main(String[] args) {
        long ms = 0;

        try(FileInputStream fis = new FileInputStream("a.exe");
            FileOutputStream fos = new FileOutputStream("b.exe");
            BufferedInputStream bi = new BufferedInputStream(fis);
            BufferedOutputStream bo = new BufferedOutputStream(fos)) {
            ms = System.currentTimeMillis();
            int i;
            while((i=bi.read()) != -1){
                bo.write(i);
            }
            ms = System.currentTimeMillis() - ms;
        } catch (IOException e){
            System.out.println(e);
        }
        System.out.println(ms);
    }
}
