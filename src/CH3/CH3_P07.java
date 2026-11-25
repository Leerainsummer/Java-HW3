package CH3;

public class CH3_P07
{
	public static void main(String[] args)
	{
		Car07 car1;
		car1 = new Car07();

		car1.num = 1234;
		car1.gas = 20.5;

		Car07 car2;
		car2 = new Car07();

		car2.num = 2345;
		car2.gas = 30.5;

		System.out.println("car1車號是" + car1.num);
		System.out.println("car1汽油量是" + car1.gas);

		System.out.println("car2車號是" + car2.num);
		System.out.println("car2汽油量是" + car2.gas);
	}
}

//Car類別
class Car07
{
	int num;
	double gas;
}