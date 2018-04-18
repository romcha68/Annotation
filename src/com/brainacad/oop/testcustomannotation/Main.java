package com.brainacad.oop.testcustomannotation;

/**
 * Created by User on 18.04.2018.
 */
public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Action action = new Action();
        User admin = new User("Admin");
        admin.addPermission(PermissionAction.USER_READ);
        admin.addPermission(PermissionAction.USER_CHANGE);

        User user = new User("User");
        user.addPermission(PermissionAction.USER_READ);

        Action.readFile(admin);
        Action.readFile(user);

        Action.changeFile(admin);
        Action.changeFile(user);
    }
}
