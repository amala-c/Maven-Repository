package polymorphism;

public class Sports {
	
	String sports;
	String team;
	
	public void play(String sports, String team)
	{
		this.sports=sports;
		this.team=team;
		System.out.println("From Parent class");
		System.out.println("Sports :: "+sports);
		System.out.println("Team ::"+team);
	}
	public static void main(String args[])
	{
		Football s1=new Football();
		Cricket s2=new Cricket();
		Hockey s3=new Hockey();
		s1.play("Football", "TEAM A");
		s2.play("Cricket", "Team B");
		s3.play("Hockey", "TEAM 3");
		
	}

}
