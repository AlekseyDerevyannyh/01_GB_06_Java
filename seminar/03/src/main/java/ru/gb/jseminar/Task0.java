package ru.gb.jseminar;

public class Task0 {

	// Даны следующие строки, cравнить их с помощью == и метода equals()
	// String s1 = "hello";
	// String s2 = "hello";
	// String s3 = s1;
	// String s4 = "h" + "e" + "l" + "l" + "o";
	// String s5 = new String("hello");
	// String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
	public static void main(String[] args) {
		System.out.print("\033[H\033[2J");	// Очистка консоли (работает в Windows, на остальных системах не проверял)
		System.out.flush();

		String s1 = new String("hello");
		String s2 = "hello";
		String s3 = s1;
		String s4 = "h" + "e" + "l" + "l" + "o";
		String s5 = new String("hello");
		String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

		// System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1 == s6);
	}
}
