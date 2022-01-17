import java.util.Scanner;

public class tutorial2_circle {

    public class Circle{
        private double radius; // radius of circle
        private static final double PI = 3.14159;

        //constructor
        public Circle(double radius){
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double area(){
            return (PI * this.radius * this.radius);
        }

        public double circumference(){
            return PI * 2 * this.radius;

        }

        public void printArea(){
            System.out.println(this.area());
        }

        public void printCircumference(){
            System.out.println(this.circumference());
        }
    }

    public static void main(String[] args){
        System.out.println("==== Circle Computation =====");
        System.out.println("|1. Create a new circle     |");
        System.out.println("|2. Print Area              |");
        System.out.println("|3. Print circumference     |");
        System.out.println("|4. Quit                    |");
        System.out.println("=============================");
        System.out.println("Choose option (1-3):");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        //instantiate object from inner class, alternative would be to create 2 seperate classes
        tutorial2_circle tutorial = new tutorial2_circle();
        tutorial2_circle.Circle circle = tutorial.new Circle(0);

        while (input != 4){
            switch(input){
                case 1:
                    System.out.println("Enter the radius to compute the area and circumference");
                    int rad = sc.nextInt();
                    circle.setRadius(rad);
                    System.out.println("A new circle has been created");
                    break;

                case 2:
                    System.out.println(circle.area());
                    break;

                case 3:
                    circle.printCircumference();
                    break;
                case 4:
                    break;
            }
            input = sc.nextInt();

        }
        System.out.println("Thank You!!!");


    }

}
