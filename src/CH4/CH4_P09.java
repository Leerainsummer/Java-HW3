package CH4;


// Chapter4 P9：講義範例（含跨頁類別）。
public class CH4_P09 {
    public static void main(String[] args)  {
RacingCar09 rccar1=new RacingCar09(); rccar1.newShow();
    }
}
class Car09 {
    protected int num;
    protected double gas;
    public Car09() { num=0; gas=0.0; System.out.println("生產了車子"); }
    
    public void setCar(int n,double g) { num=n; gas=g; System.out.println("將車號設為"+num+"，汽油量設為"+gas); }
    public void show() { System.out.println("車號是"+num); System.out.println("汽油量是"+gas); }
}
class RacingCar09 extends Car09 {
    private int course;
    public RacingCar09() { course=0; System.out.println("生產了賽車"); }
    
    public void setCourse(int c) { course=c; System.out.println("將賽車編號設為"+course); }
    public void newShow() { System.out.println("賽車的車號是"+num); System.out.println("汽油量是"+gas); System.out.println("賽車編號是"+course); }
}
