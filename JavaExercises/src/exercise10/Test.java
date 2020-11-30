package exercise10;

import java.io.*;
import java.util.Scanner;

public class Test {
    static Scanner scanner = new Scanner(System.in);
    static People people = new People();

    public static void addUser() {
        System.out.println("사용자의 이름을 입력해주세요.");
        String name = scanner.next();

        System.out.println("사용자의 전화번호를 입력해주세요.");
        String phoneNum = scanner.next();

        people.addPerson(new Person(name, phoneNum));
    }

    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("exercise10.dat"))){
            while(true){
                addUser();
                oos.writeObject(people);
                System.out.println("사용자를 더 추가하시겠습니까? (1 또는 0)");
                int wantAdd = scanner.nextInt();
                if(wantAdd != 1) break;
            }

            while(true){
                System.out.println("정보를 원하시는 사용자의 번호를 입력해주세요. 종료는 -1");
                int n = scanner.nextInt();
                if(n == -1) break;

                Person p = people.findPerson(n);
                System.out.println(p.getPhoneNum());
            }

        } catch (IOException e){
            System.out.println(e);
        }
    }
}
