package TestNG;

public class StringBuilderAndBuffer {

	public static void main(String[] args) {
		String name = new String("Pune");
		System.out.println(name.concat(" City"));
		System.out.println(name);
		
		System.out.println();		//blank line
		
		StringBuilder name2 = new StringBuilder("Pune");
		System.out.println(name2.append(" City"));
		System.out.println(name2);
		System.out.println(name2);
		System.out.println(name2.reverse());
		
		System.out.println();		//blank line
		
		StringBuffer name3 = new StringBuffer("Pune");
		System.out.println(name3.append(" City"));
		System.out.println(name3);
		System.out.println(name3);
		System.out.println(name3.reverse());
		
		StringBuilder nameN = new StringBuilder(name);
		System.out.println(name);
		System.out.println(nameN);
		System.out.println(nameN.append(" Cityy"));

		System.out.println(name2);
	}

}