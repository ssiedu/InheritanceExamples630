public class Emp {
    private int eno;
    private String ename;
                //111       AAA
    public Emp(int p, String q){
        eno=p; ename=q;
    }
    public void info(){
        System.out.println(eno+","+ename);
    }
}
