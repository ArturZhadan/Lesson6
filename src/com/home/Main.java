package com.home;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  temperatureFahrenheit;
        System.out.println("Input temperature Fahrenheit");
        temperatureFahrenheit = scanner.nextInt();
        int temperatureCelsius = (temperatureFahrenheit - 32) * 5/9;
        System.out.println("Temperature Celsius -> " + temperatureCelsius);

    }
}
