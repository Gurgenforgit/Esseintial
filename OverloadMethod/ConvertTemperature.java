package OverloadMethod;

// Write overloaded convertTemperature methods:
//One version accepts a temperature in Celsius and returns it in Fahrenheit.
//The other version accepts a temperature in Fahrenheit and returns it in Celsius.

public class ConvertTemperature {
    public static void main(String[] args) {
        float Celsius = -273.15F;
        double Farenheit = -700;
        if (Celsius < -273.15) {
            System.out.println("Temperature below -273.15 by Celsius doesn't exist");
        } else
            System.out.println("The equivalent of " + Celsius + " Celsius is " + convertTemerature(Celsius) + " Farenheit");
        if (Farenheit < -459.67) {
            System.out.println("Temperature below -459.67 by Farenheit doesn't exist");
        } else
            System.out.println("The equivalent of " + Farenheit + " Fahrenheit is " + convertTemperature(Farenheit) + " Celsius");
    }

    static double convertTemerature(float Celsius) {
        return 1.8 * Celsius + 32;
    }

    static double convertTemperature(double Farenheit) {
        return (Farenheit - 32) / 1.8;

    }
}
