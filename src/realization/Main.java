package realization;

public class Main {
    public static void main(String[] args) {
        UserEntity user=new UserEntity("trimai","123");
        UserService userService=new UserImplement();
        userService.createUser(user);
        userService.listUser();

    }
}
