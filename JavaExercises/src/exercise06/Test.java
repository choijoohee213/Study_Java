package exercise06;

//Book클래스를 만들고 equals() 메소드를 재정의하여 관리번호가 동일하면 동일한 책으로 간주.
//Novel,Poet,ScienceFiction 클래스는 Book을 상속받고 getLateFees() 메소드를 재정의함
public class Test {
    public static void main(String[] args) {
        Book b1 = new ScienceFiction("과학소설", "choi");
        Book b2 = new Novel("소설", "kim");
        Book b3 = new Poet("시집", "park");

        b1.getLateFees();
        b2.getLateFees();
        b3.getLateFees();

        System.out.println(b1.equals(b2));
    }
}
