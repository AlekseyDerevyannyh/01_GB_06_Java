package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task2 {

	// Дан список содержащий строки и числа в строковом формате.
	// C помощью итератора пройти по списку и вывести в консоль что является строкой, а что числом
	public static void main(String[] args) {
		System.out.print("\033[H\033[2J");	// Очистка консоли (работает в Windows, на остальных системах не проверял)
		System.out.flush();

		List<String> list = new ArrayList<>(Arrays.asList("a", "2", "b", "3", "c", "4"));
		printResultOfCheck(list);
	}

	public static void printResultOfCheck(List<String> list) {
		Iterator<String> iter = list.iterator();
		
		while (iter.hasNext()) {
			try {
				Integer.valueOf(iter.next());
				System.out.println("Это число");
			} catch (NumberFormatException e) {
				System.out.println("Это строка");
			}
		}
	}
}
