package exercise01;

import java.util.Scanner;

//구의 반지름을 입력받아 부피 출력하기
public class CalculateVolume {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    float radius = scanner.nextFloat();
        float volume = radius * radius * radius * 4 / 3;
	    System.out.println(volume);
    }
}
