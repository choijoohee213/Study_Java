package exercise06;

public class Poet extends Book{
    private final int lateFee = 200;

    public Poet(String title, String author) {
        super(title, author);
    }


    @Override
    public void getLateFees() {
        System.out.println("연체료는 : " + lateFee + " 원 입니다.");
    }
}
