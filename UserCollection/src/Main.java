import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserList<Integer> userList = new UserList<>();

        userList.add(0);
        userList.add(1);
        userList.add(2);
        userList.add(3);
        userList.add(4);
        userList.add(5);
        userList.add(6);
        userList.add(7);
        userList.add(8);
        userList.add(9);
        userList.add(10);
        userList.add(11);
        userList.add(12);
        userList.add(13);
        userList.add(14);
        userList.add(15);
        userList.add(16);
        userList.add(17);

     //   userList.delete(2);
        userList.deleteSeveral(4,8);
//userList.forEach(a -> System.out.println(a));

        for (int i = 0; i < userList.size(); i++){
            System.out.println( userList.get(i));
        }



        System.out.println("Size is - " + userList.size());


    }
}
