package SINGLE_RESPONSIBILITY_PRINCIPLE;

public class EmailService {
    public void sendEmail(User user, String message) {
        // Simulate sending email to user
        System.out.println("Sending email to " + user.getEmail() + ": " + message);
    }
}
