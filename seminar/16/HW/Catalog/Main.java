import exception.DateFormatException;

import java.time.LocalDate;
import java.util.Scanner;


public class Main {
    public static final byte NUMBER_OF_INPUT_DATA_FIELDS = 6;   // Число входных данных, разделённых пробелом
    public static final byte NUMBER_OF_DATE_DATA_FIELDS = 3;   // Число полей даты, разделенных точкой (dd.mm.yyyy)
    public static final byte DAY_FIELD_SIZE = 2;    // Размерность поля день (dd)
    public static final byte MONTH_FIELD_SIZE = 2;    // Размерность поля месяц (mm)
    public static final byte YEAR_FIELD_SIZE = 4;    // Размерность поля год (yyyy)

    public static void main(String[] args) {
        Main main = new Main();
        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.println("Введите данные пользователя: ");
            String inputString = iScanner.nextLine();
            System.out.println(main.checkInputString(inputString));
        } catch (Exception e) {
            System.out.println("Ошибка ввода!");
            e.printStackTrace();
        }

        try {
            main.checkYear("2022");
        } catch (DateFormatException e) {
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println(main.isNumeric("1"));

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

    public void checkBirthDate(String birthDateString) throws DateFormatException {
        String[] birthDateData = birthDateString.split(".");
        if (birthDateData.length != NUMBER_OF_DATE_DATA_FIELDS) {
            throw new DateFormatException("Неверный формат даты (dd.mm.yyyy): количество полей, разделённых точкой (.), не равно трём!");
        }
        checkDay(birthDateData[0]);
        checkMonth(birthDateData[1]);
        checkYear(birthDateData[2]);
    }

    public void checkPhone(String phone) throws DateFormatException {
        if (!isNumeric(phone)) {
            throw new DateFormatException("Неверный формат телефонного номера: номер телефона должен состоять только из цифр");
        }
    }

    public void checkSex(String sex) throws DateFormatException {
        if (!sex.equals("f") && !sex.equals("m")) {
            throw new DateFormatException("Неверный формат пола: должен быть 'f' или 'm'");
        }
    }

    public void checkDay(String day) throws DateFormatException {
        if (day.length() != DAY_FIELD_SIZE) {
            throw new DateFormatException("Неверный формат даты (dd.mm.yyyy): длина поля день (dd) не равна двум!");
        }
        if (!isNumeric(day)) {
            throw new DateFormatException("Неверный формат даты (dd.mm.yyyy): поле день (dd) должно быть числом!");
        }
        if (Integer.parseInt(day) < 1 || Integer.parseInt(day) > 31) {
            throw new DateFormatException("Неверный формат даты (dd.mm.yyyy): поле день (dd) должно быть от 01 до 31");
        }
    }
    public void checkMonth(String month) throws DateFormatException {
        if (month.length() != MONTH_FIELD_SIZE) {
            throw new DateFormatException("Неверный формат даты (dd.mm.yyyy): длина поля месяц (mm) не равна двум!");
        }
        if (!isNumeric(month)) {
            throw new DateFormatException("Неверный формат даты (dd.mm.yyyy): поле месяц (mm) должно быть числом!");
        }
        if (Integer.parseInt(month) < 1 || Integer.parseInt(month) > 12) {
            throw new DateFormatException("Неверный формат даты (dd.mm.yyyy): поле месяц (mm) должно быть от 01 до 12");
        }
    }

    public void checkYear(String year) throws DateFormatException {
        if (year.length() != YEAR_FIELD_SIZE) {
            throw new DateFormatException("Неверный формат даты (dd.mm.yyyy): длина поля год (yyyy) не равна двум!");
        }
        if (!isNumeric(year)) {
            throw new DateFormatException("Неверный формат даты (dd.mm.yyyy): поле год (yyyy) должно быть числом!");
        }
        LocalDate localDate = LocalDate.now();
        if (Integer.parseInt(year) > localDate.getYear()) {
            throw new DateFormatException("Неверный формат даты (dd.mm.yyyy): поле год (yyyy) должно быть от 0000 до " + localDate.getYear());
        }
    }

    public Boolean isNumeric(String str) {
        for (char symbol : str.toCharArray()) {
            if (!Character.isDigit(symbol)) {
                return false;
            }
        }
        return true;
    }
}
