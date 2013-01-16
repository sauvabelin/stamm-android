package com.org.bs.stamm;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class StammModeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_stamm_mode);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_home, menu);
		menu.removeItem(R.id.menu_stamm_mode);
		return true;
	}
	
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	Intent intent;
    	
    	switch (item.getItemId()) {
        case R.id.menu_normal_mode:
            intent = new Intent(this, Home.class);
        	break;
        	
        case R.id.menu_settings:
            intent = new Intent(this, SettingsActivity.class);
            break;
            
        case R.id.menu_about:
        	return true;
            
        default:
            return super.onOptionsItemSelected(item);
        }
    	
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    	
        return true;
    }

}
