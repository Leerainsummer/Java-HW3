package CH5;


// Chapter5 P30：講義範例（含跨頁類別）。
public class CH5_P30 {
    public static void main(String[] args)  {
Car30 car1=new Car30(); try { car1.setCar(1234,-10.0); } catch(CarException30 e) { System.out.println("拋出"+e+"了"); } car1.show();
    }
}
class CarException30 extends Exception { private static final long serialVersionUID=1L; }
class Car30 {
    private int num; private double gas;
    public Car30() { num=0; gas=0.0; System.out.println("已生產了汽車"); }
    public void setCar(int n,double g) throws CarException30 { if(g<0) throw new CarException30(); else { num=n; gas=g; System.out.println("將車號設為"+num+"汽油量設為"+gas); } }
    public void show() { System.out.println("車號是"+num); System.out.println("汽油量是"+gas); }
}
