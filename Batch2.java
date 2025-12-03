public class Batch2 {
    private String batch2name1;private String batch2roll1;
    private String batch2name2;private String batch2roll2;
    private String batch2name3;private String batch2roll3;
    private String batch2name4;private String batch2roll4;
    private String batch2name5;private String batch2roll5;
    private String batch2name6;private String batch2roll6;

    public Batch2(String batch2name1, String batch2roll1, String batch2name2, String batch2roll2, String batch2name3, String batch2roll3, String batch2name4, String batch2roll4, String batch2name5, String batch2roll5, String batch2name6, String batch2roll6) {
        this.batch2name1 = batch2name1;
        this.batch2roll1 = batch2roll1;
        this.batch2name2 = batch2name2;
        this.batch2roll2 = batch2roll2;
        this.batch2name3 = batch2name3;
        this.batch2roll3 = batch2roll3;
        this.batch2name4 = batch2name4;
        this.batch2roll4 = batch2roll4;
        this.batch2name5 = batch2name5;
        this.batch2roll5 = batch2roll5;
        this.batch2name6 = batch2name6;
        this.batch2roll6 = batch2roll6;
    }

    public String getBatch2name1() {
        return batch2name1;
    }

    public String getBatch2roll1() {
        return batch2roll1;
    }

    public String getBatch2name2() {
        return batch2name2;
    }

    public String getBatch2roll2() {
        return batch2roll2;
    }

    public String getBatch2name3() {
        return batch2name3;
    }

    public String getBatch2roll3() {
        return batch2roll3;
    }

    public String getBatch2name4() {
        return batch2name4;
    }

    public String getBatch2name5() {
        return batch2name5;
    }

    public String getBatch2roll4() {
        return batch2roll4;
    }

    public String getBatch2roll5() {
        return batch2roll5;
    }

    public String getBatch2name6() {
        return batch2name6;
    }

    public String getBatch2roll6() {
        return batch2roll6;
    }

    public void Batch2Print(){

        System.out.println("Name: "+batch2name1+"& Roll: "+batch2roll1);
        System.out.println("Name: "+batch2name2+"& Roll: "+batch2roll2);
        System.out.println("Name: "+batch2name3+"& Roll: "+batch2roll3);
        System.out.println("Name: "+batch2name4+"& Roll: "+batch2roll4);
        System.out.println("Name: "+batch2name5+"& Roll: "+batch2roll5);
        System.out.println("Name: "+batch2name6+"& Roll: "+batch2roll6);
        System.out.println(" ");
    }
}
