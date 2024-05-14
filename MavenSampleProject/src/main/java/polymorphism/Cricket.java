package polymorphism;

public class Cricket {

	
	String sports;
	String team;
	
	public void play(String sports, String team)
	{
		this.sports=sports;
		this.team=team;
		System.out.println("From Cricket class");
		System.out.println("Sports :: "+sports);
		System.out.println("Team ::"+team);
	}
	
}
