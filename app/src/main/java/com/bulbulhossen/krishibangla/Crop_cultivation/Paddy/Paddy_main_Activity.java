package com.bulbulhossen.krishibangla.Crop_cultivation.Paddy;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.bulbulhossen.krishibangla.Crop_cultivation.Paddy.Amon_paddy.Amon_Paddy_Details;
import com.bulbulhossen.krishibangla.Grid_Adapter_MainActivity.GridViewAdapter;
import com.bulbulhossen.krishibangla.Grid_Adapter_MainActivity.Gridview_ImageItem;
import com.bulbulhossen.krishibangla.R;

import java.util.ArrayList;


public class Paddy_main_Activity extends AppCompatActivity {


    Intent i;
    private GridView gridView;
    private GridViewAdapter customGridAdapter;
    ArrayList<Gridview_ImageItem> gridviewImageItems = new ArrayList<Gridview_ImageItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*        || Transtion Animation Code*/
        getWindow().getAttributes().windowAnimations = R.style.Fade_Transition;


        setContentView(R.layout.paddy_main_grid_layout);

        Bitmap one = BitmapFactory.decodeResource(this.getResources(), R.drawable.paddy);
        Bitmap two = BitmapFactory.decodeResource(this.getResources(), R.drawable.paddy);
        Bitmap three = BitmapFactory.decodeResource(this.getResources(), R.drawable.paddy);
        Bitmap four = BitmapFactory.decodeResource(this.getResources(), R.drawable.paddy);
        Bitmap five = BitmapFactory.decodeResource(this.getResources(), R.drawable.paddy);
        Bitmap six = BitmapFactory.decodeResource(this.getResources(), R.drawable.paddy);
        Bitmap seven = BitmapFactory.decodeResource(this.getResources(), R.drawable.paddy);
        Bitmap eight = BitmapFactory.decodeResource(this.getResources(), R.drawable.paddy);
        Bitmap nine = BitmapFactory.decodeResource(this.getResources(), R.drawable.paddy);
        Bitmap ten = BitmapFactory.decodeResource(this.getResources(), R.drawable.paddy);


        gridviewImageItems.add(new Gridview_ImageItem(one, "আমন চাষ"));
        gridviewImageItems.add(new Gridview_ImageItem(two, "গম চাষ" ));
        gridviewImageItems.add(new Gridview_ImageItem(three, "ধান চাষ"));
        gridviewImageItems.add(new Gridview_ImageItem(four, " চাষ"));
        gridviewImageItems.add(new Gridview_ImageItem(five, "আখ"));
        gridviewImageItems.add(new Gridview_ImageItem(six, "বাদাম"));
        gridviewImageItems.add(new Gridview_ImageItem(seven, "পাট"));
        gridviewImageItems.add(new Gridview_ImageItem(eight, "বাদাম"));
        gridviewImageItems.add(new Gridview_ImageItem(nine, "ধান"));
        gridviewImageItems.add(new Gridview_ImageItem(ten, "ধান"));


        gridView = (GridView) findViewById(R.id.gridView);
        customGridAdapter = new GridViewAdapter(this, R.layout.row_grid, gridviewImageItems);
        gridView.setAdapter(customGridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                switch (position) {
                    case 0:
                        i = new Intent(Paddy_main_Activity.this, Amon_Paddy_Details.class);
                        break;
                }

                startActivity(i);
            }

        });

    }

}
