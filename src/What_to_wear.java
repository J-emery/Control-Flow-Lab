import java.util.Locale;
import java.util.Scanner;

public class What_to_wear {
    public static void main(String[] args) {
        //get temperature
        //get general weather e.g. rainy, cloudy etc
        //multiply them together
        //use a switch for the options
        Scanner input = new Scanner(System.in);
        System.out.println("What is the temperature today");
        int temp = input.nextInt();
        System.out.println("How would you describe the weather today \n 1.Very rainy \n 2.Rainy \n 3.Cloudy \n 4.Sunny");
        String weather = input.next().toLowerCase(Locale.ROOT);

        switch(weather){
            case "very rainy":
                if (temp > 10){
                    System.out.println("You should wear a light raincoat and an umberella");
                } else {
                    System.out.println("You should wear a thick raincoat and take an umberella");
                }
                break;
            case "rainy":
                if (temp > 10){
                    System.out.println("You should wear a light raincoat");
                } else {
                    System.out.println("You should wear a thick raincoat");
                }
                break;
            case "cloudy":
                if (temp > 10){
                    System.out.println("You should wear a light jacket");
                } else {
                    System.out.println("You should wear a heavy jacket");
                }
                break;
            case "sunny":
                if (temp > 10){
                    System.out.println("You should wear summery clothes and put on suncream");
                } else {
                    System.out.println("You should wear a jacket");
                }
                break;
            default:
                System.out.println("Sorry I didn't get that");
        }
    }
}
