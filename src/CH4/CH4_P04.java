package CH4;


// Chapter4 P4：講義範例（含跨頁類別）。
public class CH4_P04 {
    public static void main(String[] args)  {
RacingCar04 rccar1=new RacingCar04(); rccar1.setCar(1234,20.5); rccar1.setCourse(5);
    }
}
class Car04 {
    private int num;
    private double gas;
    public Car04() { num=0; gas=0.0; System.out.println("生產了車子"); }
    
    public void setCar(int n,double g) { num=n; gas=g; System.out.println("將車號設為"+num+"，汽油量設為"+gas); }
    public void show() { System.out.println("車號是"+num); System.out.println("汽油量是"+gas); }
}
class RacingCar04 extends Car04 {
    private int course;
    public RacingCar04() { course=0; System.out.println("生產了賽車"); }
    
    public void setCourse(int c) { course=c; System.out.println("將賽車編號設為"+course); }
    
}
