/**
 * Created by skyworth on 2016/5/3.
 */
public class StaticStub {
	public static int x = 100;
	public final static int Y=200;
	public StaticStub(){
		System.out.println("static stub 构造函数");
	}

	static {
		System.out.println("static 语句块");
	}

	public static void display(){
		System.out.println("static method");
	}

	public void show() {
		System.out.println("实例方法");
	}
}
