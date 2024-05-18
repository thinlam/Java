package Circle;

public class Circle {
    private double radius ;
    public Circle(){
        radius= 1.0 ;
    }
    public Circle(double r){
        //radius = r> 0 ? r : 1.0 ;
        setRadius(r);
    }
    Circle(Circle c){
        radius = c.radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double r){
        radius = r > 0 ? r : 1.0 ;
    }
    public double findArea(){
        return radius * radius * Math.PI ;
    }
    public double findPerimeter(){
        return 2 * Math.PI * radius;
    }
}
