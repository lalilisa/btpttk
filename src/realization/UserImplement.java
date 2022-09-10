package realization;

import java.util.ArrayList;
import java.util.List;

public class UserImplement implements UserService {
    List<UserEntity> listUser=new ArrayList<>();

    @Override
    public UserEntity createUser(UserEntity user) {
        listUser.add(user);
        return listUser.get(listUser.size()-1);
    }

    public void listUser() {
        for (UserEntity user: listUser)
            System.out.println(user);
    }


}
