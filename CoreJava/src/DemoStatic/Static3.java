package DemoStatic;

//static block it is used to initialze static data
//it is called before any object creation
class DemoStatic3{
	static int i; //variable as static->shared all objects
	int j; 
	static String college_name;
	
	static {
		System.out.println("static block it is called ");
		i=1;
		college_name="vemanna institute of Technplogy";
	}
	DemoStatic3(){
		System.out.println("constructor");
	}
	
}
public class Static3 {
 static {
	   System.out.println("Static1 before main");
 }
 static {
	   System.out.println("Static2 before main");
 }
	public static void main(String[] args) {
		System.out.println("Main");
		DemoStatic3 ob=new DemoStatic3();
		DemoStatic3 ob1=new DemoStatic3();
		System.out.println("college name="+ob.college_name);
		System.out.println("college name="+DemoStatic3.college_name);
	}

}

