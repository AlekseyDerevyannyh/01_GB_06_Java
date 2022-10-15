package ru.gb.jseminar;
import java.util.Scanner;

public class Task1 {

	//Написать программу, которая запросит пользователя ввести <Имя> в консоли.
	//Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
	public static void main(String[] args) {
		System.out.print("\033[H\033[2J");  
		System.out.flush();
		
		Scanner iScanner = new Scanner(System.in);
		System.out.printf("Введите имя: ");
		String name = iScanner.next();
		System.out.println("Привет, " + name);
		iScanner.close();
	}
}
