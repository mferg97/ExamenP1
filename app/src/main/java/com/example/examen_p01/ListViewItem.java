package com.example.examen_p01;

public class ListViewItem {

    private int imageResource;
    private String title;
    private int ColorId;

    public ListViewItem(int imageResource, String title, int color) {
        this.imageResource = imageResource;
        this.title = title;
        ColorId = color;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public int getColorId() {
        return ColorId;
    }

}
