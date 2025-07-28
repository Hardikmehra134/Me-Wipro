package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CD implements Comparable<CD> {
    private String title;
    private String singer;

    public CD(String title, String singer) {
        this.title = title;
        this.singer = singer;
    }
    public String getTitle() {
        return title;
    }
    public String getSinger() {
        return singer;
    }
    public void display() {
        System.out.println("Title: " + title + " | Singer: " + singer);
    }

    @Override
    public int compareTo(CD other) {
        return this.singer.compareToIgnoreCase(other.singer);
    }
}

public class Problem40 {
    public static void main(String[] args) {
        List<CD> cdList = new ArrayList<>();
        cdList.add(new CD("Saphire", "Ed Sheeran"));
        cdList.add(new CD("Rooh", "Adnan Dhool"));
        cdList.add(new CD("Millionare", "Honey Singh"));
        cdList.add(new CD("Supreme", "Shubh"));

        System.out.println("CDs Before Sorting:\n");
        for (CD cd : cdList) {
            cd.display();
        }
        Collections.sort(cdList);

        System.out.println("\n CDs After Sorting by Singer Name:\n");
        for (CD cd : cdList) {
            cd.display();
        }
    }
}

/*
CDs Before Sorting:

Title: Saphire | Singer: Ed Sheeran
Title: Rooh | Singer: Adnan Dhool
Title: Millionare | Singer: Honey Singh
Title: Supreme | Singer: Shubh

 CDs After Sorting by Singer Name:

Title: Rooh | Singer: Adnan Dhool
Title: Saphire | Singer: Ed Sheeran
Title: Millionare | Singer: Honey Singh
Title: Supreme | Singer: Shubh

 */
 
