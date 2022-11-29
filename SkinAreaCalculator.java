import java.util.Scanner;
public class SkinAreaCalculator {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[]args){
        SkinAreaCalculator runner = new SkinAreaCalculator();

        double weight;
        double height;
        int age;
        double BMA = 0;

        System.out.println("Please input your weight in kg");
        weight = runner.scanner.nextDouble();
        System.out.println("Please input your height in cm");
        height = runner.scanner.nextDouble();
        System.out.println("Please input your age");
        age = runner.scanner.nextInt();

        if (age == 0){
            BMA = 6.4954 * Math.pow(weight * 1000, 0.562) * Math.pow(height, 0.320);
            System.out.println("Your BMA is " + BMA + " centimeters squared");
            System.out.println("Mebane Formula");
        }
        else if(age <= 11){
            BMA = Math.sqrt(height * weight / 3600);
            System.out.println("Your BMA is " + BMA + " meters squared");
            System.out.println("Mosteller Formula");
        }
        else if (weight / Math.pow(height / 100, 2) > 30){
            BMA = (Math.pow(weight, 0.5378) * Math.pow(height, 0.3964) * 0.024265 +
                    0.0003207 * Math.pow(height, 0.3) * Math.pow(weight * 1000, 0.7285 - 0.0188 * Math.log(weight))
                    + 0.0235 * Math.pow(weight, 0.51456) * Math.pow(height, 0.42246)) / 3;
            System.out.println("Your BMA is " + BMA + " meters squared");
            System.out.println("Haycock, Boyd, Gehan & George Formula");
        }
        else{
            BMA = Math.sqrt(height * weight / 3600);
            System.out.println("Your BMA is " + BMA + " meters squared");
            System.out.println("Mosteller Formula");
        }
    }
}
