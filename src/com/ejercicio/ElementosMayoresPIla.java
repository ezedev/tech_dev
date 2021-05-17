package com.ejercicio;

import java.util.Stack;

public class ElementosMayoresPIla {

    public static void elementosMayoresPila(int[] entrada) {
        Stack<Integer> pila = new Stack<Integer>();
        int primerELemento = entrada[0];
        int tamañoEntrada = entrada.length;
        //introduzco el primer elemento de la entrada en la lista
        pila.push(primerELemento);
        //en esta parte utilizo la pila para poder quedarme con los que no tienen mayor siguiente
        //en el segundo while se van a imprimir los que si tienen mayor
        int contador = 1;
        while (contador < tamañoEntrada) {
            while (!pila.isEmpty() && pila.peek() < entrada[contador]) {
                System.out.println(pila.pop() + " --> " + entrada[contador]);
            }
            //agrego a la pila el que no tiene mayor
            pila.push(entrada[contador]);
            contador++;
        }
        //en este while lo que hago es imprimir con -1 los que quedaron huerfanos de mayor a la derecha
        while (!pila.isEmpty()) {
            int tope = (int) pila.pop();
            System.out.println(tope + " -->" + -1);
        }
    }
}