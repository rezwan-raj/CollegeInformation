public class Teacher {
    String teachername;

    String crName;
    private Student student;
    Teacher(String teachername,String crName,Student student){
        this.crName = crName;
        this.student = student;
        this.teachername = teachername;
    }
    public void printInformation(){
        System.out.println("Teacher's name : "+teachername);
        System.out.println(" ");
        System.out.println("Student information by this teacher: ");
        student.printFullStudnetDetails();
    }
    public String getCrName(){
        return crName;
    }
}
