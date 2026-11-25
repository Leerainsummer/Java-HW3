package CH4;


// Chapter4 P38：講義範例（含跨頁類別）。
public class CH4_P38 {
    public static void main(String[] args)  {
Vehicle38[] vc=new Vehicle38[2]; vc[0]=new Car38(1234,20.5); vc[1]=new Plane38(232); for(int i=0;i<vc.length;i++) vc[i].show();
    }
}
interface Vehicle38 { int weight=1000; void show(); }
class Car38 implements Vehicle38 {
    private int num; private double gas;
    public Car38(int n,double g) { num=n; gas=g; System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子"); }
    public void show() { System.out.println("車號是"+num); System.out.println("汽油量是"+gas);  }
}
class Plane38 implements Vehicle38 {
    private int flight;
    public Plane38(int f) { flight=f; System.out.println("生產了"+flight+"班次的飛機"); }
    public void show() { System.out.println("飛機的班次是"+flight);  }
}
