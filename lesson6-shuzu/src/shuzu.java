
public class shuzu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={23,23,12,32};  //1 方式   数组的初始话不可像c语言中的【】 必须用{ }

		{
		int[] b;
		b = new int[23];//2  方式    创建数组的形式前面必须定义数组

		int[] c = new int[23];//3 方式   别写成   int c= new int[n];
		}

//		字符串使用的是String关键字
		String pi="who are you ";
		String ni;
		ni="hello";
		String he;
		he="hello";
		System.out.println(ni.equals(he));
	}

}
