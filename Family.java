package MyPackage; //problem-1 concept inheritance

public class Family {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent P=new Parent();
		System.out.println(P.Family_name="malayil");	 	 
	 child c =new child();
	   System.out.println(c.age=12);
	      System.out.println(c.name="anu");
	    System.out.println(c.occupation="pala");

	}

}
 class Parent{
	 String Family_name;
	 
 }
 class child extends Parent{
	 String name;
	 int age;
	 String occupation;
	 
 }