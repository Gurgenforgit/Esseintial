package OverloadMethod;

// Write overloaded convertTemperature methods:
//One version accepts a temperature in Celsius and returns it in Fahrenheit.
//The other version accepts a temperature in Fahrenheit and returns it in Celsius.

public class ConvertTemperature {
    public static void main(String[] args) {
        double Celsius = -273.15;
        double Farenheit = -700;
        if (Celsius < -273.15) {
            System.out.println("Temperature below -273.15 by Celsius doesn't exist");
        } else
            System.out.println("The equivalent of " + Celsius + " Celsiuse is " + convertTemerature(Celsius) + " Farenheit");
        if (Farenheit < -459.67) {
            System.out.println("Temperature below -459.67 by Farenheit doesn't exist");
        } else
            System.out.println("The equivalent of " + Farenheit + " Farenheit is " + convertTemperature(Farenheit) + " Celsius");
    }

    static double convertTemerature(double Celsius) {
        double Farenheit = 1.8 * Celsius + 32;
        return Farenheit;
    }

    static double convertTemperature(double Farenheit) {
        double Celsius = (Farenheit - 32) / 1.8;
        return Celsius;
    }
}
