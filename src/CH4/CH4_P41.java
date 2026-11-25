package CH4;


// Chapter4 P41：講義範例（含跨頁類別）。
public class CH4_P41 {
    public static void main(String[] args)  {
Car41 car1=new Car41(1234,20.5); car1.vShow(); car1.mShow();
    }
}
interface IVehicle41 { void vShow(); }
interface IMaterial41 { void mShow(); }
class Car41 implements IVehicle41, IMaterial41 {
    private int num; private double gas;
    public Car41(int n,double g) { num=n; gas=g; System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子"); }
    public void vShow() { System.out.println("車號是"+num); System.out.println("汽油量是"+gas); }
    public void mShow() { System.out.println("車子的材質是鐵"); }
}
