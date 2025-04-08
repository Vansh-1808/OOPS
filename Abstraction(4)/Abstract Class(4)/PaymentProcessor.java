abstract class PaymentMethod {
    abstract void processPayment(double amount); // Abstract method
    void confirmTransaction() {
        System.out.println("Transaction confirmed");
    }
}

class CreditCard extends PaymentMethod {
    void processPayment(double amount) {
        System.out.println("Processing $" + amount + " via Credit Card");
    }
}

class PayPal extends PaymentMethod {
    void processPayment(double amount) {
        System.out.println("Processing $" + amount + " via PayPal");
    }
}

public class PaymentProcessor {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod payPal = new PayPal();

        creditCard.processPayment(100.50); // Output: Processing $100.5 via Credit Card
        creditCard.confirmTransaction();   // Output: Transaction confirmed
        payPal.processPayment(75.25);      // Output: Processing $75.25 via PayPal
        payPal.confirmTransaction();       // Output: Transaction confirmed
    }
}