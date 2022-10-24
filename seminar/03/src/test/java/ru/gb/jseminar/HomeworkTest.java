package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HomeworkTest {

	@Test
	void removeNegativeValueSuccessful() {
		List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
		List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 9, 3, 5, 7));

		Homework homework = new Homework();
		List<Integer> actualList = homework.removeNegativeValue(inputList);

		Assertions.assertEquals(expectedList, actualList);
	}

	@Test
	void getMinSuccessful() {
		List<Integer> inputList = new ArrayList<>(Arrays.asList(9, 2, 6, 4, 3, 5, 7, 8));
		int expected = 2;

		Homework homework = new Homework();
		int actual = homework.getMin(inputList);

		Assertions.assertEquals(expected, actual);
	}

	@Test
	void getMaxSuccessful() {
		List<Integer> inputList = new ArrayList<>(Arrays.asList(9, 2, 6, 4, 3, 5, 7, 8));
		int expected = 9;

		Homework homework = new Homework();
		int actual = homework.getMax(inputList);

		Assertions.assertEquals(expected, actual);
	}

	@Test
	void getAverageSuccessful() {
		List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 9, 3, 5, 7));
		int expected = 5;

		Homework homework = new Homework();
		int actual = homework.getAverage(inputList);

		Assertions.assertEquals(expected, actual);
	}

}