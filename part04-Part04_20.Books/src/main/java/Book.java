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
   private String title;
   private int pages;
   private int py;

    public Book(String title, int pages, int py) {
        this.title = title;
        this.pages = pages;
        this.py = py;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getPy() {
        return py;
    }

   
}
