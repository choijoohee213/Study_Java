package exercise06;

public class Novel extends Book{
    private final int lateFee = 300;

    public Novel(String title, String author) {
        super(title, author);
    }

    @Override
    public void getLateFees() {
        System.out.println("연체료는 : " + lateFee + " 원 입니다.");
    }
}
