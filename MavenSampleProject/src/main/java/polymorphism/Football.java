package polymorphism;

public class Football extends Sports {

	String fsports;
	String fteam;
	
	public void play(String fsports, String fteam)
	{
		this.fsports=fsports;
		this.fteam=fteam;
		System.out.println("From Football class");
		System.out.println("Sports :: "+fsports);
		System.out.println("Team ::"+fteam);
	}
	
	
}
