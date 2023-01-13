import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Zylinder berechnen
        Scanner k = new Scanner(System.in);
        double zahl1, zahl2;
        System.out.println("Bitte Zahl eingeben: ");
        zahl1 = k.nextDouble();
        System.out.println("Bitte zweite Zahl eingeben: ");
        zahl2 = k.nextDouble();
        double r,l;
        r = zahl1;
        l = zahl2;
        double area = r * r * Math.PI;
        double volume = area * l;
        System.out.println("Volume of cylinder is: " + volume);


        Scanner s = new Scanner(System.in);
        int input1, input2;
        System.out.println("Bitte Zahl eingeben: ");
        input1 = s.nextInt();
        System.out.println("Bitte zweite Zahl eingeben: ");
        input2 = s.nextInt();

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
            System.out.println((input1 * input2));}


        System.out.println(" ");

        //Divisionsrest berechnen
        int z, y;
        z = input1/input2;
        y = input1%input2;
        System.out.println("Ganzzahliger Quoitient: "+input1+" / "+input2+" = "+z);
        System.out.println("Divisionsrest von input1/input2: a%b= "+y);


        System.out.println(" ");
        System.out.println("Boolean:");

        // == is equal to
        boolean c = (input1==input2);
        System.out.println("Input 1 and Input 2 are Equal: "+c);


        // <= less than or equal to
        boolean d = (input1<=input2);
        System.out.println("Input 1 is less or equal: "+ d);


        // < less than
        boolean e = (input1<input2);
        System.out.println("Input 1 is less than: "+e);


        // > grater than
        boolean f = (input1>input2);
        System.out.println("Input 1 is greater than: "+f);

        // != is not equal to
        boolean g = (input1!=input2);
        System.out.println("Input 1 is not equal to: "+g);

        s.close();


    }
    }
