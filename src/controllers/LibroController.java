package controllers;

import java.util.*;

import models.Book;

public class LibroController {

    public Map<Book, Book> procesarLibros(List<Book> libros) {
        Comparator<Book> comparator = Comparator
                .comparing(Book::getTitulo, Comparator.reverseOrder())
                .thenComparing(Book::getAnio);

        Set<Book> ordenados = new TreeSet<>(comparator);
        ordenados.addAll(libros);

        Map<Book, Book> resultado = new LinkedHashMap<>();
        for (Book libro : ordenados) {
            resultado.put(libro, libro);
        }

        return resultado;
    }
}
