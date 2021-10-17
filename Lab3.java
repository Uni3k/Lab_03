/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author w64204
*/
public class Lab3 {

 int suma(int[] liczby){
    return 0;
 }
    public static void main(String[] args) {
        int[] tab = { 1, 2,10};
       
        int max = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max)
                max = tab[i];
            
        }
        System.out.println("Najwieksza liczba w tablicy to: "+max);
    }
}