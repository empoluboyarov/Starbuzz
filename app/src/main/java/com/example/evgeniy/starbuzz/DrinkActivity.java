package com.example.evgeniy.starbuzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_DRINKNO = "drinkNo";
    int drinkNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        drinkNo = (Integer)getIntent().getExtras().getInt(EXTRA_DRINKNO);
        Drink drink = Drink.drinks[drinkNo];

        ImageView photo = (ImageView)findViewById(R.id.photo);
        TextView name = (TextView)findViewById(R.id.name);
        TextView description = (TextView) findViewById(R.id.description);

        name.setText(drink.getName());
        description.setText(drink.getDescription());
        photo.setImageResource(drink.getImageResourceID());
        photo.setContentDescription(drink.getName());
    }
}
