package com.example.hernanlopez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hernanlopez.proyecto.MainActivity;
import com.example.hernanlopez.proyecto.R;

public class HomeActivity extends AppCompatActivity {


	Button historyButton = null;
	Button analyzeButton = null;
	Button pinnedButton = null;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

		historyButton = (Button) findViewById(R.id.historyButton);
		analyzeButton = (Button) findViewById(R.id.analyzeButton);
		pinnedButton = (Button) findViewById(R.id.pinnedButton);

		analyzeButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

			startActivity(new Intent(HomeActivity.this, MainActivity.class));
			}
		});




	}
}