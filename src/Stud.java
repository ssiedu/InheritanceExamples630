public class Stud {
    private int rno;
    private String name;
    
    public void setPData(int a, String b){
        rno=a;
        name=b;
    }
    public void showPData(){
        System.out.println(rno+","+name);
    }
}
