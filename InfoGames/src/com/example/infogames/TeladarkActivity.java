package com.example.infogames;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TeladarkActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teladark);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.teladark, menu);
        return true;
    }
    
}
