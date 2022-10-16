package ru.gb.jseminar;

public class Task3 {

	//Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
	public static void main(String[] args) {
		System.out.print("\033[H\033[2J");	// Очистка консоли (работает в Windows, на остальных системах не проверял)
		System.out.flush();

		int[] arr = new int[] {1, 1, 0, 1, 1, 1};
		
		Task3 task3 = new Task3();

		System.out.println(task3.count(arr));
	}

	public int count (int[] array) {
		int result = 0;
		int count = 0;
		for (int i = 0; i < array.length; i ++) {
			if (array[i] == 1)	count ++;
			else				count = 0;

			if (count > result)	result = count;
		}
		return result;
	}
}
