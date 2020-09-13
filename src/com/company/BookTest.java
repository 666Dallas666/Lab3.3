package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BookTest {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите автора:");
        String author = reader.readLine();
        System.out.println("Ведите название:");
        String name = reader.readLine();
        System.out.println("Ведите год:");
        String year = reader.readLine();
        int year1 = Integer.parseInt(year);
        Book Test = new Book(author,name, year1);
        Test.setAuthor(author);
        Test.setName(name);
        Test.setYear(year1);
        System.out.println("Автор: " + Test.getAuthor());
        System.out.println("Название: " + Test.getName());
        System.out.println("Год: " + Test.getYear());
    }
}

