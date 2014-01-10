interface myinterface{          //接口的定义 但不用实现
	public void interface1();
}

class shixian implements myinterface{                //接口的实现类，通过implementts interfaceclass实现
	public void interface1(){

	}
}
class A{
	class B{                      //类中类,称为内部类， 内部类可以访问任意外部类，即B可以访问A中任意变量

	}
}



public class interfaceclass {

	public static void main(String args[])
	{
		myinterface ie;                                  //定义接口对象
		ie = new shixian();                               //变量的实现使用实现类shixian;

	}
}


//抽像类本省就是一种特殊的类，能包含一个类可以包含的所有的东西，抽象类中除了含有本省的抽象方法之外，还可以有成员变量，和其他非抽象方法，而接口是
//类的抽象，接口中所有的方法必须是抽象的，并且不能包含成员变量只能定义静态的不能被更改的数据成员。
//其次抽象类在编程角度看，抽象类在java中表示的是一种继承关系，一个类只有一个继承关系，但是一个类确实可以实现多个接口，所以说接口优于抽象诶的一个方面。


//定义抽象类telphone
abstract class telphone{
	abstract void tel();
}
//定义接口view
interface view{
	void playvideo();

}

class viewtelephone extends telphone implements view{
	void tel(){};
	public void playvideo(){};
	
}




















//