package exercise07;

//배열을 받아서 지정된 숫자를 찾는 메소드 구현. 찾는 숫자가 없다면 예외발생.
public class ExceptionEx01 {
    public static int serachArray(int num, int[] array) throws NotFoundException {
        for(int i=0; i<array.length; i++){
            if(array[i] == num){
                 return i;
            }
        }
        throw new NotFoundException();
    }

    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};
        try{
            serachArray(6,intArray);
        } catch(NotFoundException e){
            System.out.println(e);
        } finally {
            System.out.println("end");
        }
    }
}

class NotFoundException extends Exception {
    public NotFoundException() {
        super("배열에서 해당 값을 찾을 수 없습니다.");
    }
}
