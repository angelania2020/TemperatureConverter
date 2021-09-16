/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconverter;

import java.util.Scanner;

/**
 *
 * @author Angelina
 */
public class TemperatureConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in degrees Celsius: ");
        double tempCelsius = sc.nextDouble();
        double tempFahrenheit = tempCelsius * 1.8 + 32;
        System.out.printf("The temperature converted into degrees Fahrenheit: %1$.1f%n", tempFahrenheit);
        
    }
    
}
