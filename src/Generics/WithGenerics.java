package Generics;

import java.util.ArrayList;
import java.util.List;

interface Media {
    void displayInfo();
}

class Book implements Media {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("📘 Book: " + title + " by " + author);
    }
}

class Video implements Media {
    private String title;
    private int duration; // in minutes

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public void displayInfo() {
        System.out.println("🎬 Video: " + title + " (" + duration + " mins)");
    }
}

class Newspaper implements Media {
    private String name;
    private String date;

    public Newspaper(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public void displayInfo() {
        System.out.println("📰 Newspaper: " + name + " [" + date + "]");
    }
}

class GenericLibrary<T extends Media> {
    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public void displayAll() {
        for (T item : items) {
            item.displayInfo();
        }
    }
}


public class WithGenerics {
    public static void main(String[] args) {
        GenericLibrary<Media> library = new GenericLibrary<>();

        library.add(new Book("The Alchemist", "Paulo Coelho"));
        library.add(new Video("Inception", 148));
        library.add(new Newspaper("The Times", "2025-07-31"));

        System.out.println("✅ Displaying items from Generic Library:\n");
        library.displayAll();
    }
}
