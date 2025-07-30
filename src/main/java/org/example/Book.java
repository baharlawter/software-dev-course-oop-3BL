package org.example;

public class Book extends LibraryItem {
    protected int pageCount;

    public Book(String title, String author, int year, int pageCount) {
        super(title,author, year);
        this.pageCount = pageCount;
    }

    public void readBook() {
        System.out.println(title + " by " + author);
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author + " (" + year + ") - " + pageCount + " pages";}

    }
