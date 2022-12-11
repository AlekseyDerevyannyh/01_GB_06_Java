package ru.gb.oseminar.data;

public class HighSchoolboy extends Schoolboy implements ISmoke {
    public HighSchoolboy(String firstName, String lastName) {
        super(firstName, lastName);

    }

    public void relation() {
        System.out.println("У меня есть друг(подруга)");
    }

    public void exam() {
        System.out.println("Я готовлюсь к экзаменам");
    }

    @Override
    public void study() {
        System.out.println("Я должен учиться");
    }

    @Override
    public void smoke() {
        System.out.println("Я бросаю курить");
    }

    @Override
    public void allMethods() {
        study();
        relation();
        exam();
        smoke();
    }
}
