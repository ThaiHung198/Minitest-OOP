
public class Main {
    public static void main(String[] args) {
        StudensClass[] students = {
                new StudensClass(1,"Nguyễn Thái Hưng","thaihung8503@email.com",28,7),
                new StudensClass(2,"Lê Trung Hiếu","hieuche1998@gmail.com",27,7),
                new StudensClass(3,"Ngô Gia khánh","zaKhanh555@gmail.com",21,9),
                new StudensClass(4,"Obama","obamalala@gmail.com",75,4),
                new StudensClass(5,"Donald Trump","donaldtrump@gmail.com",55,3)
        };
        System.out.println("Độ tuổi trung bình:" +StudensClass.calculateAverage(students));
        System.out.println("Số sinh viên có điểm >5: "+ StudensClass.countStudents(students));
        System.out.println("Email của Nguyễn Thái Hưng: " +
                StudensClass.findEmailByName(students, "Nguyễn Thái Hưng"));
    }
}