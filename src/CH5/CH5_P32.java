package CH5;


// Chapter5 P32：講義範例（含跨頁類別）。
public class CH5_P32 {
    public static void main(String[] args) throws CarException32 {
Car32 car1=new Car32(); car1.setCar(1234,-10.0); car1.show();
    }
}
class CarException32 extends Exception { private static final long serialVersionUID=1L; }
class Car32 {
    private int num; private double gas;
    public Car32() { num=0; gas=0.0; System.out.println("已生產了汽車"); }
    public void setCar(int n,double g) throws CarException32 { if(g<0) throw new CarException32(); else { num=n; gas=g; System.out.println("將車號設為"+num+"汽油量設為"+gas); } }
    public void show() { System.out.println("車號是"+num); System.out.println("汽油量是"+gas); }
}
