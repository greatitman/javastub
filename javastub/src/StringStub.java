/**
 * Created by skyworth on 2016/5/4.
 */
public class StringStub {

	public static void test_stub(){
		String str = "  ";//"深圳地铁";
		String arr[] = str.split(" ");
		System.out.println("array length is "+arr.length);
		if(arr.length>0){
			System.out.println("arr[0]"+arr[0]);
		}
		String S1 = "This is only a" + " simple" + " test";
		System.out.println(S1);
		StringBuffer Sb = new StringBuffer("This is only a").append(" simple").append(" test");
		System.out.println(Sb.toString());
	}
}
