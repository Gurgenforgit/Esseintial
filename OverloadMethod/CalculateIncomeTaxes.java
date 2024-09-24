package OverloadMethod;

public class CalculateIncomeTaxes {
    public static void main(String[] args) {
        double sallary = 100000;
        int custumTax = 26;
        boolean flag = true;
        if (sallary <= 0 || custumTax < 0 || custumTax >= 100) {
            System.out.println("Wrong input parameters");
            System.exit(1);
        }
        System.out.println("The default tax is " + calculateIncomeTax(sallary));
        System.out.println("The custom tax is " + calculateIncomeTax(sallary, custumTax));
        System.out.println("If in IT, the tax is " + calculateIncomeTax(sallary, flag));
    }

    static double calculateIncomeTax(double sallary) {
        return (sallary * 20) / 100;
    }

    static double calculateIncomeTax(double sallary, int customTax) {
        return (sallary * customTax) / 100;

    }

    static double calculateIncomeTax(double sallary, boolean flag) {
        return (sallary * 10) / 100;
    }
}
