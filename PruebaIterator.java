package pruebaiterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class PruebaIterator {

    public static void main(String[] args) {
        String[] colores = {"MAGENTA", "ROJO", "BLANCO", "AZUL", "CYAN"};
        List lista = new ArrayList<String>();
        for (String color : colores) {
            lista.add(color);
        }

        String[] eliminarColores = {"ROJO", "BLANCO", "AZUL"};
        List eliminarLista = new ArrayList<String>();
        for (String color : eliminarColores) {
            eliminarLista.add(color);
        }

        imprimeLista(lista);
        eliminarColores(lista, eliminarLista);
        imprimeLista(lista);

    }

    // eliminar de coleccion1 los colores especificados en coleccion2
    public static void eliminarColores(Collection<String> coleccion1,
            Collection<String> coleccion2) {

        Iterator<String> iterador = coleccion1.iterator();
        while (iterador.hasNext()) {
            if (coleccion2.contains(iterador.next())) {
                iterador.remove();
            }
        }

    }
    
    private static void imprimeLista(List lista){
        // imprime en pantalla el contenido de la lista
        System.out.println("ArrayList: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.printf("%s ", lista.get(i));
        }
        System.out.println("");
    }

}
