/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea2;

/**
 *
 * @author Nuria
 */
public class Prueba1 {
     public int[] Prueba1(int ArrayN[]) {

        for (int i = 0; i < ArrayN.length - 1; i++) {
            for (int j = 0; j < ArrayN.length - 1; j++) {
                if (ArrayN[j] > ArrayN[j + 1]) {
                    int temp = ArrayN[j + 1];
                    ArrayN[j + 1] = ArrayN[j];
                    ArrayN[j] = temp;
                }
            }
        }
        return ArrayN;
    }
}
