/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.paola;

/**
 *
 * @author pao
 */
public class Paola {

    public static void main(String[] args) {
        System.out.println("Hel");
        
        Persona person[] = new Persona[3];
        
        person[0] = new Persona(20, "Spfia", "1111111"); 
        person[1] = new Persona(20, "Spfia", "2222222");
        person[2] = new Persona(20, "Spfia", "3333333");

                
        for (Persona item : person) {
            System.out.println("Mi nombre es: " + item.getNombre());
        }
    }
}
