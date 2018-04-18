package com.brainacad.oop.testcustomannotation;

/**
 * Created by User on 18.04.2018.
 */
public class Action {
    @User.MyPermission(value = PermissionAction.USER_CHANGE)
    public static void changeFile(User user) throws NoSuchMethodException {
        PermissionAction annotationPermission = Action.class.getDeclaredMethod("changeFile", User.class)
                .getDeclaredAnnotation(User.MyPermission.class).value();
        if (user.getPermissions().contains(annotationPermission)) {
            System.out.println("Allowed change file, " + user.getName());
        } else {
            System.out.println("Forbidden change file, " + user.getName());
        }
    }

    @User.MyPermission(value = PermissionAction.USER_READ)
    public static void readFile(User user) throws NoSuchMethodException {
        PermissionAction annotationPermission = Action.class.getDeclaredMethod("readFile", User.class)
                .getDeclaredAnnotation(User.MyPermission.class).value();
        if (user.getPermissions().contains(annotationPermission)) {
            System.out.println("Allowed, read file" + user.getName());
        } else {
            System.out.println("Forbidden, read file" + user.getName());
        }
    }
}
