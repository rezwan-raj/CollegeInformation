public class Batch {
    private String batch1;private String StudentNo1;
    private String batch2;private String StudentNo2;
    private String batch3;private String StudentNo3;

    Batch(String batch1,String StudentNo1,String batch2,String StudentNo2,String batch3,String StudentNo3){
        this.batch1 = batch1;this.StudentNo1=StudentNo1;
        this.batch2 = batch2;this.StudentNo2 =StudentNo2;
        this.batch3 = batch3;this.StudentNo3 = StudentNo3;
    }

    public String getBatch1() {
        return batch1;
    }

    public String getStudentNo1() {
        return StudentNo1;
    }

    public String getBatch2() {
        return batch2;
    }

    public String getStudentNo2() {
        return StudentNo2;
    }

    public String getBatch3() {
        return batch3;
    }

    public String getStudentNo3() {
        return StudentNo3;
    }

    public void batchPrint(){
        System.out.println("Batch Information is : ");
        System.out.println("Batch one name is : "+batch1+".Here student totall student number is : "+StudentNo1);
        System.out.println("Batch two name is : "+batch2+".Here student totall student number is : "+StudentNo2);
        System.out.println("Batch three name is : "+batch3+".Here student totall student number is : "+StudentNo3);
        System.out.println(" ");

    }

}
