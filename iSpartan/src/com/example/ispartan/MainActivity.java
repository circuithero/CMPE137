package com.example.ispartan;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      
    	final int visible = 0;
    	final int invisible = 8;
    	
    	final LinearLayout mainScreen = (LinearLayout) findViewById(R.id.LinearLayoutMain);
    	final LinearLayout recommendScreen = (LinearLayout) findViewById(R.id.LinearLayoutRecommendation);
    	final LinearLayout alertScreen = (LinearLayout) findViewById(R.id.LinearLayoutAlert);
    	final LinearLayout updateDialog = (LinearLayout) findViewById(R.id.updateStatusDialog);
    	
    	final Button startButton = (Button) findViewById(R.id.startButton);
    	final Button makeRecButton = (Button) findViewById(R.id.makeRecButton);
    	final Button submitRecButton = (Button) findViewById(R.id.button10);
    	final Button alertButton = (Button) findViewById(R.id.button1);
    	final Button submitAlertButton = (Button) findViewById(R.id.alertButton);
    	final Button updateButton = (Button) findViewById(R.id.button2);
    	final Button submitStatusButton = (Button) findViewById(R.id.submitStatus);
    	
    	final TextView status = (TextView) findViewById(R.id.statusTextView);
    	final EditText recAdrText = (EditText) findViewById(R.id.editText1);
    	final EditText recText = (EditText) findViewById(R.id.editText2);
    	final EditText alertAdrText = (EditText) findViewById(R.id.editText3);
    	final EditText alertText = (EditText) findViewById(R.id.editText4);
    	final EditText recView = (EditText) findViewById(R.id.recommendationEditText);
    	final EditText alertView = (EditText) findViewById(R.id.alertEditText);
    	final EditText statusDialog = (EditText) findViewById(R.id.statusDialog);
    	
    	startButton.setOnClickListener(new View.OnClickListener() {
            
            public void clear() {
            	mainScreen.setVisibility(invisible);
            	recommendScreen.setVisibility(invisible);
            	alertScreen.setVisibility(invisible);
            	recAdrText.setText(""); //reset textView
            	recText.setText(""); //reset textView
            	alertAdrText.setText(""); //reset textView
            	alertText.setText(""); //reset textView
            	statusDialog.setText(""); //reset textView
            }
    		
			@Override
			public void onClick(View v) {
				startButton.setVisibility(invisible);
				mainScreen.setVisibility(visible);
				
				/** Called when the user clicks the Make Recommendation button */
	            makeRecButton.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						clear();
	            		recommendScreen.setVisibility(visible);
					}
				});
	            
	            /** Called when the user clicks the Submit Recommendation button */
	            submitRecButton.setOnClickListener(new View.OnClickListener() {
					
					private String recMessages = "";

					@Override
					public void onClick(View v) {
		            	recMessages  += recText.getText().toString() + "\n\n";
		            	recView.setText(recMessages);
		            	clear();
		            	mainScreen.setVisibility(visible);
					}
				});
	            
	            /** Called when the user clicks the Add Alert button */
	            alertButton.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						clear();
		            	alertScreen.setVisibility(visible);
					}
				});
	            
	            /** Called when the user clicks the Submit Alert Button */
	            submitAlertButton.setOnClickListener(new View.OnClickListener() {
					
					private String alertMessages = "";

					@Override
					public void onClick(View v) {
						alertMessages += alertText.getText().toString() + " @"
								+ alertAdrText.getText().toString() + "\n\n";
						alertView.setText(alertMessages);
						clear();
						mainScreen.setVisibility(visible);
					}
				});
	            
	            /** Called when the user clicks the Update Status Button */
	            updateButton.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						clear();
						updateDialog.setVisibility(visible);
					}
				});
	            
	            /** Called when the user clicks the Update Dialog Button */
	            submitStatusButton.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						status.setText(statusDialog.getText().toString());
						updateDialog.setVisibility(invisible);
						mainScreen.setVisibility(visible);
					}
				});
			}
		});
    }
}
