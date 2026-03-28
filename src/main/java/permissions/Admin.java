package permissions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.cloud.firestore.Firestore;

import firebase.FirebaseService;
import primary.User;

public class Admin extends User {
    private static final Admin instance = new Admin();
    // Created Arraylist for users
    private static List<User> usersLocal = new ArrayList<>();

    private Admin() {
    }; // default constructor

    public Admin(String name, String username, String password, String perms) {
        super(name, username, password, "admin");
    }

    // setters and getters
    public static Admin getInstance() {
        return instance;
    }

    public static List<User> getUsers() {
        return usersLocal;
    }

    public static void setUsers(List<User> users) {
        Admin.usersLocal = users;
    }
    // main methods

    public static void addUser(User user) {
        try {
            Firestore db = FirebaseService.getDB();
            Map<String, Object> data = new HashMap<>();
            data.put("name", user.getName());
            data.put("username", user.getUsername());
            data.put("password", user.getPassword());
            data.put("permission", user.getPerms());

            db.collection("users").add(data);

        } catch (Exception e) {
        }
    }

    public static void loadUsers() {
        try {
            Firestore db = FirebaseService.getDB();

            db.collection("users").get().get().forEach(doc -> {
                User a = new User();
                a.setName(doc.getString("name"));
                a.setUsername(doc.getString("username"));
                a.setPassword(doc.getString("password"));
                a.setPerms(doc.getString("permission"));

                usersLocal.add(a);
            });
        } catch (Exception e) {
        }
    }
}
