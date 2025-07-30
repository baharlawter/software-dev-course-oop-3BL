package org.example;

public class LibraryItem {
    //attributes
    protected String title;
    protected int year;
    protected String author;
    //methods
    protected LibraryItem(String title, String author, int year){
        this.title=title;
        this.year=year;
        this.author=author;
    }
     public String toString(){
        return "Item "+title+"by "+author+"year"+year;
    }
     public String getTitle (){return title;

    }
    public int  getYear(){ return year; };
    public String getAuthor(){return author;}
}
