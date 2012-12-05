package com.example.ispartan;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    /** Called when the user clicks the Update button */
    public void updateStatus(View view) {
    	TextView status = (TextView) findViewById(R.id.statusTextView);
    	status.setText("Updated!\nNextline");
    }
    
    /** Called when the user clicks the Make Recommendation button */
    public void makeRecommendation(View view) {
    	Intent intent = new Intent(this, MakeRecommendationActivity.class);
    	startActivity(intent);
    }
    
    public void updateRecommendations() {
    	Intent recIntent = getIntent();
    	ArrayList<String> recArr = recIntent.getStringArrayListExtra("recommendations");
    	String recommendations = "";
    	for (String rec : recArr) {
    		recommendations += rec;
    	}
    	EditText recView = (EditText) findViewById(R.id.recommendationEditText);
    	recView.setText(recommendations);
    }
    
    /** Called when the user clicks the Add Alert button */
    public void makeAlert(View view) {
    	Intent intent = new Intent(this, MakeAlertActivity.class);
    	startActivity(intent);
    }
    
}
