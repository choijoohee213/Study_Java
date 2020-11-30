package exercise11;

import java.io.FileInputStream;
import java.io.IOException;

//두 개의 텍스트 파일을 읽어와서 내용이 일치하는지 검사. 바이트 단위로 비교.
public class Test {
    public static void main(String[] args) {
        byte[] bs = new byte[10];
        boolean isSame = true;

        try(FileInputStream fis1 = new FileInputStream("exercise11_1.txt");
            FileInputStream fis2 = new FileInputStream("exercise11_2.txt")){
            int i,j;
            while((i = fis1.read(bs)) != -1 && (j = fis2.read(bs)) != -1){
                if(bs[i-1] != bs[j-1]){
                    isSame = false;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(isSame);
    }
}
