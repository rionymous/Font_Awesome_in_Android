package com.androidrion.fontawesome;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface fontAwesomeFont = Typeface.createFromAsset(getAssets(), "fa_reguler_400.ttf");
        TextView addressBook = findViewById(R.id.address_book);
        TextView addressCard = findViewById(R.id.address_card);
        TextView angry = findViewById(R.id.angry);
        TextView arrowCircleDown = findViewById(R.id.arrow_alt_circle_down);
        TextView arrowCircleLeft = findViewById(R.id.arrow_alt_circle_left);
        TextView arrowCircleRight = findViewById(R.id.arrow_alt_circle_right);
        TextView arrowCircleUp = findViewById(R.id.arrow_alt_circle_up);
        TextView bell = findViewById(R.id.bell);
        TextView bellSlash = findViewById(R.id.bell_slash);
        TextView bookmark = findViewById(R.id.bookmark);
        TextView building = findViewById(R.id.building);
        TextView calendar = findViewById(R.id.calendar);
        TextView calendarAlt = findViewById(R.id.calendar_alt);
        TextView calendarCheck = findViewById(R.id.calendar_check);
        TextView calendarMinus = findViewById(R.id.calendar_minus);
        TextView calendarPlus = findViewById(R.id.calendar_plus);

        addressBook.setTypeface(fontAwesomeFont);
        addressCard.setTypeface(fontAwesomeFont);
        angry.setTypeface(fontAwesomeFont);
        arrowCircleDown.setTypeface(fontAwesomeFont);
        arrowCircleLeft.setTypeface(fontAwesomeFont);
        arrowCircleRight.setTypeface(fontAwesomeFont);
        arrowCircleUp.setTypeface(fontAwesomeFont);
        bell.setTypeface(fontAwesomeFont);
        bellSlash.setTypeface(fontAwesomeFont);
        bookmark.setTypeface(fontAwesomeFont);
        building.setTypeface(fontAwesomeFont);
        calendar.setTypeface(fontAwesomeFont);
        calendarAlt.setTypeface(fontAwesomeFont);
        calendarCheck.setTypeface(fontAwesomeFont);
        calendarMinus.setTypeface(fontAwesomeFont);
        calendarPlus.setTypeface(fontAwesomeFont);
    }
}
