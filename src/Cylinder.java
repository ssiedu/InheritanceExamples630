public class Cylinder extends Shape {
    double height;
    public void setHeight(double h){
        height=h;
    }
    public void calculateArea() {
        double area=2*3.14*radius*height;
        System.out.println("Area of Cylinder : "+area);
    }
    
}
