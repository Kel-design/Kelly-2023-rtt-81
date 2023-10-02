package stringsmethods;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("135");

		System.out.println(sb.toString());
        sb.replace(0, 5, "6789");
        System.out.println(sb.toString());
        sb.insert(0, "12345");
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb.toString());
        sb.delete(0, 5);
        System.out.println(sb.toString());
	}

}
