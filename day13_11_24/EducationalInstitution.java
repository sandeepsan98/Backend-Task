package day13_11_24;

public class EducationalInstitution {

    public enum Role {
        STUDENT("View courses and grades, submit assignments"),
        TEACHER("Create and manage courses, grade assignments"),
        ADMIN("Manage users, roles, and system settings");

        private String permission;


        Role(String permission) {
            this.permission = permission;
        }

        public String getPermission() {
            return permission;
        }

        public void displayRoleInfo() {
            System.out.println(this.name() + ": " + getPermission());
        }

        public boolean hasAccessTo(String section) {
            switch (this) {
                case STUDENT:
                    return section.equals("Courses") || section.equals("Grades");
                case TEACHER:
                    return section.equals("Courses") || section.equals("Grades") || section.equals("Assignments");
                case ADMIN:
                    return true;
                default:
                    return false;
            }
        }
    }

    public static void main(String[] args) {
        Role student = Role.STUDENT;
        Role teacher = Role.TEACHER;
        Role admin = Role.ADMIN;


        System.out.println("Role Information:");
        student.displayRoleInfo();
        teacher.displayRoleInfo();
        admin.displayRoleInfo();

        System.out.println("\nAccess Control Test:");

        testAccess(student, "Courses");
        testAccess(student, "Assignments");
        testAccess(student, "Grades");
        testAccess(teacher, "Courses");
        testAccess(teacher, "Assignments");
        testAccess(teacher, "Users");

        testAccess(admin, "Courses");
        testAccess(admin, "Assignments");
        testAccess(admin, "Users");
    }

    public static void testAccess(Role role, String section) {
        if (role.hasAccessTo(section)) {
            System.out.println(role.name() + " has access to " + section + ".");
        } else {
            System.out.println(role.name() + " does NOT have access to " + section + ".");
        }
    }
}
