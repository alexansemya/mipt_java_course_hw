import java.util.Map;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        User.CreateUsers();
        Map<Integer, ArrayList<User>> users = User.processUsers();
        User.printUserMap(users, 18);
    }
}
