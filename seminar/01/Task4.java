package ru.gb.jseminar;
import java.util.Scanner;

public class Task4 {

	//Реализовать функцию возведения числа а в степень b. a, b – целые числа.
	//
	//Пример 1: а = 3, b = 2, ответ: 9
	//Пример 2: а = 2, b = -2, ответ: 0.25
	//Пример 3: а = 3, b = 0, ответ: 1
	public static void main(String[] args) {
		System.out.print("\033[H\033[2J");	// Очистка консоли (работает в Windows, на остальных системах не проверял)
		System.out.flush();

		Task4 task4 = new Task4();

		Scanner iScanner = new Scanner(System.in);
		System.out.printf("a = ");
		int a = iScanner.nextInt();
		System.out.printf("b = ");
		int b = iScanner.nextInt();
		iScanner.close();

		System.out.println("Ответ: " + task4.exponentiation(a, b));
	}

	public double exponentiation(int a, int b) {
	
		return Math.pow(a, b);
	}
}
