/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e2709;

import java.util.Arrays;

public class E1 {
   
    public static void main(String[] args){
        
        int [] [] matriz = new int [10][10];
        int f=0;
        int j=0;
        int suma1 = 0;
        int suma2 = 0;
        int b = 1;
        for (f=0 ; f < matriz.length; f++){
            for (j=0; j < matriz.length; j++){
           
                matriz[f][j]=(int) (Math.random()*100+1);
            }
        }
        for (j=0 ; j < matriz.length; j++){
            for (f = 0 ; f < matriz.length; f++){
                if (f+j==matriz.length-1){
                    suma2 = suma2+matriz[f][j];
                }
            }
        }
        for (j=0; j < matriz.length ; j++){
            suma1 = suma1+matriz[j][j];
        }
        for (f=0 ; f< matriz.length; f++){
            System.out.println(Arrays.toString(matriz[f]));
        }
        System.out.println("================================================");
        System.out.println("La suma de la diagonal principal es: " + suma1);
        System.out.println("La suma de la diagonal secundaria es: " + suma2);
    }
}
