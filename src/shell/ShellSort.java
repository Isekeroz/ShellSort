package shell;

import java.util.Random;


public class ShellSort {

    
    public static void main(String[] args) {
        int dizi1[ ] = new int[10];
        int dizi2[ ] = new int[50];
        int dizi3[ ] = new int[100];
        int dizi4[ ] = new int[200];
        int dizi5[ ] = new int[500];
        
        Random r = new Random();
            for (int i = 0; i < 10; i++) 
                dizi1[i]=r.nextInt(10000);
            
            for (int i = 0; i < 50; i++) 
                dizi2[i]=r.nextInt(10000);
            
            for (int i = 0; i < 100; i++) 
                dizi3[i]=r.nextInt(10000);
            
            for (int i = 0; i < 200; i++) 
                dizi4[i]=r.nextInt(10000);
            
            for (int i = 0; i < 500; i++) 
                dizi5[i]=r.nextInt(10000);
            
            ShellSort(dizi1); ShellSort(dizi2); ShellSort(dizi3); ShellSort(dizi4); ShellSort(dizi5);
    }
    
    
    public static void ShellSort(int[] dizi) {
        int swapSayac=0;
        int karsilastirma = 0;
	int increment = dizi.length / 2;
	while (increment > 0) {
		for (int i = increment; i < dizi.length; i++) {
			int j = i;
			int temp = dizi[i];
                        karsilastirma = karsilastirma +1;
			while (j >= increment && dizi[j - increment] > temp) {
                            karsilastirma = karsilastirma+1;
                                swapSayac = swapSayac+1;
				dizi[j] = dizi[j - increment];
				j = j - increment;
			}
			dizi[j] = temp;
		}
		if (increment == 2) {
			increment = 1;
		} else {
			increment *= (5.0 / 11);
		}
	}
        System.out.println(dizi.length + " elemanlý dizi için swap sayýsý = " + swapSayac);
        System.out.println("Karþýlaþtýrma sayýsý = "+ karsilastirma);
}
}