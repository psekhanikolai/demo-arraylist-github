package by.itacademy.psekhanikolai;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities= new ArrayList<>();
        cities.add("Gomel");
        cities.add("Brest");
        cities.add("Milan");
        cities.add("Wien");
        cities.add("Rom");
        System.out.println(cities);
        cities.set(2, "Basel");
        int maxLength = cities.get(0).length();
        String cittyWithMax= cities.get(0);
        for (String citty: cities){
            if (citty.length()>maxLength){
                maxLength= citty.length();
            }
        }
        System.out.println(cittyWithMax);
    }
}
