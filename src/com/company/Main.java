package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[1000];
        array(array);

        powerConsumption(array);

        String oxygenRate = new String("");
        String carbonDioxideRate = new String("");
        int lifeSupportRating = 0;
        String[] tempOxygen = Arrays.copyOf(array, array.length);
        String[] tempCarbonDioxide = Arrays.copyOf(array, array.length);

        oxygenRate = oxygenRating(tempOxygen, oxygenRate);
        carbonDioxideRate = carbonDioxideRating(tempCarbonDioxide, carbonDioxideRate);
        lifeSupportRating(lifeSupportRating, oxygenRate, carbonDioxideRate);
    }

    public static String[] array(String[] array) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine();
        }
        return array;
    }

    public static void powerConsumption(String[] array) {
        StringBuilder gamaRate = new StringBuilder();
        StringBuilder epsilonRate = new StringBuilder();
        int powerConsumption = 0;

        for (int i = 0; i < array[0].length(); i++) {
            StringBuilder zero = new StringBuilder();
            StringBuilder one = new StringBuilder();
            for (int j = 0; j < array.length; j++) {
                if (array[j].charAt(i) == '0') {
                    zero.append('0');
                } else if (array[j].charAt(i) == '1') {
                    one.append('1');
                }
            }
            if (zero.length() > one.length()) {
                gamaRate.append('0');
                epsilonRate.append("1");
            } else if (zero.length() < one.length()) {
                gamaRate.append('1');
                epsilonRate.append("0");
            }
        }

        powerConsumption = Integer.parseInt(String.valueOf(gamaRate), 2) * Integer.parseInt(String.valueOf(epsilonRate), 2);
        System.out.println(powerConsumption);
    }

    public static String oxygenRating(String[] tempOxygen, String oxygenRate) {
        for (int i = 0; i < tempOxygen[0].length(); i++) {
            StringBuilder zero = new StringBuilder();
            StringBuilder one = new StringBuilder();

            for (int j = 0; j < tempOxygen.length; j++) {
                if (tempOxygen[j].charAt(i) == '0') {
                    zero.append('0');
                } else if (tempOxygen[j].charAt(i) == '1') {
                    one.append('1');
                }
            }

            if (zero.length() > one.length()) {
                for (int k = 0; k < tempOxygen.length; k++) {
                    if (tempOxygen[k].charAt(i) == '1') {
                        tempOxygen[k] = "XXXXXXXXXXXX";
                    }
                }

            } else if (zero.length() < one.length()) {
                for (int k = 0; k < tempOxygen.length; k++) {
                    if (tempOxygen[k].charAt(i) == '0') {
                        tempOxygen[k] = "XXXXXXXXXXXX";
                    }
                }

            } else {
                for (int k = 0; k < tempOxygen.length; k++) {
                    if (tempOxygen[k].charAt(i) == '0') {
                        tempOxygen[k] = "XXXXXXXXXXXX";
                    }
                }
            }
            for (int l = 0; l < tempOxygen.length; l++) {
                if (!tempOxygen[l].equals("XXXXXXXXXXXX")) {
                    oxygenRate = tempOxygen[l];
                }
            }
        }
        return oxygenRate;
    }

    public static String carbonDioxideRating(String[] tempCarbonDioxide, String carbonDioxideRate) {
        for (int i = 0; i < tempCarbonDioxide[0].length(); i++) {
            StringBuilder zero = new StringBuilder();
            StringBuilder one = new StringBuilder();

            for (int j = 0; j < tempCarbonDioxide.length; j++) {
                if (tempCarbonDioxide[j].charAt(i) == '0') {
                    zero.append('0');
                } else if (tempCarbonDioxide[j].charAt(i) == '1') {
                    one.append('1');
                }
            }

            if (zero.length() > one.length()) {
                for (int k = 0; k < tempCarbonDioxide.length; k++) {
                    if (tempCarbonDioxide[k].charAt(i) == '0') {
                        tempCarbonDioxide[k] = "YYYYYYYYYYYY";
                    }
                }

            } else if (zero.length() < one.length()) {
                for (int k = 0; k < tempCarbonDioxide.length; k++) {
                    if (tempCarbonDioxide[k].charAt(i) == '1') {
                        tempCarbonDioxide[k] = "YYYYYYYYYYYY";
                    }
                }

            } else {
                for (int k = 0; k < tempCarbonDioxide.length; k++) {
                    if (tempCarbonDioxide[k].charAt(i) == '1') {
                        tempCarbonDioxide[k] = "YYYYYYYYYYYY";
                    }
                }
            }
            for (int l = 0; l < tempCarbonDioxide.length; l++) {
                if (!tempCarbonDioxide[l].equals("YYYYYYYYYYYY")) {
                    carbonDioxideRate = tempCarbonDioxide[l];
                }
            }
        }
        return carbonDioxideRate;
    }

    public static void lifeSupportRating(int lifeSupportRating, String oxygenRate, String carbonDioxideRate) {
        lifeSupportRating = Integer.parseInt(String.valueOf(oxygenRate), 2) * Integer.parseInt(String.valueOf(carbonDioxideRate), 2);
        System.out.println(lifeSupportRating);
    }
}

