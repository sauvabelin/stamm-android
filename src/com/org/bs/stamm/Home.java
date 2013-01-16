package com.org.bs.stamm;

import java.util.Calendar;
import java.util.Locale;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;


public class Home extends FragmentActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link android.support.v4.app.FragmentPagerAdapter} derivative, which
     * will keep every loaded fragment in memory. If this becomes too memory
     * intensive, it may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    ViewPager mViewPager;
    
    private static final int NUMBER_PAGES = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        Mocks.initInstance();
        
        Calendar c = Calendar.getInstance();
        
        if(c.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY && c.get(Calendar.HOUR_OF_DAY) > 18 && c.get(Calendar.HOUR_OF_DAY) < 22 ) {
        	Intent intent = new Intent(this, StammModeActivity.class);
        	intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        } else {
	        setContentView(R.layout.activity_home);
	        
	        // Create the adapter that will return a fragment for each of the three
	        // primary sections of the app.
	        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
	        
	        // Set up the ViewPager with the sections adapter.
	        mViewPager = (ViewPager) findViewById(R.id.pager);
	        mViewPager.setAdapter(mSectionsPagerAdapter);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	
        // Inflate the menu; this adds items to the action bar if it is present.
    	getMenuInflater().inflate(R.menu.activity_home, menu);
		menu.removeItem(R.id.menu_normal_mode);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	Intent intent;
    	
    	switch (item.getItemId()) {
        case R.id.menu_stamm_mode:
            intent = new Intent(this, StammModeActivity.class);
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
    
    

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
        	Fragment fragment;
            Bundle args = new Bundle();
        	
            switch (position) {
            case 0:
            	fragment = new EventsListFragment();
                break;
               
            default:
            case 1:
            	fragment = new NewsListFragment();
            	break;
            
            case 2:
            	fragment = new ActivitiesMapFragment();
            	break;
            	
            case 3:
            	fragment = new FilesFragment();
            	break;

            }
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public int getCount() {
            return NUMBER_PAGES;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            
        	switch (position) {
                case 0:
                    return getString(R.string.title_section_agenda).toUpperCase(Locale.getDefault());
                case 1:
                    return getString(R.string.title_section_news).toUpperCase(Locale.getDefault());
                case 2:
                    return getString(R.string.title_section_map).toUpperCase(Locale.getDefault());
                case 3:
                    return getString(R.string.title_section_files).toUpperCase(Locale.getDefault());
            }
            return null;
        }
    }
}


