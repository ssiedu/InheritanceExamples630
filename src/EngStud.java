public class EngStud extends Stud {
    private String branch;
    private int sem;

    public String toString(){
        String s="["+branch+","+sem+"]";
        return s;
    } 
    public void setEData(String a, int b){
        branch=a;
        sem=b;
    }
    public void showEData(){
        System.out.println(branch+","+sem);
    }
    
    
}
