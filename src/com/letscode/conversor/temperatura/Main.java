package com.letscode.conversor.temperatura;

import com.letscode.conversor.temperatura.services.Calculator;
import com.letscode.conversor.temperatura.utils.ScannerTemperature;

public class Main {

    public static void main(String[] args) {
//        Escreva um programa que, com base em uma temperatura em graus celsius,
//        a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra), Fahrenheit (F) seguindo as fórmulas:
//
//        F = (C * 1.8) + 32
//        K = C + 273.15
//        Re = C * 0.8
//        Ra = (C * 1.8) + 491
//
//        Considere a conversão de 18 ºC e a precisão de duas casas decimais

        final float CELSIUS = ScannerTemperature.getCelsiusTemperature();
        final double FAHRENHEIT = Calculator.convertCelsiusToFahrenheit(CELSIUS);
        final double KELVIN = Calculator.convertCelsiusToKelvin(CELSIUS);
        final double REAUMUR = Calculator.convertCelsiusToReamur(CELSIUS);
        final double RANKINE = Calculator.convertCelsiusToRankine(CELSIUS);

        System.out.printf("Celsius: %.2f %n Kelvin: %.2f %n Réaumur: %.2f %n Rankine: %.2f %n Fahrenheit: %.2f %n", CELSIUS, KELVIN, REAUMUR, RANKINE, FAHRENHEIT);

    }
}
