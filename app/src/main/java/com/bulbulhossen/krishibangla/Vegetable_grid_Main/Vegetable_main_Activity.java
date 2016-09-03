package com.bulbulhossen.krishibangla.Vegetable_grid_Main;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.bulbulhossen.krishibangla.Crop_cultivation.Paddy.Amon_paddy.Amon_Paddy_Details;
import com.bulbulhossen.krishibangla.Crop_cultivation.Paddy.Boro_Paddy.Boro_Paddy_Details;
import com.bulbulhossen.krishibangla.Grid_Adapter_MainActivity.GridViewAdapter;
import com.bulbulhossen.krishibangla.Grid_Adapter_MainActivity.Gridview_ImageItem;
import com.bulbulhossen.krishibangla.R;

import java.util.ArrayList;


public class Vegetable_main_Activity extends AppCompatActivity {


    Intent i;
    private GridView gridView;
    private GridViewAdapter customGridAdapter;
    ArrayList<Gridview_ImageItem> gridviewImageItems = new ArrayList<Gridview_ImageItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*        || Transtion Animation Code*/
        getWindow().getAttributes().windowAnimations = R.style.Fade_Transition;


        setContentView(R.layout.vegetable_main_activity);

        Bitmap one = BitmapFactory.decodeResource(this.getResources(), R.drawable.lalshak);
        Bitmap two = BitmapFactory.decodeResource(this.getResources(), R.drawable.lau);
        Bitmap three = BitmapFactory.decodeResource(this.getResources(), R.drawable.kakrol);
        Bitmap four = BitmapFactory.decodeResource(this.getResources(), R.drawable.korola);
        Bitmap five = BitmapFactory.decodeResource(this.getResources(), R.drawable.potol);
        Bitmap six = BitmapFactory.decodeResource(this.getResources(), R.drawable.lalshak);
        Bitmap seven = BitmapFactory.decodeResource(this.getResources(), R.drawable.lau);
        Bitmap eight = BitmapFactory.decodeResource(this.getResources(), R.drawable.korola);
        Bitmap nine = BitmapFactory.decodeResource(this.getResources(), R.drawable.kakrol);
        Bitmap ten = BitmapFactory.decodeResource(this.getResources(), R.drawable.lalshak);


        gridviewImageItems.add(new Gridview_ImageItem(one, "লাল শাক"));
        gridviewImageItems.add(new Gridview_ImageItem(two, "লাউ" ));
        gridviewImageItems.add(new Gridview_ImageItem(three, "কাঁকরোল"));
        gridviewImageItems.add(new Gridview_ImageItem(four, "করলা"));
        gridviewImageItems.add(new Gridview_ImageItem(five, "পটল"));
        gridviewImageItems.add(new Gridview_ImageItem(six, "লাল শাক"));
        gridviewImageItems.add(new Gridview_ImageItem(seven, "লাউ"));
        gridviewImageItems.add(new Gridview_ImageItem(eight, "করলা"));
        gridviewImageItems.add(new Gridview_ImageItem(nine, "কাঁকরোল"));
        gridviewImageItems.add(new Gridview_ImageItem(ten, "লাল শাক"));


        gridView = (GridView) findViewById(R.id.gridView);
        customGridAdapter = new GridViewAdapter(this, R.layout.row_grid, gridviewImageItems);
        gridView.setAdapter(customGridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                switch (position) {
                    case 0:
                        i = new Intent(Vegetable_main_Activity.this, Amon_Paddy_Details.class);
                        break;
                    case 1:
                        i = new Intent(Vegetable_main_Activity.this, Boro_Paddy_Details.class);
                        break;
                }

                startActivity(i);
            }

        });

    }

}
