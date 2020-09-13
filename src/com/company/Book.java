package com.company;
public class Book{
    String author;
    String name;
    int year;
    Book(String автор, String имя, int год){
        author = автор;
        name = имя;
        year = год;
    }
    public void setAuthor(String автор){
        author = автор;
    }
    public void setName(String имя){
        name = имя;
    }
    public void setYear(int год){
        year = год;
    }
    public String getAuthor(){
        return author;
    }
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }
}
