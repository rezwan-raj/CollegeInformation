

public class College {
    String collegeName;
    String location;
    College(String collegeName,String location){
        this.collegeName = collegeName;
        this.location = location;
    }
    public void collegePrint(){
        System.out.println("College information: ");
        System.out.println("College name is : "+collegeName);
        System.out.println("Location is : "+location);
        System.out.println("\n");
    }
}
