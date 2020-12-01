package exercise12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HangmanGame {
    static List<String> wordList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static String answer = "";

    public static List<String> loadFile(){
        String str;
        List<String> list = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("sample.txt")))){
            while((str = br.readLine()) != null){
                list.add(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static String getAlphabet(){
        System.out.print("문자열을 입력하시오 : ");
        System.out.println(answer);
        System.out.print("\n글자를 추측하시오 : ");
        String alphabet = "" + scanner.next().charAt(0);
        return alphabet;
    }

    public static String validate(String word, String alphabet) {
        if(!word.contains(alphabet))
            return answer;

        String result = "";
        for(int i=0, j=0; i<word.length(); i++, j+=2){
            String str = answer.charAt(j) + "";
            if(!str.equals("_")) result = result + str + " ";
            else if((word.charAt(i) + "").equals(alphabet)){
                result = result + alphabet + " ";
            }
            else {
                result = result + "_ ";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        wordList = loadFile();

        int count = 0;
        int randomIndex = (int)(Math.floor(Math.random() * wordList.size()));
        String word = wordList.get(randomIndex);
        for(int i=0; i<word.length(); i++){
            answer = answer + "_ ";
        }

        while(answer.contains("_")){
            count++;
            String alphabet = getAlphabet();
            answer = validate(word, alphabet);
        }
        System.out.println("\n" + answer + "정답! (횟수 : " + count + ")");
    }
}
