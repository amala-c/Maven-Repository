package abstraction;

public class VideoSearch extends Google {

	
	public void search()
	{
		System.out.println("Implementation of abstract method"); 
		System.out.println("Video Search Child class"); 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VideoSearch obj=new VideoSearch();
		obj.search();
	}

}
