package com.bulbulhossen.krishibangla.Crop_cultivation.Paddy.Amon_paddy;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.bulbulhossen.krishibangla.Custom_listView_Adapter.ListView_Adapter;
import com.bulbulhossen.krishibangla.R;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class Amon_Paddy_Details extends AppCompatActivity {
    private ListView listView;
    CarouselView carouselView;

    int[] sampleImages = {R.drawable.lalshak, R.drawable.kakrol, R.drawable.potol};

    int image[] = {
            R.drawable.abc_ic_star_black_16dp,
            R.drawable.abc_ic_star_black_16dp,
            R.drawable.abc_ic_star_black_16dp,
            R.drawable.abc_ic_star_black_16dp,
            R.drawable.abc_ic_star_black_16dp,
            R.drawable.abc_ic_star_black_16dp,

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.amon_paddy_problem_details);


        /*        || Transtion Animation Code*/
        getWindow().getAttributes().windowAnimations = R.style.Fade_Transition;


        //Slider ImageView -- carouselView

        carouselView = (CarouselView) findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);

        listView = (ListView) findViewById(R.id.listview);
        String[] str = getResources().getStringArray(R.array.Amon_paddy_List);
        final ListView_Adapter ad = new ListView_Adapter(this, str, image);
        listView.setAdapter(ad);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(Amon_Paddy_Details.this, "" + ad.getItem(position), Toast.LENGTH_SHORT).show();

/*                switch (position) {
                    case 0:
                        intent = new Intent(List_main.this, Details_Class.class);
                        break;
                    case 1:
                        intent = new Intent(List_main.this, Grid_main_Activity.class);
                        break;
                    case 2:
                        intent = new Intent(List_main.this, Button_style_main.class);
                        break;

                }

                startActivity(intent);*/

            }
        });


    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };
}