package exercise02;

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        //날짜를 두가지 방법으로 출력하기
        Date date = new Date(2020, 11, 29);
        date.print1();
        date.print2();

        //문자열을 입력받아 거꾸로 출력하기
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
