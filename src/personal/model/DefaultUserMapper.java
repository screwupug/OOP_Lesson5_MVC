package personal.model;

public class DefaultUserMapper implements UserMapper {
    public String map(User user) {
        return String.format("%s,%s,%s,%s", user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
    }

    public String alternativeMap(User user) {
        return String.format("%s;%s;%s;%s\n", user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
    }

    public User map(String line) {
        String[] lines = line.split(",");
        return new User(lines[0], lines[1], lines[2], lines[3], 1);
    }

    public User alternativeMap(String line) {
        String[] lines = line.split(";");
        return new User(lines[0], lines[1], lines[2], lines[3], 2);
    }
}
