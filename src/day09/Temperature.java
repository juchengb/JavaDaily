package day09;

// 2469. Convert the Temperature
public class Temperature {
	
	public double[] convertTemperature(double celsius) {
        return new double[] {celsius + 273.15, celsius * 1.8 + 32};
    }

}
