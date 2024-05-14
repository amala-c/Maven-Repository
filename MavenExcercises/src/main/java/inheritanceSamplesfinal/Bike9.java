package inheritanceSamplesfinal;

class Bike9{  
	 final int speedlimit=90;//final variable  
	 void run(){  
	//  speedlimit=400;  //will throw error
		 System.out.println("Speed limit is "+speedlimit);
	 }  
	 public static void main(String args[]){  
	 Bike9 obj=new  Bike9();  
	 obj.run();  
	 }  
}