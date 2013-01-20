package com.org.bs.stamm;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StammModeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_stamm_mode);
		
        // populate list with our news titles
//        setListAdapter(new ArrayAdapter<String>(getActivity(),
//                android.R.layout.simple_list_item_1, Mocks.getInstance().getEventsTitles()));
		
		String function = PreferenceManager.getDefaultSharedPreferences(this).getString("pref_function", "toutes");
        String branch = PreferenceManager.getDefaultSharedPreferences(this).getString("pref_branche", "toutes");
        
		
		ListView newsList = (ListView) findViewById(R.id.stamm_news_list);
        newsList.setAdapter(
        		new ArrayAdapter<String>(
        				this,
        				android.R.layout.simple_list_item_1, Mocks.getInstance().getNewsTitles(function, branch)
        		)
        );
        newsList.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
	            Intent intent = new Intent();
	            intent.setClass(parent.getContext(), NewsDetailsActivity.class);
	            intent.putExtra("index", position);
	            startActivity(intent);
			}
        	
		});
        
		ListView eventsList = (ListView) findViewById(R.id.stamm_events_list);
		eventsList.setAdapter(
        		new ArrayAdapter<String>(
        				this,
        				android.R.layout.simple_list_item_1, Mocks.getInstance().getEventsTitles()
        		)
        );
		eventsList.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
	            Intent intent = new Intent();
	            intent.setClass(parent.getContext(), EventDetailsActivity.class);
	            intent.putExtra("index", position);
	            startActivity(intent);
			}
        	
		});
//		ListView tasksList = (ListView) findViewById(R.id.stamm_news_list);
//        newsList.setAdapter(
//        		new ArrayAdapter<String>(
//        				this,
//        				android.R.layout.simple_list_item_1, Mocks.getInstance().getNewsTitles()
//        		)
//        );
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
            intent.putExtra("firstRun", false);
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
