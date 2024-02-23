package Q4.Q1;
public class Rectangle {

    public void area(int height,int width){
        int area=height*width;
        System.out.println(area);
    }

    public static void main(String[] args) {
        
        Rectangle obj1=new Rectangle();
        obj1.area( 25, 1);
    }
}