package Generics;

import java.util.ArrayList;

class NonGenericLibrary {
    private ArrayList mediaList = new ArrayList();

    public void add(Object item) {
        mediaList.add(item);
    }

    public void displayAll() {
        for (Object obj : mediaList) {
            if (obj instanceof Media) {
                ((Media) obj).displayInfo();
            } else {
                System.out.println("❌ Unknown media type.");
            }
        }
    }
}

public class NoGenerics {
    public static void main(String[] args) {
        NonGenericLibrary library = new NonGenericLibrary();

        library.add(new Book("Ikagai","Self-Imrpove"));
        library.add(new Video("John-Wick", 169));
        library.add(new Newspaper("Hindustan Times", "2025-07-25"));

        System.out.println("\n✅ Displaying items from Non-Generic Library:\n");
        library.displayAll();
    }
}

/*

✅ Displaying items from Non-Generic Library:

📘 Book: Ikagai by Self-Imrpove
🎬 Video: John-Wick (169 mins)
📰 Newspaper: Hindustan Times [2025-07-25]
*/