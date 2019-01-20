package sr.unasat.jpa.app;

import sr.unasat.jpa.config.JPAConfiguration;
import sr.unasat.jpa.dao.UserDAO;
import sr.unasat.jpa.entities.User;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO(JPAConfiguration.getEntityManager());
        List<User> userList = userDAO.selectAllUsers();
        userList.forEach(System.out::println);
    }
}
