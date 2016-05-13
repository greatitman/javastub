import java.util.Arrays;

public class Main {
	private void test_arrToStr() {
		int arr[] = {1, 2, 3};
		System.out.println("array to string " + Arrays.toString(arr));
	}

	public static void main(String[] args) {
//        Main test = new Main();
//        test.test_arrToStr();

//test http request
//		HttpClient20TestStub.stub_main();
//test static
//        try {
//            Class.forName("StaticStub");
//            Class.forName("StaticStub");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

//		StaticStub staticStub = new StaticStub();

		/*try {
			StaticStub staticStub = (StaticStub)Class.forName("StaticStub").newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}*/

//		StaticStub.display();
//		System.out.println("static final value "+StaticStub.Y);

//		JsonStub.stub_main();

//		StringStub.test_stub();
		PatternStub.needWordFilePreview("sdfsf.txt");
	}
}

