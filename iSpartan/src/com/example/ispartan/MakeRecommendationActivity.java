package com.example.ispartan;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MakeRecommendationActivity extends Activity {
	ArrayList<String> recommendations = new ArrayList<String>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_recommendation);
	}
	
	/** Called when the user clicks the Submit Recommendation button */
    public void submitRecommendation(View view) {
    	Intent intent = new Intent(this, MainActivity.class);
    	TextView recommendationText = (TextView) findViewById(R.id.editText2);
    	String message = recommendationText.toString() + "\n\n";
    	recommendations.add(message);
    	intent.putExtra("recommendations", recommendations);
    	intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    	intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    	startActivity(intent);
    }
}
