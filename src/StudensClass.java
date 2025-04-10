public class StudensClass {
    private int id;
    private String Fullname;
    private String Email;
    private int age;
    private double Grade;
    public StudensClass(int id, String fullname, String email, int age, double grade) {
        this.id = id;
        this.Fullname = fullname;
        this.Email = email;
        this.age = age;
        this.Grade = grade;
    }
    public int getId() {
        return id;
    }
    public String getFullname() {
        return Fullname;
    }
    public String getEmail() {
        return Email;
    }
    public int getAge() {
        return age;
    }
    public double getGrade() {
        return Grade;
    }
    public static double calculateAverage(StudensClass[] students) {
        int totalAge = 0;
        for (StudensClass student : students) {
            totalAge += student.getAge();
        }
        return (double) totalAge / students.length;
    }
    public static int countStudents(StudensClass[] students) {
        int count = 0;
        for (StudensClass student : students) {
            if(student.getGrade() >5){
                count++;
            }
        }
        return count;
    }
    public static String findEmailByName(StudensClass[] students, String name) {
        for (StudensClass student : students) {
            if(student.getFullname().equals(name)){
                return student.getEmail();
            }
        }
        return "Không tìm thấy sinh viên có tên" + name;
    }
}
