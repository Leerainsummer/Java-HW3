package CH5;


// Chapter5 P47：講義範例（含跨頁類別）。
public class CH5_P47 {
    public static void main(String[] args)  {
Car47 car1=new Car47("1號車"); car1.start();for(int i=0;i<5;i++) { try { Thread.sleep(1000); System.out.println("正在進行main()的處理工作"); } catch(InterruptedException e) { Thread.currentThread().interrupt(); return; } }
    }
}
class Car47 extends Thread { private String name; public Car47(String nm) { name=nm; } public void run() { for(int i=0;i<5;i++) { System.out.println("正在進行"+name+"的處理工作"); } } }
