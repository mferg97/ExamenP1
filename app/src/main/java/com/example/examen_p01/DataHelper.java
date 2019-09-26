package com.example.examen_p01;

import java.util.ArrayList;

public class DataHelper {

    public static ArrayList<ListViewItem> provideItems() {
        ArrayList<ListViewItem> list = new ArrayList<>();

        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, "Holo blue bright", android.R.color.holo_blue_bright));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, "Holo blue light",  android.R.color.holo_blue_light));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, "Holo green light", android.R.color.holo_green_light));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, "Holo orange light",android.R.color.holo_orange_light));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, "Holo red light", android.R.color.holo_red_light));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, "Holo purple",  android.R.color.holo_purple));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, "Holo blue dark", android.R.color.holo_blue_dark));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, "Holo green dark", android.R.color.holo_green_dark));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, "Holo red dark", android.R.color.holo_red_dark));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, "Holo orange dark", android.R.color.holo_orange_dark));


        return list;
    }

}
