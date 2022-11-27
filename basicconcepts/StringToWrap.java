package basicconcepts;

public class StringToWrap {
	public static void main(String[] args) {
		String str ="123";
		short s = Short.parseShort(str);
		System.out.println(s);
		String str1="true";
		boolean b =Boolean.parseBoolean(str);
		System.out.println(b);
		String name = "50";
		Long l =Long.valueOf(s);
		System.out.println(l);

}
}