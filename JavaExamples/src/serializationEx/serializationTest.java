package serializationEx;

import java.io.*;

class Person implements Serializable {
    String name;
    transient String title;

    public Person() {}
    public Person(String name, String title){
        this.name = name;
        this.title = title;
    }

    @Override
    public String toString() {
        return name + "," + title;
    }

}

public class serializationTest {
    public static void main(String[] args) {
        Person personlee = new Person("Lee", "Manager");

        try(FileOutputStream fos = new FileOutputStream("serial.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(personlee);
        } catch (IOException e){
            System.out.println(e);
        }

        try(FileInputStream fis = new FileInputStream("serial.dat");
        ObjectInputStream ois = new ObjectInputStream(fis)){
            Object obj = ois.readObject();
            if(obj instanceof Person){
                Person p = (Person)obj;
                System.out.println(p);
            }
        } catch( Exception e){
            System.out.println(e);
        }
    }
}
