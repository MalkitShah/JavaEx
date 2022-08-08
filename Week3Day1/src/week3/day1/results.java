package week3.day1;

public class results {
	public double Physics;
	public double Chemistry;
	public double Biology;
	public double total;
	public double percent;
	
	
	
	public double result(double Physics , double Chemistry, double Biology) {
		total = Physics + Chemistry + Biology;
		System.out.println("Physics: " + Physics + " Chemistry: " + Chemistry + " Biology: " + Biology);
		return total;
	}
	
	public double percentage() {
		percent = (total*100)/450;
		System.out.println("Your total percentage in Science is " + percent );
		return percent;
	}
}
