package oop;


	class Player 
	{
	
		private int playerId;
		private String playerName;
		private int playerAge;
		
		
		
		public Player()
		{
			this.playerId = 0;
			this.playerName = "N/A";
			this.playerAge = 0;
		}
		
		
		public Player(int id, String name, int age)
		{
			this.playerId = id;
			this.playerName = name;
			this.playerAge = age;
		}
		
		//Overloading 
		public Player(int id,  int age , String name)
		{
			this.playerId = id;
			this.playerName = name;
			this.playerAge = age;
		}
		
		
		public Player (int id) {
			this(); // assign default constructor to instanced class 
		}
		
		
		void printDetailsOfPlayerInstance() 
		{
			System.out.print(playerId  + " ");
			System.out.print(playerName + " ");
			System.out.println(playerAge);
		}
	}


public class ConstructOverloading {

	public static void main(String[] args) 
	{
		Player p1 = new Player(6);
		Player p2 = new Player(12, 24, "Joe");
		Player p3 = new Player(5, 90, "Roy");
		
		p1.printDetailsOfPlayerInstance();
		p2.printDetailsOfPlayerInstance();
		p3.printDetailsOfPlayerInstance();

	}

}
