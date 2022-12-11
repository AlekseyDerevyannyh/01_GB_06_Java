package ru.gb.oseminar.data;

public class JuniorSchoolboy extends Schoolboy {

    public JuniorSchoolboy(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void study() {
        System.out.println("Я люблю учиться");
    }

    public void cry() {
        System.out.println("Хочу к маме");
    }

    @Override
    public void allMethods() {
        study();
        cry();
    }
}
