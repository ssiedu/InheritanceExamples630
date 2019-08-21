public class Stud {
    private int rno;
    private String name;

    public String toString(){
        String s="["+rno+","+name+"]";
        return s;
    }
    
    public void result(int per){
        if(per>=33){
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
