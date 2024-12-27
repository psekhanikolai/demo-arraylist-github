package by.itacademy.psekhanikolai;

import java.util.ArrayList;

public class Util {
    static public String cittyWithMax(ArrayList<String> cities) {
        int maxLength = cities.get(0).length();
        String cittyWithMax = cities.get(0);
        for (String citty : cities) {
            if (citty.length() > maxLength) {
                cittyWithMax = citty;
                maxLength = citty.length();
            }
        }
        return cittyWithMax;
    }

    static public String cittyWithMin(ArrayList<String> cities) {
        int minLength = cities.get(0).length();
        String cittyWithMin = cities.get(0);
        for (String citty : cities) {
            if (citty.length() < minLength) {
                cittyWithMin = citty;
                minLength = citty.length();
            }
        }
        return cittyWithMin;
    }

}
