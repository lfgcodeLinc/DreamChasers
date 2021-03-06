package com.degreesmatter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {

	Context _context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        _context=this.getApplicationContext();
        setContentView(R.layout.activity_main);
        
        final Button button = (Button) findViewById(R.id.begin);
        button.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent myintent= new Intent(_context,com.degreesmatter.SearchActivity.class);
	        	startActivity(myintent);
				// TODO Auto-generated method stub
				
			}
 	
                // Perform action on click
        });
        	}
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        if (id==R.id.begin){
        	Intent myintent= new Intent(_context,com.degreesmatter.SearchActivity.class);
        	startActivity(myintent);
        	return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
