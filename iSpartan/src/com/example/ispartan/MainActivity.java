package com.example.ispartan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    /** Called when the user clicks the Make Recommendation button */
    public void makeRecommendation(View view) {
    	Intent intent = new Intent(this, makeRecommendation.class);
    	startActivity(intent);
    }
    
}
