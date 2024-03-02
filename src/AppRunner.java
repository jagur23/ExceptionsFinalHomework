import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppRunner {
    public static void run(){
        while(true){

            System.out.println("Enter the following data using one space between arguments");
            System.out.println("Surname Name Patronymic Birthday(dd.mm.yyyy) Phone(only digits) Gender(f or m) : ");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            String[] dataArray = userInput.split(" ");
            Validator validator = new Validator();

            if(!validator.isValidArgumentQty(userInput)){
                System.out.println("Press 'y' to continue or another button to quit: ");
                String userAnswer = scanner.nextLine();
                if(userAnswer.equals("y")){
                    continue;
                }
                break;

            } else if(!validator.isValidFIO(dataArray[0])) {
                System.out.println("Press 'y' to continue or another button to quit: ");
                String userAnswer = scanner.nextLine();
                if(userAnswer.equals("y")){
                    continue;
                }
                break;
                
            } else if(!validator.isValidFIO(dataArray[1])) {
                System.out.println("Press 'y' to continue or another button to quit: ");
                String userAnswer = scanner.nextLine();
                if(userAnswer.equals("y")){
                    continue;
                }
                break;

            } else if (!validator.isValidFIO(dataArray[2])) {
                System.out.println("Press 'y' to continue or another button to quit: ");
                String userAnswer = scanner.nextLine();
                if(userAnswer.equals("y")){
                    continue;
                }
                break;

            } else if (!validator.isValidBirthdayFormat(dataArray[3])) {
                System.out.println("Press 'y' to continue or another button to quit: ");
                String userAnswer = scanner.nextLine();
                if(userAnswer.equals("y")){
                    continue;
                }
                break;

            } else if (!validator.isValidPhoneNumber(dataArray[4])) {
                System.out.println("Press 'y' to continue or another button to quit: ");
                String userAnswer = scanner.nextLine();
                if(userAnswer.equals("y")){
                    continue;
                }
                break;

            } else if (!validator.isValidGender(dataArray[5])) {
                System.out.println("Press 'y' to continue or another button to quit: ");
                String userAnswer = scanner.nextLine();
                if(userAnswer.equals("y")){
                    continue;
                }
                break;
            }

            UserData userData = new UserData(dataArray);

            String fileName = "src/userDataBase/" + userData.getSurname() + ".txt";

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
                writer.write(userData.toString());
                writer.flush();
                System.out.println("Data saved successfully!");
                System.out.println("Press 'y' to continue or another button to quit: ");
                String userAnswer = scanner.nextLine();
                if(userAnswer.equals("y")){
                    continue;
                }
                break;

            } catch (IOException e) {
                System.out.println("File not added");
                e.printStackTrace();
                System.out.println("Press 'y' to continue or another button to quit: ");
                String userAnswer = scanner.nextLine();
                if(userAnswer.equals("y")){
                    continue;
                }
                break;
            }
        }
    }
}
