package edu.banki.libraryapp.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Map;

public class DataManagerTest {

    @Test
    void testStockMultipleCategory() {
        //Arrange

        Book book1 = new Book("Author1","Title1","Fiction",2001, LocalDate.now());
        Book book2 = new Book("Author3","Title2","Fiction",2002, LocalDate.now());
        Book book3 = new Book("Author3","Title3","Szép Irodalom",2003, LocalDate.now());
        Book book4 = new Book("Author4","Title4","Tudomany",2004, LocalDate.now());
        Book book5 = new Book("Author5","Title5","Nyelvkönyv",2005, LocalDate.now());

        DataManager.addBook(book1);
        DataManager.addBook(book2);
        DataManager.addBook(book3);
        DataManager.addBook(book4);
        DataManager.addBook(book5);

        //ACT

        Map<String, Long> stock = DataManager.getStock();

        //ASSERT

        Assertions.assertEquals(2L,stock.get("Fiction"),"1");
        Assertions.assertEquals(1L,stock.get("Szép Irodalom"),"2");
        Assertions.assertEquals(1L,stock.get("Tudomany"),"3");
        Assertions.assertEquals(4, stock.size(),"4");

    }

}
