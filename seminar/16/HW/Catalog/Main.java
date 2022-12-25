import exception.DateFormatException;

import java.util.Scanner;

public class Main {
    public static final byte NUMBER_OF_INPUT_DATA_FIELDS = 6;   // Число входных данных, разделённых пробелом
    public static final byte NUMBER_OF_DATE_DATA_FIELDS = 3;   // Число полей даты, разделенных точкой (dd.mm.yyyy)
    public static void main(String[] args) {
        Main main = new Main();
        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.println("Введите данные пользователя: ");
            String inputString = iScanner.nextLine();
            System.out.println(main.checkInputString(inputString));
        } catch (Exception e) {
            System.out.println("Ошибка ввода!");;
        }


    }

    public Integer checkInputString(String inputString) {
        String[] inputData = inputString.split(" ");
        int errorCode = 0;      // 0 - OK, -1 - входных данных меньше, чем должно быть, -2 - входных данных больше, чем должно быть
        if (inputData.length < NUMBER_OF_INPUT_DATA_FIELDS) {
            errorCode = -1;
        } else if (inputData.length > NUMBER_OF_INPUT_DATA_FIELDS) {
            errorCode = -2;
        }
        return errorCode;
    }

    public Boolean checkBirthDate(String birthDateString) throws DateFormatException{
        String[] birthDateData = birthDateString.split(".");
        if (birthDateData.length != NUMBER_OF_DATE_DATA_FIELDS) {
            throw new DateFormatException("Неверный формат даты (dd.mm.yyyy)!");
        } else if (birthDateData[0].length() != 2 || birthDateData[1].length() != 2 || birthDateData[2].length() != 4) {
            throw new DateFormatException("Неверный формат даты (dd.mm.yyyy)!");
        }
        return true;
    }
}
