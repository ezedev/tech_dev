package com.ejercicio;

public class ElementosMayores {

    public static void elementosMayores(int[] entrada) {
        //utilizo un array auxiliar con los mismos valores para no confundir.
        int[] auxiliar = entrada;
        //basicamente lo que hago es preguntar si el elemento actual mayor al elemento que empece en el primer bucle
        //si es mayor, pasa a ser el elemento mayor y sale del segundo for , y entonces imprime de quien es el elemento mayor
        for (int i = 0; i < entrada.length; i++) {
            int elementoMayor = -1;
            for (int j = i + 1; j < auxiliar.length; j++) {
                if (auxiliar[j] > entrada[i]) {
                    elementoMayor = auxiliar[j];
                    break;
                }
            }
            //aca imprime de quien es el numero mayor
            System.out.println(entrada[i] + " --> " + elementoMayor);
        }
    }
}
