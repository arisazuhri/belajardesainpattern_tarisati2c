public class Main {
    public static void main(String[] args) {
        // Select payment strategy dynamically
        // For simplicity, I'm hardcoding the values here, in real-world scenario, you would take user input
        String paymentMethod = "Credit Card";

        PaymentStrategy paymentStrategy;
        if (paymentMethod.equalsIgnoreCase("Credit Card")) {
            String cardNumber = "8673829";
            String expirationDate = "12/24";
            String cvv = "123";
            paymentStrategy = new CreditCardPayment(cardNumber, expirationDate, cvv);
        } else if (paymentMethod.equalsIgnoreCase("PayPal")) {
            String email = "tarisa@zuhri.com";
            String password = "password123";
            paymentStrategy = new PayPalPayment(email, password);
        } else {
            System.out.println("Invalid payment method.");
            return;
        }

        // Create shopping cart with selected payment strategy
        ShoppingCart shoppingCart = new ShoppingCart(paymentStrategy);

        // Perform checkout
        double totalAmount = 100.0; // For simplicity, I'm hardcoding the total amount here, in real-world scenario, you would take user input
        shoppingCart.checkout(totalAmount);
    }
}