package SINGLE_RESPONSIBILITY_PRINCIPLE;

public class UserRepository {
    public void saveToDatabase(User user) {
        // Simulate saving user to database
        System.out.println("Saving " + user.getName() + " to the database.");
    }
}
