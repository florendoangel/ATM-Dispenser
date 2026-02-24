public class BPI_Atm {
    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        
        // Test with amounts including 250
        int[] testAmounts = {2970, 2750, 250};
        
        for (int amount : testAmounts) {
            System.out.println("Withdraw: " + amount + " pesos bills");
            atmDispenser.dispense(new Currency(amount));
            System.out.println(); // Add blank line between withdrawals
        }
    }
}