package CH4;


// Chapter4 P25：講義範例（含跨頁類別）。
public class CH4_P25 {
    public static void main(String[] args)  {
Car25 car1=new Car25(); Car25 car2=new Car25(); Car25 car3=car1; System.out.println("car1與car2相同"+car1.equals(car2)); System.out.println("car1與car3相同"+car1.equals(car3));
    }
}
class Car25 {
    protected int num;
    protected double gas;
    public Car25() { num=0; gas=0.0; System.out.println("生產了車子"); }
    
    public void setCar(int n,double g) { num=n; gas=g; System.out.println("將車號設為"+num+"，汽油量設為"+gas); }
    public void show() { System.out.println("車號是"+num); System.out.println("汽油量是"+gas); }
}
