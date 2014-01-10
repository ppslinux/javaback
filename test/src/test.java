class Person{                             //类前关键字有 public private abstract default 
	public int age;                       //     pravite可以保护类
	public String name;	                  //	abstract类并不用实现各个方法，而是定义方法，abstract的方法必须有abstract的关键字					
	Person(){                             //abstract class person()
		this.age=12;                      //{      abstarct void sayclolor();
										  //}
		this.name="john";
	}
	public void saycolor()
	{
		//System.out.println("nihao!");
		//System.out.println("his name is:"+name);
		//System.out.println("his age is"+age);
	}
}
class Black extends Person{
	public void saycolor()
	{
		System.out.println("hi a am black");
	}
}
class White extends Person{
	public void saycolor()
	{
		System.out.println("hi a am White");
	}
}

//java中继承关系使用 extends 符号
class dog extends Person{
}


public class test{
	public static void main(String args[])
	{
		System.out.println("hello world!!");
		Black a=new Black();                 //在初始化对象的时候必须分配内存，如果单纯 Black a；这样的话是没有分配内存的；
		a.saycolor();
		White b=new White();
		b.saycolor();
	}
}