package genericEx;

public class Main {
    public static void main(String[] args){
        ThreeDPrinter<Powder> tp = new ThreeDPrinter<Powder>();
        tp.setMaterial(new Powder());

        Powder powder = tp.getMaterial();
        System.out.println(tp);
        System.out.println(tp.toString());
        System.out.println(powder);
        System.out.println(powder.toString());
    }
}