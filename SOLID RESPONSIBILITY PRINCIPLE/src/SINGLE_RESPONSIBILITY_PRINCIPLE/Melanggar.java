// ini adalah program yang melanggar//

package SINGLE_RESPONSIBILITY_PRINCIPLE;
public class Melanggar {
    private String name;
    private String email;

    public Melanggar(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void saveToDatabase() {
        // logic untuk menyimpan user ke database
    }

    public void sendEmail(String message) {
        // logic untuk mengirim email ke user
    }
}
