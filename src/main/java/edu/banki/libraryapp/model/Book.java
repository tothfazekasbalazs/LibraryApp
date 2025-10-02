package edu.banki.libraryapp.model;

import java.time.LocalDate;

public class Book {
    private String author, title, category;
    private int year;
    private LocalDate acquisitionDate;

    public Book(String author, String title, String category, int year, LocalDate acquisitionDate) {
        setAuthor(author);
        setTitle(title);
        setCategory(category);
        setYear(year);
        setAcquisitionDate(acquisitionDate);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public LocalDate getAcquisitionDate() {
        return acquisitionDate;
    }

    public void setAcquisitionDate(LocalDate acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    @Override
    public String toString() {
        return "DataManager: \n" +
                " - author='" + getAuthor() +
                " - title='" + getTitle() +
                " - category='" + getCategory() +
                " - year='" + getYear() +
                " - acquisitionDate=" + getAcquisitionDate();
    }
}
