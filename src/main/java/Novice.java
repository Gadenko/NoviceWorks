import java.util.Scanner;

public class Novice {

    public static void main(String[] args) {

        String name = "David";

        giveMeMyName(name);
        giveMeMyNameFiveTime(name);
        lookingForIfANumberBiggerThen0();
        giveMeTheResultFromTheCalculation(3,2);
        scannerName();

    }

    public static void giveMeMyName(String name){

        System.out.println("My name is " + name + ", and you guys have see it!");

    }

    public static void giveMeMyNameFiveTime(String name){

        for (int i = 0; i < 5; i++){
            giveMeMyName(name);
        }
    }

    public static void lookingForIfANumberBiggerThen0(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Giv me a number: ");
        int input1 = Integer.parseInt(scanner.nextLine());

        if (input1 <= 0) {
            System.out.println("Your number is smaller then 0.");
        } else {
            System.out.println("Your number is bigger then 0.");
        }

    }

    public static int giveMeACalculation(int number, int power){
        if (power == 0)
            return 1;
        else
            return number * giveMeACalculation(number, power - 1);
    }

    public static String giveMeTheResultFromTheCalculation(int number, int power){

        //Scanner scanner = new Scanner(System.in);

        //System.out.println("Give me a number you want calculate with square:");
        //int number = Integer.parseInt(scanner.nextLine());
        //int number = 3;
        //int power = 2;
        int result = giveMeACalculation(number,power);
        return (number+"^"+power+"="+result);
    }

    public static void scannerName(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me your name: ");
        String input1 = scanner.nextLine();

        System.out.println("Your name is: " + input1 + ".");
    }

}


