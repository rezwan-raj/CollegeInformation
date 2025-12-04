import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        while(true) {
            College college = new College("TMSS Engineering College.", "Thengamara,Bogura.");
            college.collegePrint();

            Batch batch = new Batch("Batch1", "6", "Batch2", "6", "Batch3", "6");
            Batch1 batch1 = new Batch1("Raj", "01", "Happy", "02", "Tasfeen", "03", "Rezvi", "04", "Polash", "05", "Talha", "o6");
            Batch2 batch2 = new Batch2("Tawsif", "01", "Saidi", "02", "Kouash", "03", "Akash", "o4", "Sweet", "05", "Rafi", "o6");
            Batch3 batch3 = new Batch3("Shapla", "01", "Shila", "02", "Hosneara", "03", "Sraboni", "04", "Sumi", "05", "Taher", "06");
            ResultBatch1 resultBatch1 = new ResultBatch1("Raj", "A+", "Happy", "A+", "Tasfeen", "B+", "Rezvi", "A-", "Polash", "A+", "Talha", "C");

            Student student = new Student(batch, batch1, batch2, batch3, resultBatch1);
            Teacher teacher = new Teacher("Saikat", "Raj", student);
            teacher.printInformation();

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the teacher name : ");
            String teacherName = sc.nextLine();

            if (teacherName.equalsIgnoreCase("Saikat")) {
                System.out.println("Teacher found!\n");
                System.out.println("CR name is : " + teacher.getCrName());
            } else {
                System.out.println("Teacher name not found!");
                
            }

        }

    }
}