package innerClasses;

class Outer1
{
	private int i=10;
	private static int j=20;
	
	class Innerclass1
	{
		
		public Innerclass1()
		{
			System.out.println("inner class1 constructor");
		}
		public void getInnerclass1Data()
		{
			System.out.println("inner class1 calling and value ::"+i);
			System.out.println("inner class1 calling and value ::"+j);
		}
		
	}
	static class Innerclass2
	{
		public Innerclass2()
		{
			System.out.println("Inner class2 constructor");
		}
		public static void getInnerclass2Data()
		{
			System.out.println("Inner class2 calling and value::"+j);//can't access i as it is non static variable
			                                                         //and method is static
			
		}
		public void getInnerclass2getanotherData()
		{
//System.out.println("Inner class2 calling and value::"+i);//Cannot make a static reference to the non-static field i
			System.out.println("Inner class2 calling and value::"+j);
		}
	}
	
	public void getouterclassData()
	{
		System.out.println("outer class calling");
		
		Innerclass1 obj1 =new Innerclass1();
		obj1.getInnerclass1Data();
		
		Innerclass2.getInnerclass2Data();
		Innerclass2 obj2=new Innerclass2();
		obj2.getInnerclass2getanotherData();
	}
	
}

public class Innerclass_Memberclass {

	public static void main(String[] args) {
		
		Outer1 obj=new Outer1();
		obj.getouterclassData();
		
		Outer1.Innerclass1 obj1= new Outer1().new Innerclass1();
		obj1.getInnerclass1Data();
		
		Outer1.Innerclass2 obj2= new Outer1.Innerclass2();
		obj2.getInnerclass2Data();
		

	}

}
