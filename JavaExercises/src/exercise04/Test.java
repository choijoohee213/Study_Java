package exercise04;

//Person 클래스를 정의하고 Comparable 인터페이스를 구현
//Comparable을 이용하여 가장 키 큰 사람의 이름을 반환하는 메소드 구현
public class Test {
    public static String getMaximum(Person[] array){
        Person maxPerson = array[0];
        for(Person p : array){
            if(p.compareTo(maxPerson) == 1 ){
                maxPerson = p;
            }
        }
        return maxPerson.getName();
    }

    public static void main(String[] args) {
        Person[] personArray = new Person[5];

        personArray[0] = new Person("kim", 170);
        personArray[1] = new Person("choi", 150);
        personArray[2] = new Person("lee", 156);
        personArray[3] = new Person("park", 130);
        personArray[4] = new Person("son", 184);

        System.out.println(getMaximum(personArray));
    }
}
