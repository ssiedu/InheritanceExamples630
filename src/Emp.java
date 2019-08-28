public abstract class Emp {
    private int eno;
    private String ename;

    public abstract void computeSalary();
            
    public Emp(int p, String q){
        eno=p; ename=q;
    }
    public void info(){
        System.out.println(eno+","+ename);
    }
    public Emp(){}
}
