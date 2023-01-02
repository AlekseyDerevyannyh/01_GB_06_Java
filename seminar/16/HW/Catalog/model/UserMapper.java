package model;

public class UserMapper {
    public String map(User user) {
        return String.format("<%s><%s><%s><%s><%d><%c>", user.getLastName(), user.getFirstName(), user.getPatronymic(),
                user.getBirthDate(), user.getPhone(), user.getSex());
    }

    public User map(String line) {
        line = line.substring(1, line.length() - 1);
        String[] lines = line.split("><");
        return new User(lines[0], lines[1], lines[2], lines[3], Long.parseLong(lines[4]), lines[5].charAt(0));
    }
}
