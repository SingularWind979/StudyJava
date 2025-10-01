import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class InterfaceDemo {
    public static void main(String[] args) {
        Student students[] = new Student[10];
        students[0] = new Student("张三", "男", 70);
        students[1] = new Student("李四", "女", 80);
        students[2] = new Student("王五", "男", 90);
        students[3] = new Student("赵六", "女", 60);
        students[4] = new Student("孙七", "男", 85);
        students[5] = new Student("周八", "女", 75);
        students[6] = new Student("钱九", "男", 65);
        students[7] = new Student("小十", "女", 95);
        students[8] = new Student("小十一", "男", 85);
        students[9] = new Student("小十二", "男", 75);

        PrintStudentInfo psi = new PrintStudentInfoImpl2(students);
        psi.printAllStudentInfos();
        psi.printAverageScore();
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Student{
    private String name;
    private String sex;
    private double score;
}

interface PrintStudentInfo{
    void printAllStudentInfos();
    void printAverageScore();
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class PrintStudentInfoImpl1 implements PrintStudentInfo{
    private Student[] students;
    @Override
    public void printAllStudentInfos() {
        for (Student stu : students) {
            System.out.println(stu);
        }
    }

    @Override
    public void printAverageScore() {
        double sum = 0;
        for (Student stu : students) {
            sum += stu.getScore();

        }
        System.out.println("平均分是：" + sum / students.length);
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class PrintStudentInfoImpl2 implements PrintStudentInfo{
    private Student[] students;

    @Override
    public void printAllStudentInfos() {
        int maleCount = 0;
        int femaleCount = 0;
        for (Student stu : students) {
            if ("男".equals(stu.getSex())) {
                maleCount++;
            } else {
                femaleCount++;
            }
            System.out.println(stu);
        }
        System.out.println("男性人数是：" + maleCount);
        System.out.println("女性人数是：" + femaleCount);
    }

    @Override
    public void printAverageScore() {
        double sum = 0;
        double maxScore = students[0].getScore();
        double minScore = students[0].getScore();
        for (Student stu : students) {
            sum += stu.getScore();
            if (stu.getScore() > maxScore) {
                maxScore = stu.getScore();
            }
            if (stu.getScore() < minScore) {
                minScore = stu.getScore();
            }
        }
        System.out.println("平均分是：" + (sum-maxScore-minScore)/(students.length-2));
    }
}