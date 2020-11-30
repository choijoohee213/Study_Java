package exercise08;

//제네릭 메소드와 제네릭 클래스 구현
public class Test {
    public static void main(String[] args) {
        Integer[] integers = {1,2,3,4,5};
        MyMath<Number> math = new MyMath<>(integers);
        System.out.println(math.getAverage());

        Double[] doubles = {1.5,2.5,3.5,4.5,5.5};
        MyMath<Double> math1 = new MyMath<>(doubles);
        System.out.println(math1.getAverage());

        a(new Integer(5));
        a(new String("hello"));

    }

    public static<T> void a(T obj) {
        System.out.println(obj.getClass().getName());
    }

}