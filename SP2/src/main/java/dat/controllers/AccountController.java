package dat.controllers;

import dat.dao.UserDAO;

public class AccountController {


//    public static void fillUpDatabaseWithUserAndAdmin() {
//        UserDAO dao = UserDAO.getInstance();
//
//        Role adminRole = new Role("Admin");
//        Role userRole = new Role("User");
//        dao.createRole(adminRole);
//        dao.createRole(userRole);
//
//        User user = new User("Karl", "password"); // Password is hashed internally
//        user.addRole(adminRole);
//
//        dao.createUser(user);
//    }
//
//
//    public void verifyPassword(User user) {
//        boolean result = user.verifyPassword("password");
//        System.out.println(user.getPassword());
//        System.out.println(result);
//    }
}