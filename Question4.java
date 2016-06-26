import java.util.Scanner;

//Name: Kuziwa Sachikonye
//Date: 11/08/12
//Title: Question 4

public class Question4 {
    public static void main(String[] args) {
        
        ClockAngle clkang = new ClockAngle();
        
        Scanner userinput = new Scanner(System.in);
        
        System.out.println("**** Welcome to Angle Calculator ****");
        
        String response = "y";
        while (response.equalsIgnoreCase("y")){
        System.out.println("Enter 4-digit time: (0000 - 2359)");
        String time = userinput.nextLine();
        int inputHour = Integer.parseInt(time.substring(0,2));
        int inputMin = Integer.parseInt(time.substring(2));
        int angle = clkang.anglecalc(inputHour, inputMin);
        System.out.printf("Angle between hour hand and minute hand is: %s degrees\n",angle);
        System.out.println("Would you like to calculate the angle for another time? (y/n)");
        response = userinput.nextLine();
        }

    }
}