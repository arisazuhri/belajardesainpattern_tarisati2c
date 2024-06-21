package SINGLE_RESPONSIBILITY_PRINCIPLE;

public class Main {
    public static void main(String[] args) {
        User user = new User("Tarisa Zuhri", "tarisazuhri@gmail.com");
        UserRepository userRepository = new UserRepository();
        EmailService emailService = new EmailService();

        userRepository.saveToDatabase(user);
        emailService.sendEmail(user, "Welcome to our service!");
    }
}
