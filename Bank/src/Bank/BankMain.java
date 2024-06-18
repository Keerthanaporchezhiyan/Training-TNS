package Bank;

public class BankMain {

	public static void main(String[] args) {
		Account ac = new Account(6000, 20, "Keerthana");
		Transaction tc = new Transaction();
		tc.deposit(ac, 400);
		System.out.println(ac);
	}
}
