package Polymorphism;

	interface AMCBank
	{
		//all class are abstract by default in interface.
		//Must use default to use it in children class as default method without overriding it in children class.
		// ~ equivalent public
		default void message() 
		{
			System.out.println("Welcome to AMCBank.");
		}
		
		void openAccount();
		void closeAccount();
	}

	interface IbankAccount 
	{
		//Method are by default abstract and public.
		
		void deposit(); // implicitly same as => public abstract void deposit();
		void withdraw();
		void balance();
		
	}
	
	//Can inherit multiple interface. Not possible from abstract class. Only from parent class must chain it.
	//Is Multiple inheritance of types /interfaces(concept).
	class Saving implements IbankAccount , AMCBank 
	{

		@Override
		public void openAccount() {
			System.out.println("Open account.");
			
		}

		@Override
		public void closeAccount() {
			System.out.println("Close account.");
			
		}
		
		@Override
		public void deposit() {
			System.out.println("Deposit saving to account");
			
		}

		@Override
		public void withdraw() {
			System.out.println("Withdraw from saving account");
			
		}

		@Override
		public void balance() {
			System.out.println("Balance of saving account");
			
		}
		
	}
	
	
public class Interface {

	public static void main(String[] args) {
		
		//Cannot instantiate interface 
		//AMCBank amcBank = new AMCBank();  will not work must pass through children implemented class.
		
		Saving userAccount = new Saving();
		
		userAccount.message();//default interface method can be called by child.
		
		userAccount.balance();
		userAccount.deposit();
		userAccount.withdraw();

	}

}
