package com.bulbulhossen.krishibangla.Grid_Adapter_MainActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.bulbulhossen.krishibangla.R;
import com.bulbulhossen.krishibangla.Vegetable_grid_Main.Vegetable_main_Activity;

import java.util.ArrayList;


public class Grid_main_Activity extends AppCompatActivity {


    Intent i;
    private GridView gridView;
    private GridViewAdapter customGridAdapter;
    ArrayList<Gridview_ImageItem> gridviewImageItems = new ArrayList<Gridview_ImageItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

/*        || Transtion Animation Code*/
        getWindow().getAttributes().windowAnimations = R.style.Fade_Transition;


        setContentView(R.layout.grid_main_layout);

        Bitmap one = BitmapFactory.decodeResource(this.getResources(), R.drawable.vegetable_grid);
        Bitmap two = BitmapFactory.decodeResource(this.getResources(), R.drawable.fish_grid_main);
        Bitmap three = BitmapFactory.decodeResource(this.getResources(), R.drawable.vegetable_grid);
        Bitmap four = BitmapFactory.decodeResource(this.getResources(), R.drawable.furit_grid_main);
        Bitmap five = BitmapFactory.decodeResource(this.getResources(), R.drawable.fusol_grid_main);
        Bitmap six = BitmapFactory.decodeResource(this.getResources(), R.drawable.fish_grid_main);
        Bitmap seven = BitmapFactory.decodeResource(this.getResources(), R.drawable.fish_grid_main);
        Bitmap eight = BitmapFactory.decodeResource(this.getResources(), R.drawable.vegetable_grid);
        Bitmap nine = BitmapFactory.decodeResource(this.getResources(), R.drawable.fish_grid_main);
        Bitmap ten = BitmapFactory.decodeResource(this.getResources(), R.drawable.furit_grid_main);



        gridviewImageItems.add(new Gridview_ImageItem(one, "সবজি চাষ"));
        gridviewImageItems.add(new Gridview_ImageItem(two, "মৎস্য চাষ"));
        gridviewImageItems.add(new Gridview_ImageItem(three, " সবজি চাষ"));
        gridviewImageItems.add(new Gridview_ImageItem(four, "ফল চাষ"));
        gridviewImageItems.add(new Gridview_ImageItem(five, "আখ"));
        gridviewImageItems.add(new Gridview_ImageItem(six, "বাদাম"));

        gridviewImageItems.add(new Gridview_ImageItem(seven, "পাট"));
        gridviewImageItems.add(new Gridview_ImageItem(eight, "বাদাম"));
        gridviewImageItems.add(new Gridview_ImageItem(nine, "পাট"));
        gridviewImageItems.add(new Gridview_ImageItem(ten, "বাদাম"));



        gridView = (GridView) findViewById(R.id.gridView);
        customGridAdapter = new GridViewAdapter(this, R.layout.row_grid, gridviewImageItems);
        gridView.setAdapter(customGridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                switch (position) {
                    case 0:
                        i = new Intent(Grid_main_Activity.this, Vegetable_main_Activity.class);
                        break;
                }

                startActivity(i);
            }

        });

    }


}
