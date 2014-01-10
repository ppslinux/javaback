
abstract class Person{                    //定义抽象的类
	Person(){
		
	}
	public void test(){                   //定义普通方法必须有方法的具体实现
		System.out.println("hehe");
	}
	public abstract void test1();        //抽象类只需要声明
	
}
public class abst extends Person {
public void test1(){
	System.out.println("this is the abstract");
	
}
	public static void main(String args[])
	{
		abst ni=new abst();
		ni.test1();
	}
}
//结束语 java中的类只能继承一个父类，而许多的类有很多的类的相似的性质，所以java中介入了接口这个技术，interface
//下一次的实验就涉及接口技术