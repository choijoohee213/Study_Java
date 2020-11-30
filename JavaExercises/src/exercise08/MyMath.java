package exercise08;
public class MyMath<T extends Number> {

    private T[] array;

    public MyMath(T[] array) {
        this.array = array;
    }

    public<T extends Number> double getAverage() {
        double result = 0;
        for(int i=0; i<array.length; i++){
            result += Double.parseDouble(String.valueOf(array[i]));
        }

        result /= array.length;
        return result;
    }
}