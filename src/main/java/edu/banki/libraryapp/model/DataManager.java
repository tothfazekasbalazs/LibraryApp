package edu.banki.libraryapp.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataManager {
    private static final List<Book> books = new ArrayList<>();

    public static void addBook(Book book) {
        books.add(book);
    }

    public static Map<String, Long> getStock() {
        Map<String, Long> stock = new HashMap<>();

        for (Book book : books) {
            stock.put(book.getCategory(), stock.getOrDefault(book.getCategory(), 0L) + 1);
        }

        return stock;
    }

}
