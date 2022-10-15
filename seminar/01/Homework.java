package ru.gb.jseminar;
import java.util.Scanner;

public class Homework {

	//На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
	//- команда 1 (к1): увеличить в с раза, а умножается на c
	//- команда 2 (к2): увеличить на d ( +2 ), к a прибавляется d
	//Написать программу, которая выдаёт массив команд, позволяющий число a превратить в число b или сообщить, что это невозможно
	//Пример 1: а = 1, b = 7, c = 1, d = 3
	//ответ: [к1, к1, к1, к1, к1, к1] или [к1, к2, к1, к1, к1] или [к1, к1, к2, к1].
	//Пример 2: а = 11, b = 7, c = 2, d = 1
	//ответ: [].

	public static Boolean flag = false;

	public static void main(String[] args) {
		System.out.print("\033[H\033[2J");	// Очистка консоли (работает в Windows, на остальных системах не проверял)
		System.out.flush();

		Homework homework = new Homework();

		Scanner iScanner = new Scanner(System.in);
		System.out.printf("Введите a (больше 0): ");
		int a = iScanner.nextInt();
		System.out.printf("Введите b (больше 0): ");
		int b = iScanner.nextInt();
		System.out.printf("Введите с (больше 1): ");
		int c = iScanner.nextInt();
		System.out.printf("Введите d (больше 0): ");
		int d = iScanner.nextInt();
		iScanner.close();
		if (a > 0 && b > 0 && c > 1 && d > 0) {
			System.out.println("Ответ: ");
			homework.doIt(a, b, c, d, "");
			if (!flag) {
				System.out.println("[]");
			}
		} else {
			System.out.println("Ошибка ввода!");
		}
	}

	public void doIt (int a, int b, int c, int d, String result) {
		if (a > b) {
			return;
		} else if (a == b) {
			flag = true;
			System.out.println("[" + result.substring(0, result.length() - 2) + "]");
			return;
		} else {
			doIt(a * c, b, c, d, result + "k1, ");
			doIt(a + d, b, c, d, result + "k2, ");
		}
	}
}
