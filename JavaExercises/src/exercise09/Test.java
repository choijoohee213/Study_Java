package exercise09;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//정수가 문자열의 형태로 들어있는 파일을 읽어서 오름차순으로 정렬한 후 다시 문자열의 형태로 파일에 쓰는 프로그램
public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("exercise9.txt")))){
            String str;
            while((str = br.readLine()) != null){
                list.add(Integer.parseInt(str));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(list);
        try(BufferedWriter br = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("exercise9_2.txt")))){
            String str;
            for(int item : list){
                br.write("" + item + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
