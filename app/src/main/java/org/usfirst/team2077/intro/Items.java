package org.usfirst.team2077.intro;

public class Items {
    private final String[] items;

    public Items(String csvLine) {
        items = csvLine.split(",");
    }

    public String[] items() {
        return items;
    }

    public void printItems() {
        for(String item : items) {
            System.out.println(item);
        }
    }
}
