package exercise06;

public class ScienceFiction extends Book{
    private final int lateFee = 600;

    public ScienceFiction(String title, String author) {
        super(title, author);
    }

    @Override
    public void getLateFees() {
        System.out.println("연체료는 : " + lateFee + " 원 입니다.");
    }
}
