package CH4;


// Chapter4 P24：講義範例（含跨頁類別）。
public class CH4_P24 {
    public static void main(String[] args)  {
Car24 car1=new Car24(); car1.setCar(1234,20.5); System.out.println(car1);
    }
}
class Car24 {
    protected int num;
    protected double gas;
    public Car24() { num=0; gas=0.0; System.out.println("生產了車子"); }
    
    public void setCar(int n,double g) { num=n; gas=g; System.out.println("將車號設為"+num+"，汽油量設為"+gas); }
    public void show() { System.out.println("車號是"+num); System.out.println("汽油量是"+gas); }
public String toString() { return "車號:"+num+"汽油量:"+gas; }
}
