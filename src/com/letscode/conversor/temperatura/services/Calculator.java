package com.letscode.conversor.temperatura.services;

import java.util.Scanner;

public class Calculator {
    public static float convertCelsiusToFahrenheit(float celsius){
        return (celsius * 1.8f) + 32;
    }

    public static float convertCelsiusToKelvin(float celsius) {
        return celsius + 273.15f;
    }

    public static float convertCelsiusToReamur(float celsius) {
        return celsius * 0.8f;
    }

    public static float convertCelsiusToRankine(float celsius) {
        return (celsius * 1.8f) + 491;
    }
}

