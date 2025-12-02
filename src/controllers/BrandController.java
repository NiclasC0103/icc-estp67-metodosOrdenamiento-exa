package controllers;

import models.Brand;

public class BrandController {
    public static void sortInsertionDesc(Brand[] brands) {
        int n = brands.length;
        for (int i = 1; i < n; i++) {
            Brand key = brands[i];
            int j = i - 1;
            while (j >= 0 && brands[j].getTotalValidYears() < key.getTotalValidYears()) {
                brands[j + 1] = brands[j];
                j = j - 1;
            }
            brands[j + 1] = key; 
        }
    }

    public static Integer binarySearchByValidYears(Brand[] brands, int objetivo, boolean isAscending) {
        int inicio = 0;
        int fin = brands.length - 1;
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            if (brands[medio].getTotalValidYears() == objetivo) {
                return medio;
            }
            if (brands[medio].getTotalValidYears() < objetivo) {
                inicio = medio + 1;
            }
            else {
                fin = medio - 1;
            }
        }
        return null;
    }
}
