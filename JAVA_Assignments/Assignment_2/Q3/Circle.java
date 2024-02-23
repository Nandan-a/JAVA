package Q3;
public class Circle extends Shape{

     void type(String shape){
        System.out.println("Type of shape is "+shape);

    }
    public static void main(String[] args) {
        Circle s1 = new Circle();
        String circle="circle";
        s1.type(circle);
    }
}
