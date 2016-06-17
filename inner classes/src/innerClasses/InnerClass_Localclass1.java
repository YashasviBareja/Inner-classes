package innerClasses;


class Outer{
	private int i=10;
	
	public void getOuterClassData()
	{
		System.out.println("Outer class calling");
		
		abstract class Inner1
		{
			public void getInner2classData() {
			};
			
			public void getInner1ClassData()
			{
				System.out.println("inner class1 calling an value of i::"+i);
			}
			
		}
		class Inner2 extends Inner1{
			
			public void getInner2classData(){
				
				System.out.println("inner class2 calling an value of i::"+i);
			}
		}
		class Inner3{
			public void getInner3classData(){
			System.out.println("inner class3 calling an value of i::"+i);
		}
		}
		Inner2 obj=new Inner2();
		obj.getInner2classData();
		obj.getInner1ClassData();
		
		Inner3 obj1=new Inner3();
		obj1.getInner3classData();
		
	}
}


public class InnerClass_Localclass1 {

	public static void main(String[] args) {
	

		Outer obj=new Outer();
		obj.getOuterClassData();
		
	}

}
