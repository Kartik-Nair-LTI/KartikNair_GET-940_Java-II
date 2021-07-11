import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		double ppu=1.20;
		int units;
		double total=0;
		
		System.out.println("Enter number of units: ");
		Scanner sc = new Scanner(System.in);
		units = sc.nextInt();
		
		total = units*ppu;
		if(units>=100 && units<=300) {
			total = ppu*100 + 2*(units-100);
		}
		if(units>300) {
			total = ppu*100 + 2*(units-3200) + 3*(units-300);
		}
		
		System.out.println("Electricity Bill: "+total);

	}

}
