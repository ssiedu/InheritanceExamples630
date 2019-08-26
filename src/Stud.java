public class Stud {
    private int rno;
    private String name;
    private final int PASS_MARKS=33;
    public String toString(){
        String s="["+rno+","+name+"]";
        return s;
    }
    
    public void result(int per){
        if(per>=PASS_MARKS){
            System.out.println("STUDENT PASSED");
        }else{
            System.out.println("STUDENT FAILED");
        }
    }
    public void setPData(int a, String b){
        rno=a;
        name=b;
    }
    public void showPData(){
        System.out.println(rno+","+name);
    }
}
