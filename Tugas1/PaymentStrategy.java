// PaymentStrategy interface
interface PaymentStrategy {
    void pay(double amount);
}

// Concrete Payment Strategy: Credit Card
class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String expirationDate;
    private String cvv;

    public CreditCardPayment(String cardNumber, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    public void pay(double amount) {
        System.out.println("Paying $" + amount + " with credit card " + cardNumber);
    }
}

// Concrete Payment Strategy: PayPal
class PayPalPayment implements PaymentStrategy {
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void pay(double amount) {
        System.out.println("Paying $" + amount + " with PayPal account " + email);
    }
}

// Context
class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double totalAmount) {
        paymentStrategy.pay(totalAmount);
    }
}

// Client Code

