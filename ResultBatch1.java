public class ResultBatch1 {
     private String name1;private String grade1;
     private String name2;private String grade2;
     private String name3;private String grade3;
     private String name4;private String grade4;
     private String name5;private String grade5;
    private String name6;private String grade6;

    public ResultBatch1(String name1, String grade1, String name2, String grade2, String name3, String grade3, String name4, String grade4, String name5, String grade5,String name6, String grade6) {
        this.name1 = name1;
        this.grade1 = grade1;
        this.name2 = name2;
        this.grade2 = grade2;
        this.name3 = name3;
        this.grade3 = grade3;
        this.name4 = name4;
        this.grade4 = grade4;
        this.name5 = name5;
        this.grade5 = grade5;
        this.name5 = name6;
        this.grade5 = grade6;
    }

    public String getName1() {
        return name1;
    }

    public String getGrade1() {
        return grade1;
    }

    public String getName2() {
        return name2;
    }

    public String getGrade2() {
        return grade2;
    }

    public String getName3() {
        return name3;
    }

    public String getGrade3() {
        return grade3;
    }

    public String getName4() {
        return name4;
    }

    public String getGrade4() {
        return grade4;
    }

    public String getName5() {
        return name5;
    }

    public String getGrade5() {
        return grade5;
    }
    public String getName6() {
        return name6;
    }

    public String getGrade6() {
        return grade6;
    }

    public void resultPrintBatch1(){
        System.out.println("Result published in batch1: ");
        System.out.println("Student name: "+name1+" & Result is : "+grade1);
        System.out.println("Student name: "+name2+" & Result is : "+grade2);
        System.out.println("Student name: "+name3+" & Result is : "+grade3);
        System.out.println("Student name: "+name4+" & Result is : "+grade4);
        System.out.println("Student name: "+name5+" & Result is : "+grade5);
        System.out.println("Student name: "+name6+" & Result is : "+grade6);
        System.out.println(" ");

    }
}
