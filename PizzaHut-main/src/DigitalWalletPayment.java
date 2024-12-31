import java.util.Scanner;

// DigitalWalletPayment implements PaymentStrategy
public class DigitalWalletPayment implements PaymentStrategy {
    private String walletId;

    @Override
    public void pay(double amount) {
        Scanner scanner = new Scanner(System.in);

        // Collect digital wallet details
        System.out.println("Enter Digital Wallet ID (e.g., Email or Username): ");
        walletId = scanner.nextLine();

        // Mock payment process
        System.out.println("Processing payment of LKR" + amount + " using Digital Wallet...");
        System.out.println("Payment Successful! Wallet ID: " + walletId + " has been charged.");
    }

    @Override
    public void applyLoyaltyPoints(UserProfile userProfile, double amount) {
        int loyaltyPoints = (int) amount / 100; // Earn 1 point for every $10 spent
        userProfile.addLoyaltyPoints(loyaltyPoints);
        System.out.println("You have earned " + loyaltyPoints + " loyalty points!");
    }
}
