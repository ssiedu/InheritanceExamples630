public class MediStud extends Stud {
    private int prof;
    
    public void result(int per){
        if(per>=50){
            System.out.println("MEDI STUD PASSED");
        }else{
            System.out.println("MEDI STUD FAILED");
        }
    }
    public void setMData(int a){
        prof=a;
    }
    public void showMData(){
        System.out.println(prof);
    }
}
