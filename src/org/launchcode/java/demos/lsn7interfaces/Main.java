package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        Comparator comparator = new FlavorComparator();

        flavors.sort(comparator);
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        for (Flavor i : flavors) {
            System.out.println(i.getName());
        }

        cones.sort(new ConeComparator());
        for (Cone i : cones) {
            System.out.println(i.getName()+": $"+i.getCost());
        }
    }
}
