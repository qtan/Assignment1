package com.example.travelpack;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Add_Items_List extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add__items__list);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add__items__list, menu);
		return true;
	}

}
