package DemoStatic;
//qwertyuiopP asdfghjkl zxcvbnm , . " { } [] - ( ) ; '  ' " 0 \
class StudentDetails
{
	int StudentId;
	String StudentName;
	static String College="PKIET";
	static void change()
	{
		College="Pondicherry University";
	}
	
	
	public StudentDetails(int Id,String name) 
	{
		StudentId=Id;
		StudentName=name;
	}
	void display()
	{
		System.out.println("Student ID       ="+StudentId);
		System.out.println("Student Name     ="+StudentName);
		System.out.println("College Name     ="+College);
		System.out.println("***********");
	}
 
}
public class StaticEx {

	public static void main(String[] args) {
		StudentDetails.change();
		StudentDetails S1=new StudentDetails(299,"Dev");
		StudentDetails S2=new StudentDetails(321,"Deeran");
		S1.display();
		S2.display();

	}

}
