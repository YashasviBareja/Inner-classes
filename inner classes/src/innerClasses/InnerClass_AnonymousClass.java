package innerClasses;

interface MyContents1{
	
	public String getdata();
}

abstract class MyContents2{
	
	public abstract String getdata();
}

class MyContents3
{
	public String getdata(){
		return "default value";
	}
}
class Myclass{
	
	public MyContents1 getMyclassdata()
	{
		return new MyContents1(){
			
			private String data="yashasvi from interface";
			
			public String getdata()
			{
				return data;
			}
		};	
	}
	public MyContents2 getMyclassdata1()
	{
		return new MyContents2(){
			
	private String data="yashasvi from abstract class";
			
			public String getdata()
			{
				return data;
			}
		};
	}
	public MyContents3 getMyclassdata2()
	{
		return new MyContents3();
		{
			private String  data1="yashasvi from class";
			public String getdata()
			{
				return data1;
			}
			
		};
	}
}

public class InnerClass_AnonymousClass {

	public static void main(String[] args) {
		
		Myclass obj=new Myclass();
		System.out.println(obj.getMyclassdata().getdata());
		System.out.println(obj.getMyclassdata1().getdata());
		System.out.println(obj.getMyclassdata2().getdata());
		
	}

}
