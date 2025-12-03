public class Batch1 {
   private String batch1name1;private String batch1roll1;
   private String batch1name2;private String batch1roll2;
   private String batch1name3;private String batch1roll3;
   private String batch1name4;private String batch1roll4;
   private String batch1name5;private String batch1roll5;
   private String batch1name6;private String batch1roll6;

    public Batch1(String batch1name1, String batch1roll6, String batch1name6, String batch1roll5, String batch1name5, String batch1roll4, String batch1name4, String batch1roll3, String batch1name3, String batch1roll2, String batch1name2, String batch1roll1) {
        this.batch1name1 = batch1name1;
        this.batch1roll6 = batch1roll6;
        this.batch1name6 = batch1name6;
        this.batch1roll5 = batch1roll5;
        this.batch1name5 = batch1name5;
        this.batch1roll4 = batch1roll4;
        this.batch1name4 = batch1name4;
        this.batch1roll3 = batch1roll3;
        this.batch1name3 = batch1name3;
        this.batch1roll2 = batch1roll2;
        this.batch1name2 = batch1name2;
        this.batch1roll1 = batch1roll1;
    }

    public String getBatch1name1() {
        return batch1name1;
    }

    public String getBatch1roll1() {
        return batch1roll1;
    }

    public String getBatch1name2() {
        return batch1name2;
    }

    public String getBatch1roll2() {
        return batch1roll2;
    }

    public String getBatch1name3() {
        return batch1name3;
    }

    public String getBatch1roll3() {
        return batch1roll3;
    }

    public String getBatch1name4() {
        return batch1name4;
    }

    public String getBatch1roll4() {
        return batch1roll4;
    }

    public String getBatch1name5() {
        return batch1name5;
    }

    public String getBatch1roll5() {
        return batch1roll5;
    }

    public String getBatch1name6() {
        return batch1name6;
    }

    public String getBatch1roll6() {
        return batch1roll6;
    }

    public void Batch1Print(){

        System.out.println("Name: "+batch1name1+"& Roll: "+batch1roll1);
        System.out.println("Name: "+batch1name2+"& Roll: "+batch1roll2);
        System.out.println("Name: "+batch1name3+"& Roll: "+batch1roll3);
        System.out.println("Name: "+batch1name4+"& Roll: "+batch1roll4);
        System.out.println("Name: "+batch1name5+"& Roll: "+batch1roll5);
        System.out.println("Name: "+batch1name6+"& Roll: "+batch1roll6);
        System.out.println(" ");
    }
}
