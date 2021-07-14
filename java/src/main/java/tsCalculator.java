import java.util.Scanner;
import java.util.regex.Pattern;

public class tsCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the True Shooting Percentage Calculator!");
        boolean isDone = false;
        double[] doubleArray = new double[3];
        int count;
        boolean isAllNumbers = false;
        boolean isThreeNumbers = false;
        String longString;
        String[] stringArray;
        int numberOfNumbers;
        do {
            do {
                do {

                    System.out.println("Please input the amount of points scored, shots taken, and free throws taken separated by spaces ex(5 10 3): ");
                    longString = scanner.nextLine();


                stringArray = longString.split(" |\\  |\\   ");
                if (stringArray.length != 3 ){
                    System.out.println("Include exactly 3 numbers with 1 space between each");
                }
                else {isThreeNumbers = true;}
            }while (!isThreeNumbers);
            count = 0;
                numberOfNumbers = 0;
            for (int i = 0; i <stringArray.length; i++){

                if (!Pattern.matches("[A-~!-/]+",stringArray[i])) {
                    numberOfNumbers++;
                    doubleArray[i] = Double.parseDouble(stringArray[i]);
                    if (doubleArray[i] >= 0) {
                        count++;
                    }
                    if(numberOfNumbers==3)
                        isAllNumbers = true;
                }

            } if (numberOfNumbers != 3){
                System.out.println("Do not include any letters");
                }
            }while (!isAllNumbers);
                if (count == 3)
                    isDone = true;
                else {
                    System.out.println("Make sure all of your values are positive integers and you include spaces");
                }
        } while (!isDone);
        gameStats ts = new gameStats(doubleArray[0],doubleArray[1],doubleArray[2]);
        System.out.println("Your true shooting percentage is " + String.format("%.2f" ,ts.getTrueShootingPercentage()*100) +"%");
    }
}
