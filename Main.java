import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   
        // Get user details for registration
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();
        
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        // Create a login object
        login user = new login(name, surname, username, password, phoneNumber);
        
        // Registering the user
        String registrationMessage = user.registerUser(name, password, phoneNumber, username, surname);
        System.out.println(registrationMessage);

        // If registration is successful, proceed to login
        if (!registrationMessage.equals("Registration successful!")) {
            return;
        }


        System.out.print("Enter your username to login: ");
        String loginUsername = scanner.nextLine();
        System.out.print("Enter your password to login: ");
        String loginPassword = scanner.nextLine();

        // check login status and prints message
        boolean loginStatus = user.loginUser(loginUsername, loginPassword, phoneNumber);
        System.out.println(user.returnLoginStatus(loginStatus));   
    
        scanner.close();

}
}