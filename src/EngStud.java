public class EngStud extends Stud {
    private String branch;
    private int sem;

    public void setEData(String a, int b){
        branch=a;
        sem=b;
    }
    public void showEData(){
        System.out.println(branch+","+sem);
    }
}
