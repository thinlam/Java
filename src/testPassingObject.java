import Circle.Circle;

public class testPassingObject {


    public static void main(String[] args) {
        Circle myCircle = new Circle();
        int n =5 ;
        System.out.println("Truoc khi goi ham \n");
        System.out.println("\n" + "Bán kính là" + myCircle.getRadius());
        System.out.println("\n n là " + n + "\n");
        printAreas(myCircle, n);
        System.out.println("sau khi gọi hàm\n");
        System.out.println("\n"+ "bán kính là" + myCircle.getRadius());
        System.out.println("\n n là "+ n);

        //System.out.println("Dien tich duong tron co ban kinh " + myCircle.getRadius() + "la"+ myCircle.findArea());


    }
    public static void printAreas(Circle c, int n ){
        System.out.println("bán kính \t\t Diện tích");
        while(n>=1){
            System.out.println(c.getRadius() + "\t\t" + c.findArea());
            c.setRadius(c.getRadius() + 1);
            n--;
        }

    }


}
