package exercise05;

//Shape 클래스는 TwoDimShape 클래스와 ThreeDimShape 클래스를 자식으로 둔다.
//TwoDimShape 클래스는 2차원도형을 나타내며 getArea()라는 메소드를 가짐
//ThreeDimShape 클래스는 3차원도형을 나타내며 getVolume()라는 메소드를 가짐
//Rectangle 과 Triangle 클래스는 TwoDimShape 클래스를 상속받고, Cube 와 Sphere 클래스는 ThreeDimShape 클래스를 상속받음.
//다양한 도형들을 Shape 배열에 저장하고 2차원도형이면 getArea()를, 3차원도형이면 getVolume()를 호출함.
public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Triangle();
        shapes[1] = new Rectangle();

        shapes[2] = new Cube();
        shapes[3] = new Sphere();

        for(Shape s : shapes){
            getShapeArea(s);
        }
    }

    public static void getShapeArea(Shape shape) {
        if(shape instanceof TwoDimshape){
            ((TwoDimshape)shape).getArea();
        }
        else if(shape instanceof ThreeDimShape){
            ((ThreeDimShape)shape).getVolume();
        }
    }
}
