
public class University {
    public static void main(String[] args) {

        EngStud s1=new EngStud();
        s1.setPData(111, "AAA");
        s1.setEData("CS", 3);
        s1.showPData();
        s1.showEData();
        s1.result(46);
        
        String s=s1.toString();
        System.out.println(s);
        
        
        System.out.println("_________________________");
        MediStud s2=new MediStud();
        s2.setPData(112, "BBB");
        s2.setMData(2);
        s2.showPData();
        s2.showMData();
        s2.result(48);
        System.out.println("_________________________");
        MDStudent s3=new MDStudent();
        s3.setPData(113, "CCC");
        s3.setMData(2);
        s3.showPData();
        s3.showMData();
        s3.result(55);
    }
}
