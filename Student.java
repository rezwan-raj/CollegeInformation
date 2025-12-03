public class Student {
   private Batch batch;
   private Batch1 batch1;
   private Batch2 batch2;
   private Batch3 batch3;
   private ResultBatch1 resultBatch1;

    public Student(Batch batch, Batch1 batch1, Batch2 batch2, Batch3 batch3, ResultBatch1 resultBatch1) {
        this.batch = batch;
        this.batch1 = batch1;
        this.batch2 = batch2;
        this.batch3 = batch3;
        this.resultBatch1 = resultBatch1;
    }
    public void printFullStudnetDetails(){
        System.out.println("Student's information : \n");

        batch.batchPrint();
        System.out.println("Batch 1 information : ");
        batch1.Batch1Print();
        System.out.println("Batch 2 informaiton :");
        batch2.Batch2Print();;
        System.out.println("Batch 3 information :");
        batch3.Batch3Print();
        System.out.println("Result information: ");
        resultBatch1.resultPrintBatch1();
    }
}
