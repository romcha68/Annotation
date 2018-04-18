package com.brainacad.oop.testcustomannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 18.04.2018.
 */
public class User {
    private String name;
    private List<PermissionAction> permissions = new ArrayList<>();

    public List<PermissionAction> getPermissions() {
        return new ArrayList<>(permissions);
    }

    public void addPermission(PermissionAction permission) {
        permissions.add(permission);
    }

    public String getName() {
        return name;
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface MyPermission {
        PermissionAction value();
    }
}
