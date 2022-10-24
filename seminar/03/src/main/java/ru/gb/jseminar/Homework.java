package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class Homework {

	// Пусть дан произвольный список целых чисел
	public static void main(String[] args) {
		System.out.print("\033[H\033[2J");	// Очистка консоли (работает в Windows, на остальных системах не проверял)
		System.out.flush();

		List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
		Homework homework = new Homework();

		Logger log = Logger.getLogger(Homework.class.getName());
		log.info("Исходный список: " + String.valueOf(list));
		log.info(String.valueOf("Список нечётных элементов: " + homework.removeNegativeValue(list)));
		log.info(String.valueOf("Минимальный элемент в списке: " + homework.getMin(list)));
		log.info(String.valueOf("Максимальный элемент в списке: " + homework.getMax(list)));
		log.info(String.valueOf("Среднее значение элементов списка: " + homework.getAverage(list)));
	}

	// Нужно удалить из него четные числа
	public List<Integer> removeNegativeValue(List<Integer> list) {
		List<Integer> result = new ArrayList<>(list);
		Iterator<Integer> item = result.iterator();

		while (item.hasNext())
			if (item.next() % 2 == 0)	item.remove();
		return result;
	}

	// Найти минимальное значение
	public Integer getMin(List<Integer> list) {
		if (list.size() > 0)	return Collections.min(list);
		else					throw new IllegalStateException("Невозможно найти минимальный элемент - список пуст!");
	}

	// Найти максимальное значение
	public Integer getMax(List<Integer> list) {
		if (list.size() > 0) {
			int max = list.get(0);
			for (int item : list.subList(1, list.size()))
				if (item > max)	max = item;
			return max;
		} else {
			throw new IllegalStateException("Невозможно найти максимальный элемент - список пуст!");
		}
	}

	// Найти среднее значение
	public Integer getAverage(List<Integer> list) {
		if (list.size() > 0) {
			int avg = 0;
			for (int item : list)	avg += item;
			avg /= list.size();
			return avg;
		} else {
			throw new IllegalStateException("Невозможно найти среднее значение - список пуст");
		}
	}
}
