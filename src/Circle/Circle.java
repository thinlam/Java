package Circle;

public class Circle {
    double radius ;
   public Circle(){
        radius= 1.0 ;
    }
    public Circle(double r){
        radius = r> 0 ? r : 1.0 ;
    }
    double findArea(){
        return Math.PI * radius * radius;
    }
    double findPerimeter(){
        return 2 * Math.PI * radius;
    }
}
