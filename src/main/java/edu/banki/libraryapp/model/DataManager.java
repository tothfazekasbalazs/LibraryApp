package edu.banki.libraryapp.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DataManager {
    private static final List<Book> books = new ArrayList<>();

    public static void addBook(Book book) {
        books.add(book);
    }

//    public static Map<String, Long> getStock() {
//        Map<String, Long> stock = new HashMap<>();
//
//        for (Book book : books) {
//            stock.put(book.getCategory(), stock.getOrDefault(book.getCategory(), 0L) + 1);
//        }
//
//        return stock;
//    }

//    public static Map<String, Long> getStock() {
//        return books.stream().collect(Collectors.groupingBy(Book::getCategory, Collectors.counting()));
//    }

    public static Map<String, Long> getStock() {
        Map<String, Long> stock = new HashMap<>();
        for (Book book : books) {
            String category = book.getCategory();
            if (stock.containsKey(category)) {
                Long currentCount = stock.get(category);
                stock.put(category, currentCount + 1);
            } else {
                stock.put(category, 1L);
           }
        }
       return stock;
    }

}