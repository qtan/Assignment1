package com.example.travelpack;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Expense_items extends Activity {
	private Button addButton;
	private Button editButton;
	private Button deleteButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_expense_items);
		addButton = (Button)findViewById(R.id.addButton);
		addButton.setOnClickListener(listener);
		editButton = (Button)findViewById(R.id.editButton);
		editButton.setOnClickListener(listener);
		deleteButton = (Button)findViewById(R.id.deleteButton);
		deleteButton.setOnClickListener(listener);
	}
	private View.OnClickListener listener = new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Button button= (Button)v;
			switch (button.getId()){
			case R.id.addButton:
				Intent Expense_item =new Intent();
				Expense_item.setClass(Expense_items.this,Add_Items_List.class);
				Expense_items.this.startActivity(Expense_item);
			case R.id.deleteButton:
				
			}
			
				
				
		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.expense_items, menu);
		return true;
	}

}
