
import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    static double input1, input2;
    public static void main(String[] args) {
        operationenUNDvergleich();
        zylinderrechnung();
        wurzel();


    }
        public static void operationenUNDvergleich() {

            System.out.println("Bitte Zahl eingeben: ");
            input1 = s.nextDouble();
            System.out.println("Bitte zweite Zahl eingeben: ");
            input2 = s.nextDouble();

            System.out.println("Bitte Operation eingeben: ");
            char rechenzeichen = s.next().charAt(0);


            //Plus
            if (rechenzeichen == '+') {
                System.out.println((input1 + input2));

                //Minus
            } else if (rechenzeichen == '-') {
                System.out.println((input1 - input2));

                //Division
            } else if (rechenzeichen == '/') {
                System.out.println((input1 / input2));

                //Multiplikation
            } else if (rechenzeichen == '*') {
                System.out.println((input1 * input2));
            }


            System.out.println(" ");

            //Divisionsrest berechnen
            double z, y;
            y = input1 % input2;
            System.out.println("Divisionsrest von input1/input2: a%b= " + y);


            System.out.println(" ");
            System.out.println("Boolean:");

            // == is equal to
            boolean c = (input1 == input2);
            System.out.println("Input 1 and Input 2 are Equal: " + c);


            // <= less than or equal to
            boolean d = (input1 <= input2);
            System.out.println("Input 1 is less or equal: " + d);


            // < less than
            boolean e = (input1 < input2);
            System.out.println("Input 1 is less than: " + e);


            // > grater than
            boolean f = (input1 > input2);
            System.out.println("Input 1 is greater than: " + f);

            // != is not equal to
            boolean g = (input1 != input2);
            System.out.println("Input 1 is not equal to: " + g);

        }


        public static void zylinderrechnung() {
            //Zylinder berechnen
            System.out.println(" ");

            double r, l;
            r = input1;
            l = input2;
            double area = r * r * Math.PI;
            double volume = area * l;
            System.out.println("Volume of cylinder is: " + volume);
        }

        public static void wurzel() {
        //Wurzel berechnung
            System.out.println(" ");
            System.out.println("Wurzel aus " + input1 + "=" + Math.sqrt(input1));
        }

}



