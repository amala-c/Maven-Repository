package polymorphism;

public class Hockey {
	String hsports;
	String hteam;
	
	public void play(String hsports, String hteam)
	{
		this.hsports=hsports;
		this.hteam=hteam;
		System.out.println("From Hockey class");
		System.out.println("Sports :: "+hsports);
		System.out.println("Team ::"+hteam);
	}
}
