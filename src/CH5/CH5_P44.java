package CH5;


// Chapter5 P44：講義範例（含跨頁類別）。
public class CH5_P44 {
    public static void main(String[] args)  {
Car44 car1=new Car44("1號車"); car1.start();for(int i=0;i<5;i++) { System.out.println("正在進行main()的處理工作"); }
    }
}
class Car44 extends Thread { private String name; public Car44(String nm) { name=nm; } public void run() { for(int i=0;i<5;i++) { System.out.println("正在進行"+name+"的處理工作"); } } }
