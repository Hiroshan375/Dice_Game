public class Game
{
	public void play(Player player1,Player player2)
	{
		Dice dice=new Dice();
		int a=player1.rollDice(dice);
		int b=player2.rollDice(dice);
		
		System.out.println("Player1 is get : "+a);
		System.out.println("Player2 is get : "+b);
		
		if(a>b)
		{
			System.out.println("Player1 win");
		}
		else if(a<b)
		{
			System.out.println("Player2 win");
		}
		else
		{
			System.out.println("Tied");
		}
		
	}
}