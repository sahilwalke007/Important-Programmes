/* Write a test application named EmployeeTest that demonstrates class Employee�s capabilities. Create two employee objects and display each object�s yearly salary. */
class EmployeeTesting
{
	String nm;
	String des;
	String qual;
	int sal;
	EmployeeTesting(String nm,String des,String qual,int sal)
	{
		this.nm=nm;
		this.des=des;
		this.qual=qual;
		this.sal=sal;
	
	}
	int yearlySal()
	{
		return(sal*12);
	}
	


}
class EmployeeTest
{
	public static void main(String args[])
	{
		EmployeeTesting ob=new EmployeeTesting("Chitrank","President","Programmer",100000);
		int sal=ob.yearlySal();
		
		System.out.println("Yearly Salary of: Mr. "+ob.nm+"\nat designation: "+ob.des+"\nWorks as: "+ob.qual+"\nis: "+sal);
		EmployeeTesting ob1=new EmployeeTesting("Akhilesh","CEO","System Analyist",54000);
		int sal1=ob1.yearlySal();
		System.out.println("\nYearly Salary of: Mr. "+ob1.nm+"\nat designation: "+ob1.des+"\nWorks as: "+ob1.qual+"\nis: "+sal1);
		
	
	}

}