import java.util.ArrayList;
import java.util.List;

class AdminManager {
    private List<Admin> admins;

    public AdminManager() {
        admins = new ArrayList<>();
    }

    public void addAdmin(Admin admin) {
        admins.add(admin);
        System.out.println("Admin added successfully.");
    }

    public void displayAdmins() {
        if (admins.isEmpty()) {
            System.out.println("No admins available.");
        } else {
            for (Admin admin : admins) {
                System.out.println(admin);
            }
        }
    }

    public boolean validateAdmin(String email, String password) {
        for (Admin admin : admins) {
            if (admin.getEmail().equals(email) && admin.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}

