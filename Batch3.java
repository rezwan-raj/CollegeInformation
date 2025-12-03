public class Batch3 {
    private String batch3name1;private String batch3roll1;
    private String batch3name2;private String batch3roll2;
    private String batch3name3;private String batch3roll3;
    private String batch3name4;private String batch3roll4;
    private String batch3name5;private String batch3roll5;
    private String batch3name6;private String batch3roll6;

    public Batch3(String batch3name1, String batch3roll1, String batch3name2, String batch3roll2, String batch3name3, String batch3roll3, String batch3name4, String batch3roll4, String batch3name5, String batch3roll5, String batch3name6, String batch3roll6) {
        this.batch3name1 = batch3name1;
        this.batch3roll1 = batch3roll1;
        this.batch3name2 = batch3name2;
        this.batch3roll2 = batch3roll2;
        this.batch3name3 = batch3name3;
        this.batch3roll3 = batch3roll3;
        this.batch3name4 = batch3name4;
        this.batch3roll4 = batch3roll4;
        this.batch3name5 = batch3name5;
        this.batch3roll5 = batch3roll5;
        this.batch3name6 = batch3name6;
        this.batch3roll6 = batch3roll6;
    }

    public String getBatch3roll4() {
        return batch3roll4;
    }

    public String getBatch3name1() {
        return batch3name1;
    }

    public String getBatch3roll1() {
        return batch3roll1;
    }

    public String getBatch3name2() {
        return batch3name2;
    }

    public String getBatch3roll2() {
        return batch3roll2;
    }

    public String getBatch3name3() {
        return batch3name3;
    }

    public String getBatch3roll3() {
        return batch3roll3;
    }

    public String getBatch3name4() {
        return batch3name4;
    }

    public String getBatch3name5() {
        return batch3name5;
    }

    public String getBatch3roll5() {
        return batch3roll5;
    }

    public String getBatch3name6() {
        return batch3name6;
    }

    public String getBatch3roll6() {
        return batch3roll6;
    }
    public void Batch3Print(){

        System.out.println("Name: "+batch3name1+"& Roll: "+batch3roll1);
        System.out.println("Name: "+batch3name2+"& Roll: "+batch3roll2);
        System.out.println("Name: "+batch3name3+"& Roll: "+batch3roll3);
        System.out.println("Name: "+batch3name4+"& Roll: "+batch3roll4);
        System.out.println("Name: "+batch3name5+"& Roll: "+batch3roll5);
        System.out.println("Name: "+batch3name6+"& Roll: "+batch3roll6);
        System.out.println(" ");
    }
}
