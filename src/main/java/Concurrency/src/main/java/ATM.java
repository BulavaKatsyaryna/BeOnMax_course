public class ATM {

    private int amount;

    public ATM(int amount) {
        this.amount = amount;
    }

    public void withdraw(String name, int amount) {
        System.out.println(name + "went to the ATM");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (amount <= this.amount) {
            this.amount -= amount;
            System.out.println(name + "withdrew " + amount);
            System.out.println("left: " + this.amount);
        } else {
            System.out.println("There is not enough money in the account for " + name);
        }
    }
}
