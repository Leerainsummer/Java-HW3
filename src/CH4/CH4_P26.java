package CH4;


// Chapter4 P26：講義範例（含跨頁類別）。
public class CH4_P26 {
    public static void main(String[] args)  {
Car26[] cars={new Car26(),new RacingCar26()}; for(int i=0;i<cars.length;i++) { Class<?> cl=cars[i].getClass(); System.out.println("第"+(i+1)+"個物件的類別是"+cl); }
    }
}
class Car26 {
    protected int num;
    protected double gas;
    public Car26() { num=0; gas=0.0; System.out.println("生產了車子"); }
    
    public void setCar(int n,double g) { num=n; gas=g; System.out.println("將車號設為"+num+"，汽油量設為"+gas); }
    public void show() { System.out.println("車號是"+num); System.out.println("汽油量是"+gas); }
}
class RacingCar26 extends Car26 { public RacingCar26() { System.out.println("生產了賽車"); } }
