package encapsulationexamples;

public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book bobj=new Book();
		bobj.setBname("XYZ Book");
		bobj.setPublicationNo(200);
		bobj.setAuthor("XYZ Author");
		
		System.out.println(bobj.getBname());
		System.out.println(bobj.getPublicationNo());
		System.out.println(bobj.getAuthor());
	}

}
