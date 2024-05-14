package abstraction;

public class ImageSearch extends Google {
	
	public void search()
	{
		System.out.println("Implementation of abstract method"); 
		System.out.println("Image Search Child class"); 
	}

	public static void main(String[] args) {
		
		ImageSearch ob=new ImageSearch();
		ob.search();
		// TODO Auto-generated method stub

	}

}
