package accountage;
import java.util.Scanner;
public class AccountAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String user, pass;
        int age;
        Information info = new Information();
        try {
            System.out.print("Username: ");
            user = scan.next();
            info.setUsername(user);
            
            System.out.print("Age: ");
            age = scan.nextInt();
            info.setAge(age);
            Information.ageChecker(age);
            
            scan.nextLine();
            System.out.print("Password: ");
            pass = scan.next();
            info.setPassword(pass);
            Information.passwordChecker(pass);
            
            System.out.println("-----ACCOUNT DETAILS-----");
            System.out.println("Username: " + info.getUsername());
            System.out.println("Password: " + info.getPassword());
            System.out.println("Age: " + info.getAge());
            
        } catch(AgeException e){
            System.out.println(e.getMessage());
        } catch (PasswordException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank you!");
        }
    }
    
}
