package in.paastalis.expensetracker.service;

import in.paastalis.expensetracker.entity.User;
import in.paastalis.expensetracker.entity.UserModel;

public interface UserService {

    User createUser(UserModel user);

    User readUser();

    User updateUser(UserModel user);

    void deleteUser();

    User getLoggedInUser();
}
