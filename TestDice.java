public class TestDice
{
	public static void main(String args[])
	{
		Game gm= new Game();
		HumanPlayer hpl=new HumanPlayer("Hiroshan");
		ComputerPlayer cpl=new ComputerPlayer();
		
		gm.play(hpl,cpl);
	}
}