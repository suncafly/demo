
public class StringTest {

	
	public static void test(String s){
		s = "zhangsan";
	}
	
	
	public static void test1(StringBuffer buffer){
		buffer.append("sanzan");
	}
	
	public static void main(String[] args) {
		String name = "lifang";
		StringBuffer buffer = new StringBuffer("zzz");
		test(name);
		System.out.println(name);
		test1(buffer);
		System.out.println(buffer.toString());
	}
}
