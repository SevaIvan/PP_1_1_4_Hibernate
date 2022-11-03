package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private static final UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        userService.createUsersTable();
        userService.saveUser("Ivan", "Sevastianov", (byte) 35);
        userService.saveUser("Anton", "Mishura", (byte) 34);
        userService.saveUser("Stanislav", "Shevchuk", (byte) 36);
        userService.saveUser("Vlad", "Usov", (byte)34);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
