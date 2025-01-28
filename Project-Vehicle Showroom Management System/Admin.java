class Admin {
    private String adminId;
    private String name;
    private String email;
    private String password;

    public Admin(String adminId, String name, String email, String password) {
        this.adminId = adminId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getAdminId() { return adminId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }

    @Override
    public String toString() {
        return "AdminId: " + adminId + ", Name: " + name + ", Email: " + email;
    }
}
