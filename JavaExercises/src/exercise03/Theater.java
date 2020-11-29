package exercise03;

import java.util.Scanner;

public class Theater {
    int[] seats = new int[10];
    Scanner scanner = new Scanner(System.in);

    public void reserve() {
        System.out.print("좌석을 예약하시겠습니까?(1 또는 0) ");
        int want = scanner.nextInt();
        if(want != 1) return;

        System.out.println("\n현재 예약상태는 다음과 같습니다.");
        showSeats();

        while(true) {
            System.out.print("\n몇번째 좌석을 예약하시겠습니까? ");
            int seatNum = scanner.nextInt();

            if (seatNum < 1 || seatNum > seats.length) {
                System.out.println("\n선택하신 좌석은 존재하지 않는 좌석입니다. 다시 선택해주세요.");
            } else if (seats[seatNum - 1] == 1) {
                System.out.println("\n선택하신 좌석은 이미 예약되었습니다. 다시 선택해주세요.");
            } else {
                System.out.println("\n예약되었습니다.");
                System.out.print("좌석을 예약하시겠습니까?(1 또는 0) ");
                if (scanner.nextInt() == 1) seats[seatNum - 1] = 1;
                break;
            }
        }
        showSeats();
    }

    private void showSeats() {
        System.out.println("------------------------------------");
        System.out.println("1 2 3 4 5 6 7 8 9 10");
        System.out.println("------------------------------------");
        for(int i=0; i< seats.length; i++){
            System.out.print(seats[i] + " ");
        }
    }
}
