package ru.gb.jseminar;

public class Task0 {


	//Настроить проект, вывести в консоль “Hello world!”.
	public static void main(String[] args) {
		System.out.print("\033[H\033[2J");	// Очистка консоли (работает в Windows, на остальных системах не проверял)
		System.out.flush();
		
		System.out.println("Hello world");
	}

}
