package com.globalfinance.homeloan.app.responce;

import java.util.Random;

public class CibilCheck {

	public static int  checkCibil() {
        // Sample credit information
        int creditHistoryMonths = getRandomNumber(12, 100);
        int onTimePayments = getRandomNumber(12, creditHistoryMonths);
        int totalPayments = getRandomNumber(onTimePayments, creditHistoryMonths);
        int creditUtilization = getRandomNumber(0, 100);

        // Calculate CIBIL score
        int cibilScore = calculateCibilScore(creditHistoryMonths, onTimePayments, totalPayments, creditUtilization);

        // Display the result
        System.out.println("CIBIL Score: " + cibilScore);
		return cibilScore;
        
    }

    private static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    private static int calculateCibilScore(int creditHistoryMonths, int onTimePayments, int totalPayments, int creditUtilization) {
        // CIBIL score calculation logic
        int cibilScore = 0;

        // Calculate credit history score
        double creditHistoryScore = (double) creditHistoryMonths / 12;
        cibilScore += creditHistoryScore * 100;

        // Calculate payment history score
        double paymentHistoryScore = (double) onTimePayments / totalPayments;
        cibilScore += paymentHistoryScore * 200;

        // Calculate credit utilization score
        double creditUtilizationScore = 100 - creditUtilization;
        cibilScore += creditUtilizationScore * 2;

        return cibilScore;
    }
}
