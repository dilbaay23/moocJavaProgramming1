/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Book {
    private String author;
    private String title;
    private int page; 

    public Book(String author, String title, int page) {
        this.author = author;
        this.title = title;
        this.page = page;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return title;
    }

    public int getPages() {
        return page;
    }
    public String toString(){
        return author + ", "+ title + ", " + page + " pages";
    }
}

