package Polymorphism;
	
	abstract class BankOperation
	{
		//static does not need help of object or reference variable. Can directly call class ! see in main
		public static void message() { 
			System.out.println("welcome choose operation");
		}
		
		abstract void OpenAccount();
		abstract void CloseAccount();
	}
	
	
	// multiple inheritance does not exist. Must extend class through chaining with abstract.
	abstract class BankAccount extends BankOperation
	{
		abstract void	deposit();
		abstract void 	withdraw();
		abstract void	balance();
	}
	
	
	// class SavingAccount extends BankAccount, BankOpration {} is impossible. Can inherit one class at time
	class SavingAccount extends BankAccount
	{
		
		// inherited from upper parent class BankOperation
		@Override
		void OpenAccount() {
			System.out.println("Open account");
			
		}

		@Override
		void CloseAccount() {
			System.out.println("Close account");
			
		}
		
		// -------------------

		@Override
		void deposit() {
			System.out.println("Deposit form saving account");
			
		}

		@Override
		void withdraw() {
			System.out.println("WithDraw from saving account");
			
		}

		@Override
		void balance() {
			System.out.println("Balance in saving account");
			
		}
		
	}
	
	
public class AbstractClass {

	public static void main(String[] args) {
		
			SavingAccount userAccount = new SavingAccount();
			
			BankOperation.message(); //call direct method from abstract class.
			
			userAccount.balance();
			userAccount.deposit();
			userAccount.withdraw();
		

	}

}
