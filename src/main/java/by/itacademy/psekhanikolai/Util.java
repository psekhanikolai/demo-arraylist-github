package by.itacademy.psekhanikolai;

import java.util.ArrayList;

public class Util {
    static public String cittyWithMax(ArrayList<String> cities) {
        int maxLength = cities.get(0).length();
        String cittyWithMax = cities.get(0);
        for (String citty : cities) {
            if (citty.length() > maxLength) {
                maxLength = citty.length();
            }
        }
        return cittyWithMax;
    }
}