package com.example.examen_p01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    View View1;
    SeekBar seekBar;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);
        final ClaseAdapter adapter = new ClaseAdapter(DataHelper.provideItems());
        listView.setAdapter(adapter);

        textView = findViewById(R.id.textView);
        View1 = findViewById(R.id.View1);
        seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                textView.setText("Alpha:" + i + "%");
                float Alpha = i/100f;
                View1.setAlpha(Alpha);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view2, int i, long l) {
                View1.setBackgroundColor(ContextCompat.getColor(view2.getContext(), adapter.getItem(i).getColorId()));
            }
        });


    }
}
