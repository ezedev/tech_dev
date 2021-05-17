package com.ejercicio;

import static com.ejercicio.ElementosMayores.elementosMayores;
import static com.ejercicio.ElementosMayoresPIla.elementosMayoresPila;

public class Main {
    public static void main(String args[]) {
        int[] ejemplo = {13, 7, 6, 12};
        elementosMayores(ejemplo);
        System.out.println("-----------utilizando una pila--------------------");
        elementosMayoresPila(ejemplo);
    }
}