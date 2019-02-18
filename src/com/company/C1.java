package com.company;

public class C1 {

    static public int nMax (double[] tab) {
        int i, countMax;
        double max;
        countMax=0;

        if (tab.length <= 0) {
            throw new EmptyArgException("Tableau vide");
        }

        max = tab[0];
        for (i=1 ; i<tab.length ; i++) {
            if (tab[i] > max) {
                System.out.println(tab[i] + " plus grand que " + tab[i-1]);
                max=tab[i];
            }
        }
        for (i=0; i<tab.length; i++) {
            if (tab[i]==max) {
                countMax++;
            }
        }
        System.out.println(max + " apparaît " + countMax);
        return countMax;
    }
}
