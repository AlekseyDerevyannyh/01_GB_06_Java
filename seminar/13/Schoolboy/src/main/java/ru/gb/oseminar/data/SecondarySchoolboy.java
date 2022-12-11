package ru.gb.oseminar.data;

public class SecondarySchoolboy extends Schoolboy implements ISmoke {
    public SecondarySchoolboy(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void skipLesson() {
        System.out.println("Я прогулял урок");
    }

    @Override
    public void study() {
        System.out.println("Я ненавижу учиться");
    }

    @Override
    public void smoke() {
        System.out.println("Я начинаю курить");
    }

    @Override
    public void allMethods() {
        study();
        skipLesson();
        smoke();
    }
}
