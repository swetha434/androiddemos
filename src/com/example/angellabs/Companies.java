package com.example.angellabs;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
 
public class Companies extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 
        //TextView textview = new TextView(this);
        //textview.setText("This is Companies tab");
        setContentView(R.layout.companies);
    }
}