import java.util.Scanner;

public class VendingMachine {
    private int coinCount = 0;

    /**
     *
     */
    public void addCoin() {
        coinCount++;
    }


    /**
     * @param drinkChoice pada method ini merupakan sistem pemilihan minuman dimana user memilih jenis minuman apa
     * @return
     */
    public String buyDrink(int drinkChoice) {
        String drink = "";
        int cost = 0;

        switch (drinkChoice) {
            case 1:
                drink = "Coke";
                cost = 2;
                break;
            case 2:
                drink = "Pepsi";
                cost = 2;
                break;
            case 3:
                drink = "Root Beer";
                cost = 2;
                break;
            case 4:
                drink = "Lemon-Lime";
                cost = 1;
                break;
            case 5:
                drink = "Orange Juice";
                cost = 2;
                break;
            case 6:
                drink = "Water";
                cost = 1;
                break;
            default:
                return "pilihan tidak ada. coba lagi.";
        }

        if (coinCount >= cost) {
            coinCount -= cost;
            return "Kamu membeli " + drink + ". Kembalianmu: " + coinCount + " coins.";
        } else {
            return "Maaf,kamu membutuhkan setidaknya" + (cost - coinCount) + " coin untuk membeli" + drink + ".";
        }
    }

    /**
     * @param args menambahkan objek
     */
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di vending machine");
        System.out.print("Masukkan coin: ");
        int coins = scanner.nextInt();
        for (int i = 0; i < coins; i++) {
            machine.addCoin();
        }

        System.out.println("Select a drink:");
        System.out.println("1. Coke - $2");
        System.out.println("2. Pepsi - $2");
        System.out.println("3. Root Beer - $2");
        System.out.println("4. Lemon-Lime - $1");
        System.out.println("5. Orange Juice - $2");
        System.out.println("6. Water - $1");
        System.out.println("choose your drink:");

        int drinkChoice = scanner.nextInt();

        String result = machine.buyDrink(drinkChoice);
        System.out.println(result);
    }
}
