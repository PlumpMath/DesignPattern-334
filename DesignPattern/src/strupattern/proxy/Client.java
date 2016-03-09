package strupattern.proxy;

/*public static void print(CalculateBean bean)
{
	double cel = bean.farenToCelcius(100);
	System.out.println("Temperature" + cel);
}
*/
public class Client {

	public static void main(String[] args) {

		CalculateBeanProxy proxy = new CalculateBeanProxy();
		System.out.println(proxy);
		
	}

}
